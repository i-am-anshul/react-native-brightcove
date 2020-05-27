package com.rnbrightcoveplayer;

import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.core.view.ViewCompat;

import com.brightcove.player.edge.Catalog;
import com.brightcove.player.edge.VideoListener;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BrightcoveExoPlayerVideoView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class RNBrightcovePlayerView extends FrameLayout {

    private BrightcoveExoPlayerVideoView playerVideoView;
    private static RNBrightcovePlayerView brightCovePlayer = null;
    private String policyKey;
    private String accountId;
    private String videoId;
    private ThemedReactContext themedReactContext;
    private BrightcoveMediaController mediaController;


    public RNBrightcovePlayerView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.themedReactContext = themedReactContext;
        this.setBackgroundColor(Color.BLACK);

        this.playerVideoView = new BrightcoveExoPlayerVideoView(this.themedReactContext);
        this.addView(this.playerVideoView);
        this.playerVideoView.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        this.playerVideoView.finishInitialization();
        this.mediaController = new BrightcoveMediaController(this.playerVideoView);
        this.playerVideoView.setMediaController(this.mediaController);
        this.requestLayout();
        ViewCompat.setTranslationZ(this, 9999);
    }


    public void setPolicyKey(String policyKey) {
        this.policyKey = policyKey;
        playVideo();
    }

    private void playVideo() {
        if (brightCovePlayer != null && accountId != null && policyKey != null) {

            Catalog catalog = new Catalog(playerVideoView.getEventEmitter(), accountId, policyKey);

            VideoListener listener = new VideoListener() {
                @Override
                public void onVideo(Video video) {
                    playerVideoView.clear();
                    playerVideoView.add(video);
                    playerVideoView.start();
                }
            };

            catalog.findVideoByID(videoId,listener);


        }
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
        playVideo();
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
        playVideo();
    }



    public static synchronized RNBrightcovePlayerView getInstance(ThemedReactContext context) {
        if (brightCovePlayer == null)
            brightCovePlayer = new RNBrightcovePlayerView(context);
        return brightCovePlayer;
    }


}

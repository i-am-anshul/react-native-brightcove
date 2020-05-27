package com.rnbrightcoveplayer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;


public class RNBrightcovePlayerManager extends SimpleViewManager<RNBrightcovePlayerView> {

    public static final String REACT_CLASS = "RNBrightcovePlayer";

    private ThemedReactContext themedReactContext;
    private static ReactApplicationContext applicationContext;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    public RNBrightcovePlayerManager(ReactApplicationContext reactApplicationContext) {
        this.applicationContext = reactApplicationContext;
    }

    @Override
    public RNBrightcovePlayerView createViewInstance(ThemedReactContext themedReactContext) {
        this.themedReactContext = themedReactContext;
        RNBrightcovePlayerView brightCovePlayerView = RNBrightcovePlayerView.getInstance(themedReactContext);
        return brightCovePlayerView;
    }


    @ReactProp(name = "policyKey")
    public void setPolicyKey(RNBrightcovePlayerView view, String policyKey) {

        view = RNBrightcovePlayerView.getInstance(themedReactContext);
        view.setPolicyKey(policyKey);
    }

    @ReactProp(name = "accountId")
    public void setAccountId(RNBrightcovePlayerView view, String accountId) {

        view = RNBrightcovePlayerView.getInstance(themedReactContext);
        view.setAccountId(accountId);
    }

    @ReactProp(name = "videoId")
    public void setVideoId(RNBrightcovePlayerView view, String videoId) {
        view = RNBrightcovePlayerView.getInstance(themedReactContext);
        view.setVideoId(videoId);
    }


}
import React from 'react';
import {RNBrightcovePlayer} from '../../native-modules/RNBrightCovePlayer';
import {stringConstants} from '../../util/constants';
import { requireNativeComponent,View } from 'react-native';

export const CustomVideoPlayer = (props) => {
  const {BCOV_POLICY_KEY, ACCOUNT_ID, VIDEO_ID} = stringConstants;

  return (
    <View style={{flex: 1, backgroundColor: 'pink'}}>
      <RNBrightcovePlayer
      style={{width: 600, height: 200}}
      {...props}
        policyKey={BCOV_POLICY_KEY}
        accountId={ACCOUNT_ID}
        videoId={VIDEO_ID}
      />
    </View>
  );
};

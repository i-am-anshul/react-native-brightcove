import React from 'react';
import {View} from 'react-native';
import {RNBrightcovePlayer} from '../../native-modules/RNBrightCovePlayer';
import {stringConstants} from '../../util/constants';
export const CustomVideoPlayer = () => {
  const {BCOV_POLICY_KEY, ACCOUNT_ID, VIDEO_ID} = stringConstants;

  return (
    <View style={{flex: 1, backgroundColor: 'pink'}}>
      <RNBrightcovePlayer
        policyKey={BCOV_POLICY_KEY}
        accountId={ACCOUNT_ID}
        videoId={VIDEO_ID}
      />
    </View>
  );
};

import React from 'react';
import {stringConstants} from '../../util/constants';
import {View, StyleSheet} from 'react-native';
import {RNBCPlayer} from '../common/RNBCPlayer';

export const styles = StyleSheet.create({
  viewStyle: {
    flex: 1,
  },
  brightcovePlayerStyle: {
    width: '100%',
    height: 200,
  },
});

export const CustomVideoPlayer = () => {
  const {BCOV_POLICY_KEY, ACCOUNT_ID, VIDEO_ID} = stringConstants;
  const {viewStyle} = styles;

  return (
    <View style={viewStyle}>
      <RNBCPlayer
        policyKey={BCOV_POLICY_KEY}
        accountId={ACCOUNT_ID}
        videoId={VIDEO_ID}
      />
    </View>
  );
};

import React from 'react';
import {RNBrightcovePlayer} from '../../native-modules/RNBrightCovePlayer';
import {styles} from '../video-player/CustomVideoPlayer';

export type RNBCPlayerProps = {
  policyKey: string;
  accountId: string;
  videoId: string;
};

export const RNBCPlayer = ({
  policyKey,
  accountId,
  videoId,
  ...otherProps
}: RNBCPlayerProps) => {
  const {brightcovePlayerStyle} = styles;

  return (
    <RNBrightcovePlayer
      style={brightcovePlayerStyle}
      policyKey={policyKey}
      accountId={accountId}
      videoId={videoId}
      {...otherProps}
    />
  );
};

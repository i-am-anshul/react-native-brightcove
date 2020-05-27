import React from 'react';
import {RNBrightcovePlayer} from '../../native-modules/RNBrightCovePlayer';
import {stringConstants} from '../../util/constants';

export const CustomVideoPlayer = () => {
  const {BCOV_POLICY_KEY, ACCOUNT_ID, VIDEO_ID} = stringConstants;

  return (
    <>
      <RNBrightcovePlayer
        policyKey={BCOV_POLICY_KEY}
        accountId={ACCOUNT_ID}
        videoId={VIDEO_ID}
      />
    </>
  );
};

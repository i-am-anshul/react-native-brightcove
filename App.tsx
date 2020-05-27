import React from 'react';
import {View} from 'react-native';
import {CustomVideoPlayer} from './src/components/video-player/CustomVideoPlayer';

declare const global: {HermesInternal: null | {}};

const App = () => {
  return (
    <View style={{flex: 1}}>
      <CustomVideoPlayer />
    </View>
  );
};

export default App;

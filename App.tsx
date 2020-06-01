import React from 'react';
import {View} from 'react-native';
import {
  CustomVideoPlayer,
  styles,
} from './src/components/video-player/CustomVideoPlayer';

const {viewStyle} = styles;
const App = () => {
  return (
    <View style={viewStyle}>
      <CustomVideoPlayer />
    </View>
  );
};

export default App;

import React from 'react';
import _ from 'lodash';
import styles from './App.module.scss';
import Canvas from './components/Canvas';

const App: React.FC = () => {
  const [canvasSize, setCanvasSize] = React.useState({
    width: window.innerWidth,
    height: window.innerHeight,
  });

  React.useEffect(() => {
    const resize = _.debounce(() => {
      setCanvasSize({
        width: window.innerWidth,
        height: window.innerHeight,
      });
    }, 300);
    window.addEventListener('resize', resize);
    return () => window.removeEventListener('resize', resize);
  }, []);

  return (
    <div className={styles.App}>
      <Canvas width={canvasSize.width} height={canvasSize.height} />
    </div>
  );
};

export default App;

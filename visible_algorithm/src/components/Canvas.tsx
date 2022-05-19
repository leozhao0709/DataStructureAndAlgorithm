import React from 'react';
import classnames from 'classnames';
import { BallCanvas } from '../canvas/BallCanvas';
import { Ball } from '../model/Ball';

interface CanvasProps extends React.HTMLAttributes<HTMLCanvasElement> {
  width: number;
  height: number;
}

const Canvas: React.FC<CanvasProps> = (props: CanvasProps) => {
  const { className, width, height, ...restProps } = props;

  const canvasRef = React.useRef<HTMLCanvasElement>(null);

  React.useEffect(() => {
    if (canvasRef && canvasRef.current) {
      const canvasEl = canvasRef.current;

      const myCanvas = new BallCanvas(canvasEl);
      myCanvas.draw();
    }
  }, [width, height, canvasRef]);

  return (
    <canvas
      {...restProps}
      width={width}
      height={height}
      ref={canvasRef}
      className={classnames(className)}
    />
  );
};

Canvas.defaultProps = {};

export default React.memo(Canvas);

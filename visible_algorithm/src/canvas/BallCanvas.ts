import { MyCanvas } from './MyCanvas';
import { Ball } from '../model/Ball';
/**
 * BallCanvas
 */
export class BallCanvas extends MyCanvas {
  private balls: Ball[];

  constructor(canvasEl: HTMLCanvasElement) {
    super(canvasEl);

    const numOfBalls = 10;
    this.balls = new Array(numOfBalls).fill(0).map(() => {
      const R = 50;
      const x = Math.random() * (canvasEl.width - 2 * R) + R;
      const y = Math.random() * (canvasEl.height - 2 * R) + R;
      const vx = Math.random() * 15;
      const vy = Math.random() * 15;
      return new Ball(x, y, R, vx, vy);
    });
  }

  draw() {
    this.context.save();
    this.context.clearRect(0, 0, this.canvasEl.width, this.canvasEl.height);
    this.balls.forEach((ball) => {
      this.context.beginPath();

      ball.move(0, 0, this.canvasEl.width, this.canvasEl.height);

      this.context.arc(ball.x, ball.y, ball.radius, 0, Math.PI * 2);
      this.context.stroke();
    });
    this.context.save();
    window.requestAnimationFrame(() => {
      this.draw();
    });
  }
}

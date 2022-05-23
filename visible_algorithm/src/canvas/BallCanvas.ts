import { MyCanvas } from './MyCanvas';
import { Ball } from '../model/Ball';
/**
 * BallCanvas
 */
export class BallCanvas extends MyCanvas {
  private balls: Ball[];
  readonly title: string;

  constructor(canvasEl: HTMLCanvasElement) {
    super(canvasEl);
    this.title = 'BallCanvas';
    const numOfBalls = 10;
    this.balls = new Array(numOfBalls).fill(0).map(() => {
      const R = 50;
      const x = Math.random() * (canvasEl.width - 2 * R) + R;
      const y = Math.random() * (canvasEl.height - 2 * R) + R;
      const vx = (Math.random() * 0.5 + 0.5) * 10;
      const vy = (Math.random() * 0.5 + 0.5) * 10;
      return new Ball(x, y, R, vx, vy);
    });

    document.addEventListener('click', this.handleClick.bind(this));
  }

  updateCanvas() {
    this.context.clearRect(0, 0, this.canvasEl.width, this.canvasEl.height);

    this.balls.forEach((ball, i) => {
      this.context.beginPath();

      ball.move(0, 0, this.canvasEl.width, this.canvasEl.height);

      this.context.arc(ball.x, ball.y, ball.radius, 0, Math.PI * 2);
      this.context.font = 'normal bold 40px Inconsolata';
      this.context.textBaseline = 'middle';
      this.context.textAlign = 'center';

      if (ball.isFilled) {
        this.context.fillStyle = '#fbb034';
        this.context.fill();
      } else {
        this.context.stroke();
      }

      this.context.fillStyle = 'black';
      this.context.fillText(i.toString(), ball.x, ball.y);
    });
  }

  private handleClick(e: MouseEvent) {
    if (!this.isPaused) {
      this.balls.forEach((ball) => {
        if (ball.containsPoint({ x: e.clientX, y: e.clientY })) {
          ball.isFilled = !ball.isFilled;
        }
      });
    }
  }
}

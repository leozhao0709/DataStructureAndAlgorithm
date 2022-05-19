/**
 * Ball
 */
export class Ball {
  constructor(
    public x: number,
    public y: number,
    public radius: number,
    public vx: number,
    public vy: number,
    public isFilled?: boolean
  ) {}

  move(minX: number, minY: number, maxX: number, maxY: number) {
    this.x += this.vx;
    this.y += this.vy;

    if (this.x - this.radius <= minX || this.x + this.radius >= maxX) {
      this.vx = -this.vx;
    }

    if (this.y - this.radius <= minY || this.y + this.radius >= maxY) {
      this.vy = -this.vy;
    }
  }
}

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

    if (
      (this.x - this.radius <= minX && this.vx < 0) ||
      (this.x + this.radius >= maxX && this.vx > 0)
    ) {
      this.vx = -this.vx;
    }

    if (
      (this.y - this.radius <= minY && this.vy < 0) ||
      (this.y + this.radius >= maxY && this.vy > 0)
    ) {
      this.vy = -this.vy;
    }
  }

  containsPoint({ x, y }: { x: number; y: number }) {
    const ratio = 1;
    return (
      (x * ratio - this.x) ** 2 + (y * ratio - this.y) ** 2 < this.radius ** 2
    );
  }
}

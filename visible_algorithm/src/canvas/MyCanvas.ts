/**
 * MyCanvas
 */
export abstract class MyCanvas {
  protected context: CanvasRenderingContext2D;
  protected requestAnimationId?: number;
  protected isPaused = true;

  constructor(protected canvasEl: HTMLCanvasElement) {
    this.canvasEl = canvasEl;
    this.context = canvasEl.getContext('2d')!;
    // this.setCanvasSize(this.canvasEl.width, this.canvasEl.height);

    document.addEventListener('keypress', this.handleKeyboardPress.bind(this));
  }

  // resize() {
  //   this.setCanvasSize(this.canvasEl.width, this.canvasEl.height);
  // }

  run() {
    if (this.isPaused) {
      this.isPaused = false;
    }

    this.draw();

    const requestAnimationId = window.requestAnimationFrame(
      this.run.bind(this)
    );

    this.requestAnimationId = requestAnimationId;
  }

  pause() {
    if (!this.isPaused && this.requestAnimationId) {
      window.cancelAnimationFrame(this.requestAnimationId);
      this.requestAnimationId = undefined;
      this.isPaused = true;
    }
  }

  abstract updateCanvas();

  protected draw() {
    this.context.save();
    this.updateCanvas();
    this.context.save();
  }

  // private setCanvasSize(width: number, height: number) {
  //   const oldWidth = width;
  //   const oldHeight = height;

  //   // set canvas size
  //   this.canvasEl.width = width * ratio;
  //   this.canvasEl.height = height * ratio;

  //   // set canvas css size
  //   this.canvasEl.style.width = oldWidth + 'px';
  //   this.canvasEl.style.height = oldHeight + 'px';
  // }

  private handleKeyboardPress(e: KeyboardEvent) {
    e.preventDefault();
    if (e.code === 'Space') {
      if (!this.isPaused) {
        this.pause();
      } else {
        this.run();
      }
    }
  }
}

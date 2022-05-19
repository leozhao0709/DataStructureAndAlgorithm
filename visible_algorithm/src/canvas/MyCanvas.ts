/**
 * MyCanvas
 */
export abstract class MyCanvas {
  protected context: CanvasRenderingContext2D;

  constructor(protected canvasEl: HTMLCanvasElement) {
    this.canvasEl = canvasEl;
    this.context = canvasEl.getContext('2d')!;
    const ratio = window.devicePixelRatio || 1;

    const oldWidth = this.canvasEl.width;
    const oldHeight = this.canvasEl.height;

    // set canvas size
    this.canvasEl.width = this.canvasEl.width * ratio;
    this.canvasEl.height = this.canvasEl.height * ratio;

    // set canvas css size
    this.canvasEl.style.width = oldWidth + 'px';
    this.canvasEl.style.height = oldHeight + 'px';
  }

  abstract draw();
}

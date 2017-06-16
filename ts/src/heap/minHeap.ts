import { swap } from '../utils/swap';
export class MinHeap<T> {
  private _arr: T[] = [];

  /**
   * insert
   */
  public insertItem(item: T) {
    this._arr.push(item);

    this.shiftUp(this._arr.length - 1);
  }

  /**
   * extractMin
   */
  public extractMin(): T {
    const min = this._arr[0];

    swap(this._arr, 0, this._arr.length - 1);
    this._arr.splice(-1, 1);

    this.shiftDown(0);

    return min;
  }

  /**
   * isEmpty
   */
  public isEmpty(): boolean {
    return this._arr.length === 0;
  }

  private shiftUp(index: number) {
    let k = index;

    // parent node index
    let j = Math.floor((k - 1) / 2);
    while (j >= 0) {
      if (this._arr[j] > this._arr[k]) {
        swap(this._arr, k, j);
      } else {
        break;
      }

      k = j;
      j = Math.floor((k - 1) / 2);
    }
  }

  private shiftDown(index: number) {
    let k = index;

    let leftChildIndex = 2 * k + 1;
    while (leftChildIndex < this._arr.length) {
      let minChildIndex = leftChildIndex;
      const rightChildIndex = leftChildIndex + 1;
      if (rightChildIndex < this._arr.length && this._arr[rightChildIndex] < this._arr[leftChildIndex]) {
        minChildIndex = rightChildIndex;
      }

      if (this._arr[minChildIndex] < this._arr[k]) {
        swap(this._arr, minChildIndex, k);
      } else {
        break;
      }

      k = minChildIndex;
      leftChildIndex = 2 * k + 1;
    }
  }
}

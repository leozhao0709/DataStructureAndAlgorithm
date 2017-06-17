import { swap } from '../utils/swap';
export class MaxHeap<T> {

  private _arr: T[] = [];

  constructor() {
  };

  /**
   * heapify
   */
  public heapify(arr: T[]) {
    const arrCopy = arr.slice();
    this._arr = arrCopy;

    for (let i = Math.floor((arrCopy.length - 1) / 2); i >= 0; i--) {
      this.shiftDown(i);
    }
  }

  /**
   * isEmpty
   */
  public isEmpty(): boolean {
    return this._arr.length === 0;
  }

  /**
   * length
   */
  public length(): number {
    return this._arr.length;
  }

  /**
   * insertItem
   */
  public insertItem(item: T) {
    this._arr.push(item);

    this.shiftUp(this._arr.length - 1);
  }

  /**
   * extractMax
   */
  public extractMax(): T {
    if (this.length() === 0) {
      throw Error('this heap is empty');
    }

    const max = this._arr[0];

    swap(this._arr, 0, this.length() - 1);
    this._arr.splice(- 1, 1);

    this.shiftDown(0);

    return max;
  }

  /**
   * deep
   */
  private deep(): number {
    let k = this.length();
    let deep = 0;
    while (k !== 0) {
      deep++;
      k = Math.floor(k / 2);
    }

    return deep;
  }

  private shiftUp(index: number) {
    let k = index;

    // current (index - 1)/2 will be the parent index
    while (this._arr[Math.floor((k - 1) / 2)] < this._arr[k] && k > 0) {
      swap(this._arr, k, Math.floor((k - 1) / 2));

      k = Math.floor((k - 1) / 2);
    }
  }

  private shiftDown(index: number) {
    let k = index;
    // left child must be less than length
    while (2 * k + 1 < this.length()) {
      // k is current index, j is the max child index
      let j = 2 * k + 1;
      if (j + 1 < this.length() && this._arr[j] < this._arr[j + 1]) {
        j = j + 1;
      }

      if (this._arr[k] > this._arr[j]) {
        break;
      }

      swap(this._arr, k, j);
      k = j;
    }

  }

}

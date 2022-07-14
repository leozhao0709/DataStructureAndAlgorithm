export type CompareFunc<T> = (i: T, j: T) => -1 | 0 | 1;

export class MaxHeap<T> {
  private data: T[];
  private compareFunc: CompareFunc<T>;

  constructor(compareFunc: CompareFunc<T>) {
    this.data = [];
    this.data.sort();
    this.compareFunc = compareFunc;
  }

  /**
   * enqueue
   */
  public enqueue() {}

  /**
   * dequeue
   */
  public dequeue() {}

  private parentIndex(index: number) {
    if (index >= this.data.length) {
      throw new Error('invalid index');
    }

    return Math.floor((index - 1) / 2);
  }

  private shiftUp(index: number) {
    if (index >= this.data.length) {
      throw new Error('invalid index');
    }
    let parentIndex = this.parentIndex(index);
    while (this.compareFunc(this.data[index], this.data[parentIndex]) > 0) {
      this.swap(index, parentIndex);
      index = parentIndex;
      parentIndex = this.parentIndex(index);
    }
  }

  private swap(i: number, j: number) {
    const temp = this.data[i];
    this.data[i] = this.data[j];
    this.data[j] = temp;
  }
}

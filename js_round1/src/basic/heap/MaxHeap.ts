export type CompareFunc<T> = (i: T, j: T) => number;

export class MaxHeap<T> {
  private dataArray: T[];
  private compareFunc: CompareFunc<T>;

  constructor(compareFunc: CompareFunc<T>, array: T[] = []) {
    this.compareFunc = compareFunc;
    this.dataArray = array;
    for (let i = this.parentIndex(array.length - 1); i >= 0; i--) {
      this.shiftDown(i);
    }
  }

  /**
   * peek
   */
  public peek() {
    return this.dataArray[0];
  }

  /**
   * enqueue
   */
  public enqueue(data: T) {
    this.dataArray.push(data);
    this.shiftUp(this.dataArray.length - 1);
  }

  /**
   * dequeue
   */
  public dequeue(): T {
    if (this.dataArray.length === 0) {
      throw 'please enque element first';
    }
    if (this.dataArray.length === 1) {
      return this.dataArray.pop()!;
    }
    this.swap(0, this.dataArray.length - 1);
    const data = this.dataArray.pop()!;
    this.shiftDown(0);
    return data;
  }

  private parentIndex(index: number) {
    if (index >= this.dataArray.length) {
      throw new Error('invalid index');
    }

    return Math.floor((index - 1) / 2);
  }

  private leftChildIndex(index: number) {
    return 2 * index + 1;
  }

  private rightChildIndex(index: number) {
    return 2 * index + 2;
  }

  private shiftUp(index: number) {
    if (index >= this.dataArray.length) {
      throw new Error('invalid index');
    }
    while (
      index > 0 &&
      this.compareFunc(
        this.dataArray[index],
        this.dataArray[this.parentIndex(index)]
      ) > 0
    ) {
      this.swap(index, this.parentIndex(index));
      index = this.parentIndex(index);
    }
  }

  private shiftDown(index: number) {
    if (index >= this.dataArray.length) {
      throw new Error('invalid index');
    }

    while (this.leftChildIndex(index) < this.dataArray.length) {
      let maxChildIndex = this.leftChildIndex(index);
      const rightChildIndex = this.rightChildIndex(index);
      if (rightChildIndex < this.dataArray.length) {
        if (
          this.compareFunc(
            this.dataArray[maxChildIndex],
            this.dataArray[rightChildIndex]
          ) < 0
        ) {
          maxChildIndex = rightChildIndex;
        }
      }

      if (
        this.compareFunc(this.dataArray[maxChildIndex], this.dataArray[index]) <
        0
      ) {
        break;
      }

      this.swap(maxChildIndex, index);
      index = maxChildIndex;
    }
  }

  private getMaxChild(index: number) {
    if (index >= this.dataArray.length) {
      throw new Error('invalid index');
    }

    const leftChild = this.dataArray[this.leftChildIndex(index)];
    const rightChild = this.dataArray[this.rightChildIndex(index)];
    if (leftChild === undefined && rightChild === undefined) {
      return {};
    }
    if (rightChild === undefined) {
      return {
        maxChild: leftChild,
        maxChildIndex: this.leftChildIndex(index),
      };
    }

    if (this.compareFunc(leftChild, rightChild) > 0) {
      return {
        maxChild: leftChild,
        maxChildIndex: this.leftChildIndex(index),
      };
    } else {
      return {
        maxChild: rightChild,
        maxChildIndex: this.rightChildIndex(index),
      };
    }
  }

  private swap(i: number, j: number) {
    const temp = this.dataArray[i];
    this.dataArray[i] = this.dataArray[j];
    this.dataArray[j] = temp;
  }
}

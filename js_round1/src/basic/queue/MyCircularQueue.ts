// https://leetcode.com/problems/design-circular-queue/

class MyCircularQueue {
  private arr: number[];
  // current Dequeue Index
  private front: number;
  // the next enQueueIndex
  private rear: number;
  private length: number;

  constructor(k: number) {
    this.arr = new Array(k).fill(0);
    this.front = 0;
    this.rear = 0;
    this.length = 0;
  }

  enQueue(value: number): boolean {
    if (this.isFull()) {
      return false;
    }
    this.arr[this.rear] = value;
    this.rear = this.rear + 1;
    if (this.rear === this.arr.length) {
      this.rear = 0;
    }
    this.length++;
    return true;
  }

  deQueue(): boolean {
    if (this.isEmpty()) {
      return false;
    }
    this.front = this.front + 1;
    if (this.front === this.arr.length) {
      this.front = 0;
    }
    this.length--;
    return true;
  }

  Front(): number {
    if (this.isEmpty()) {
      return -1;
    }
    return this.arr[this.front];
  }

  Rear(): number {
    if (this.isEmpty()) {
      return -1;
    }
    return this.arr[this.modular(this.rear - 1, this.arr.length)];
  }

  isEmpty(): boolean {
    return this.length === 0;
  }

  isFull(): boolean {
    return this.length === this.arr.length;
  }

  private modular(a: number, b: number): number {
    return ((a % b) + b) % b;
  }
}

export default MyCircularQueue;
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * var obj = new MyCircularQueue(k)
 * var param_1 = obj.enQueue(value)
 * var param_2 = obj.deQueue()
 * var param_3 = obj.Front()
 * var param_4 = obj.Rear()
 * var param_5 = obj.isEmpty()
 * var param_6 = obj.isFull()
 */

// https://leetcode.com/problems/design-circular-queue/

class MyCircularQueue {
  private arr: number[];
  private front: number;
  private rear: number;
  private length: number;

  constructor(k: number) {
    this.length = k;
    this.arr = new Array(5).fill(0);
    this.front = 0;
    this.rear = 0;
  }

  enQueue(value: number): boolean {
    if (this.isFull()) {
      return false;
    }
    this.rear = this.rear + 1;
    this.arr[this.rear] = value;
    return true;
  }

  deQueue(): boolean {
    if (this.isEmpty()) {
      return false;
    }
    this.front = this.front + 1;
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
    return this.arr[this.rear];
  }

  isEmpty(): boolean {
    return this.front === this.rear;
  }

  isFull(): boolean {
    return (
      this.rear > this.front && (this.rear - this.front) % this.length === 0
    );
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

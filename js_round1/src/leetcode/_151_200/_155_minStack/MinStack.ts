class MinStack {
  private stack: number[];
  private minStack: { val: number; count: number }[];

  constructor() {
    this.stack = [];
    this.minStack = [];
  }

  push(val: number): void {
    this.stack.push(val);
    const minStackLength = this.minStack.length;
    if (minStackLength === 0) {
      this.minStack.push({ val, count: 1 });
      return;
    }

    const lastMin = this.minStack[minStackLength - 1];
    if (val < lastMin.val) {
      this.minStack.push({ val, count: 1 });
    } else if (val === lastMin.val) {
      lastMin.count += 1;
    }
  }

  pop(): void {
    const lastVal = this.stack.pop();
    const minStackLength = this.minStack.length;
    const lastMin = this.minStack[minStackLength - 1];

    if (lastVal === lastMin.val) {
      lastMin.count -= 1;
      if (lastMin.count === 0) {
        this.minStack.pop();
      }
    }
  }

  top(): number {
    return this.stack[this.stack.length - 1];
  }

  getMin(): number {
    return this.minStack[this.minStack.length - 1].val;
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */

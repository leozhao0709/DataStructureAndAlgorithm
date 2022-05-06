import MyCircularQueue from '@app/basic/queue/MyCircularQueue';

describe('MyCircularQueue', () => {
  it('should give correct result', () => {
    const myCircularQueue = new MyCircularQueue(3);
    expect(myCircularQueue.enQueue(1)).toBe(true);
    expect(myCircularQueue.enQueue(2)).toBe(true);
    expect(myCircularQueue.enQueue(3)).toBe(true);
    expect(myCircularQueue.enQueue(4)).toBe(false);

    expect(myCircularQueue.Rear()).toBe(3);
    expect(myCircularQueue.isFull()).toBe(true);
    expect(myCircularQueue.deQueue()).toBe(true);
    expect(myCircularQueue.enQueue(4)).toBe(true);
    expect(myCircularQueue.Rear()).toBe(4);
  });
});

import leastInterval from '@app/basic/queue/leastInterval';

describe('leastInterval', () => {
  it('should return 8 when tasks = ["A","A","A","B","B","B"] and n = 2', () => {
    const tasks = ['A', 'A', 'A', 'B', 'B', 'B'];
    const n = 2;
    expect(leastInterval(tasks, n)).toBe(8);
  });

  it('should return 6 when tasks = ["A","A","A","B","B","B"], n = 0', () => {
    const tasks = ['A', 'A', 'A', 'B', 'B', 'B'];
    const n = 0;
    expect(leastInterval(tasks, n)).toBe(6);
  });

  it('should return 16 when tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2', () => {
    const tasks = ['A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'];
    const n = 2;
    expect(leastInterval(tasks, n)).toBe(16);
  });
});

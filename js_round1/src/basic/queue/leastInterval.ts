// https://leetcode.com/problems/task-scheduler/

function leastInterval(tasks: string[], n: number): number {
  let map = new Map<string, number>();

  tasks.forEach((task) => {
    if (!map.has(task)) {
      map.set(task, 1);
      return;
    }
    const taskCount = map.get(task)!;
    map.set(task, taskCount + 1);
  });

  let result = 0;
  while (map.size > 0) {
    map = new Map([...map].sort((a, b) => b[1] - a[1]));
    const keys = Array.from(map.keys());
    let step = 0;

    for (let i = 0; i <= n; i++) {
      if (i < keys.length) {
        const key = keys[i];
        const count = map.get(key)! - 1;
        if (count === 0) {
          map.delete(key);
        } else {
          map.set(key, count);
        }
        step++;
      }
    }

    result += map.size > 0 ? n + 1 : step;
  }

  return result;
}

export default leastInterval;

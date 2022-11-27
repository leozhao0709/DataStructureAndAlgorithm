// https://leetcode.com/problems/course-schedule-ii/

function findOrder(numCourses: number, prerequisites: number[][]): number[] {
  const indegrees: number[] = new Array(numCourses).fill(0);
  const graph = new Array(numCourses).fill(0).map(() => [] as number[]);

  prerequisites.forEach((prerequest) => {
    const dependant = prerequest[1];
    const course = prerequest[0];
    graph[dependant].push(course);
    indegrees[course] += 1;
  });

  const queue: number[] = [];
  const res: number[] = [];

  indegrees.forEach((indegree, i) => {
    if (indegree === 0) {
      queue.push(i);
    }
  });

  while (queue.length > 0) {
    const courseFinish = queue.shift()!;
    res.push(courseFinish);

    graph[courseFinish].forEach((dependCourse) => {
      indegrees[dependCourse] -= 1;
      if (indegrees[dependCourse] === 0) {
        queue.push(dependCourse);
      }
    });
  }

  return res.length < numCourses ? [] : res;
}

// test
const numCourses = 4,
  prerequisites = [
    [1, 0],
    [2, 0],
    [3, 1],
    [3, 2],
  ];

// eslint-disable-next-line no-console
console.log(findOrder(numCourses, prerequisites));

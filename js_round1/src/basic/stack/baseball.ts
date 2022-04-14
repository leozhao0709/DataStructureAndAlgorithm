// https://leetcode.com/problems/baseball-game/

function calPoints(ops: string[]): number {
  const points: number[] = [];

  ops.forEach((op) => {
    switch (op) {
      case 'C':
        points.pop();
        break;
      case 'D': {
        points.push(points[points.length - 1] * 2);
        break;
      }
      case '+': {
        const length = points.length;
        const prev1 = points[length - 1];
        const prev2 = points[length - 2];
        points.push(prev1 + prev2);
        break;
      }
      default:
        points.push(parseInt(op));
        break;
    }
  });

  return points.reduce((prev, curr) => prev + curr);
}

export default calPoints;

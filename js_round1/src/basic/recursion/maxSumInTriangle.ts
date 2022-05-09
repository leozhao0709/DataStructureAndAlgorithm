// give a right triangle, and each time, you can only go down or right down from one element. Get the max sum from any point to bottom

// // recursion
// const maxSumInTriangle1 = (
//   triangle: number[][],
//   point: { x: number; y: number }
// ): number => {
//   if (triangle.length === 0) {
//     return 0;
//   }

//   const { x, y } = point;
//   if (x < 0 || x >= triangle.length) {
//     throw new Error('Invalid point x');
//   }

//   if (y < 0 || y >= triangle[0].length) {
//     throw new Error('Invalid Point y');
//   }

//   if (x === triangle.length - 1 || y === triangle[0].length - 1) {
//     return triangle[x][y];
//   }

//   return (
//     triangle[x][y] +
//     Math.max(
//       maxSumInTriangle(triangle, { x: x + 1, y }),
//       maxSumInTriangle(triangle, { x: x + 1, y: y + 1 })
//     )
//   );
// };

// dp: max[i][j] = point[i][j] + Max(max(i+1, j), max(i+1, j+1))
const maxSumInTriangle = (
  triangle: number[][],
  point: { x: number; y: number }
): number => {
  const rows = triangle.length;

  if (rows === 0) {
    return 0;
  }

  const cols = triangle[0].length;

  const { x, y } = point;
  if (x < 0 || x >= rows) {
    throw new Error('Invalid point x');
  }

  if (y < 0 || y >= cols) {
    throw new Error('Invalid Point y');
  }

  const result = new Array(rows + 1)
    .fill(0)
    .map(() => new Array(cols + 1).fill(0));

  for (let i = rows - 1; i >= 0; i--) {
    for (let j = 0; j <= i; j++) {
      result[i][j] =
        triangle[i][j] + Math.max(result[i + 1][j], result[i + 1][j + 1]);
    }
  }

  console.log(result);
  return result[x][y];
};

export default maxSumInTriangle;

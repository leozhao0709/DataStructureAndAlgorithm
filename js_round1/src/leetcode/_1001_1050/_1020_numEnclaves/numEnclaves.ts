// https://leetcode.com/problems/number-of-enclaves/
function numEnclaves(grid: number[][]): number {
  let result = 0;

  const rows = grid.length;
  const cols = grid[0].length;
  const dirs = [
    [-1, 0],
    [0, 1],
    [1, 0],
    [0, -1],
  ];

  const isInBoundary = (i: number, j: number): boolean => {
    return i === 0 || j === 0 || i === rows - 1 || j === cols - 1;
  };

  const isInRange = (i: number, j: number): boolean => {
    return i >= 0 && i < rows && j >= 0 && j < cols;
  };

  const dfs = (i: number, j: number) => {
    grid[i][j] = 2;
    dirs.forEach((dir) => {
      const [dx, dy] = dir;
      const nextX = i + dx;
      const nextY = j + dy;
      if (isInRange(nextX, nextY) && grid[nextX][nextY] === 1) {
        dfs(nextX, nextY);
      }
    });
  };

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (isInBoundary(i, j) && grid[i][j] === 1) {
        dfs(i, j);
      }
    }
  }

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (grid[i][j] === 1) {
        result++;
      }
    }
  }

  return result;
}

// test
const grid = [
  [0, 1, 1, 0],
  [0, 0, 1, 0],
  [0, 0, 1, 0],
  [0, 0, 0, 0],
];
console.log(numEnclaves(grid));

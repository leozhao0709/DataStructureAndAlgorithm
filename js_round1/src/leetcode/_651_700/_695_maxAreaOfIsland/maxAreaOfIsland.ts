// https://leetcode.com/problems/max-area-of-island/
function maxAreaOfIsland(grid: number[][]): number {
  const rows = grid.length;
  const cols = grid[0].length;
  const visited: boolean[][] = new Array(rows)
    .fill(0)
    .map(() => new Array(cols).fill(false));

  const dirs = [
    [-1, 0],
    [1, 0],
    [0, -1],
    [0, 1],
  ];

  const inArea = (i: number, j: number) => {
    return i >= 0 && i < rows && j >= 0 && j < cols;
  };

  const dfs = (i: number, j: number): number => {
    if (!inArea(i, j)) {
      return 0;
    }

    visited[i][j] = true;

    let result = 1;
    for (const [dx, dy] of dirs) {
      const nextX = i + dx;
      const nextY = j + dy;
      if (
        inArea(nextX, nextY) &&
        !visited[nextX][nextY] &&
        grid[nextX][nextY] === 1
      ) {
        result += dfs(nextX, nextY);
      }
    }

    return result;
  };

  let maxArea = 0;
  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (grid[i][j] === 1 && !visited[i][j]) {
        maxArea = Math.max(maxArea, dfs(i, j));
      }
    }
  }

  return maxArea;
}

// test
{
  const grid = [
    [0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
    [0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0],
    [0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0],
  ];

  console.log(maxAreaOfIsland(grid));
}

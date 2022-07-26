// https://leetcode.com/problems/number-of-islands/

function numIslands(grid: string[][]): number {
  const rows = grid.length;
  if (rows === 0) {
    return 0;
  }

  const cols = grid[0].length;

  let count = 0;
  const visited: boolean[][] = new Array(rows)
    .fill(-1)
    .map(() => new Array(cols).fill(false));

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (grid[i][j] === '1' && !visited[i][j]) {
        dfs(grid, i, j, visited);
        count++;
      }
    }
  }

  return count;
}

function dfs(grid: string[][], x: number, y: number, visited: boolean[][]) {
  const dirs = [
    [0, 1],
    [0, -1],
    [1, 0],
    [-1, 0],
  ];
  visited[x][y] = true;
  for (let i = 0; i < dirs.length; i++) {
    const nextX = x + dirs[i][0];
    const nextY = y + dirs[i][1];
    if (
      isValidPoint(grid, nextX, nextY) &&
      grid[nextX][nextY] === '1' &&
      !visited[nextX][nextY]
    ) {
      dfs(grid, nextX, nextY, visited);
    }
  }
}

function isValidPoint(grid: string[][], i: number, j: number) {
  return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
}

export default numIslands;

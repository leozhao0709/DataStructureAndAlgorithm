// https://leetcode.com/problems/coloring-a-border/
function colorBorder(
  grid: number[][],
  row: number,
  col: number,
  color: number
): number[][] {
  const rows = grid.length;
  const cols = grid[0].length;

  const visited: boolean[][] = new Array(rows)
    .fill(0)
    .map(() => new Array(cols).fill(false));

  const dirs = [
    [0, 1],
    [0, -1],
    [-1, 0],
    [1, 0],
  ];

  const isGridBorder = (i: number, j: number) => {
    return i === 0 || i === rows - 1 || j === 0 || j === cols - 1;
  };

  const isInArea = (i: number, j: number) => {
    return i >= 0 && i < rows && j >= 0 && j < cols;
  };

  const markedNum = -1;

  const isBorder = (i: number, j: number, originalColor: number) => {
    return (
      isGridBorder(i, j) ||
      dirs.some((dir) => {
        const [dx, dy] = dir;
        const nextX = i + dx;
        const nextY = j + dy;
        if (
          grid[nextX][nextY] !== originalColor &&
          grid[nextX][nextY] !== markedNum
        ) {
          return true;
        }
        return false;
      })
    );
  };

  const dfs = (i: number, j: number, originalColor: number) => {
    visited[i][j] = true;
    if (isBorder(i, j, originalColor) && grid[i][j] === originalColor) {
      grid[i][j] = markedNum;
    }

    dirs.forEach((dir) => {
      const [dx, dy] = dir;
      const nextX = i + dx;
      const nextY = j + dy;
      if (
        isInArea(nextX, nextY) &&
        !visited[nextX][nextY] &&
        grid[nextX][nextY] === originalColor
      ) {
        dfs(nextX, nextY, originalColor);
      }
    });
  };

  dfs(row, col, grid[row][col]);

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (grid[i][j] === markedNum) {
        grid[i][j] = color;
      }
    }
  }

  return grid;
}

// test
{
  const grid = [
    [1, 2, 1, 2, 1, 2],
    [2, 2, 2, 2, 1, 2],
    [1, 2, 2, 2, 1, 2],
  ];
  console.log(colorBorder(grid, 1, 3, 4));

  [
    [1, 4, 1, 4, 1, 2],
    [4, 2, 4, 4, 1, 2],
    [1, 4, 4, 4, 1, 2],
  ];
}

// https://leetcode.com/problems/shortest-path-in-binary-matrix/

function shortestPathBinaryMatrix(grid: number[][]): number {
  const rows = grid.length;
  const cols = grid[0].length;

  if (rows === 1 && cols === 1 && grid[0][0] === 0) {
    return 1;
  }

  const visited: boolean[][] = new Array(rows)
    .fill(0)
    .map(() => new Array(cols).fill(false));

  const queue: { x: number; y: number }[] = [];
  queue.push({ x: 0, y: 0 });
  const dirs = [
    [0, 1],
    [0, -1],
    [1, 0],
    [-1, 0],
    [1, 1],
    [-1, -1],
    [1, -1],
    [-1, 1],
  ];

  const isInGrid = (x: number, y: number) =>
    x >= 0 && x < rows && y >= 0 && y < cols;

  let steps = 0;

  while (queue.length > 0) {
    steps++;
    const lengthInCurrentLevel = queue.length;

    for (let i = 0; i < lengthInCurrentLevel; i++) {
      const curr = queue.shift()!;
      if (grid[curr.x][curr.y] === 0) {
        for (let j = 0; j < dirs.length; j++) {
          const nextX = curr.x + dirs[j][0];
          const nextY = curr.y + dirs[j][1];
          if (
            isInGrid(nextX, nextY) &&
            grid[nextX][nextY] === 0 &&
            !visited[nextX][nextY]
          ) {
            queue.push({ x: nextX, y: nextY });
            visited[nextX][nextY] = true;
            if (nextX === rows - 1 && nextY === cols - 1) {
              return steps + 1;
            }
          }
        }
      }
    }
  }
  return -1;
}

export default shortestPathBinaryMatrix;

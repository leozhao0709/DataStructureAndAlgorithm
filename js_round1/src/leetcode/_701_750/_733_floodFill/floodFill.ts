// https://leetcode.com/problems/flood-fill/
function floodFill(
  image: number[][],
  sr: number,
  sc: number,
  color: number
): number[][] {
  const rows = image.length;
  const cols = image[0].length;
  const originalColor = image[sr][sc];
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

  const dfs = (i: number, j: number) => {
    if (!inArea(i, j)) {
      return;
    }

    image[i][j] = color;
    visited[i][j] = true;
    dirs.forEach((dir) => {
      const [dx, dy] = dir;
      const nextX = i + dx;
      const nextY = j + dy;
      if (
        inArea(nextX, nextY) &&
        !visited[nextX][nextY] &&
        image[nextX][nextY] === originalColor
      ) {
        dfs(nextX, nextY);
      }
    });
  };

  dfs(sr, sc);

  return image;
}

// test
{
  const image = [
      [0, 0, 0],
      [0, 0, 0],
    ],
    sr = 0,
    sc = 0,
    color = 0;
  console.log(floodFill(image, sr, sc, color));
}

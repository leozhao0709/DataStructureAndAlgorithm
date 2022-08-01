/**
 Do not return anything, modify board in-place instead.
 */
function solve(board: string[][]): void {
  const rows = board.length;
  const cols = board[0].length;
  const visited: boolean[][] = new Array(rows)
    .fill(0)
    .map(() => new Array(cols).fill(false));
  const dirs = [
    [0, 1],
    [1, 0],
    [0, -1],
    [-1, 0],
  ];

  const isInBoard = (i: number, j: number): boolean => {
    return i >= 0 && i < rows && j >= 0 && j < cols;
  };

  const isInBord = (i: number, j: number): boolean => {
    return i === 0 || i === rows - 1 || j === 0 || j === cols - 1;
  };

  const needFlip = (i: number, j: number): boolean => {
    if (!isInBoard(i, j) || visited[i][j]) {
      return false;
    }

    visited[i][j] = true;

    if (board[i][j] === 'O' && isInBord(i, j)) {
      return false;
    }

    for (let i = 0; i < dirs.length; i++) {
      const nextX = i + dirs[i][0];
      const nextY = i + dirs[i][1];
      if (
        !visited[nextX][nextY] &&
        isInBoard(nextX, nextY) &&
        board[nextX][nextY] === 'O'
      ) {
        if (needFlip(nextX, nextY)) {
          board[nextX][nextY] === 'X';
          return true;
        }
      }
    }

    return true;
  };

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (!visited[i][j] && board[i][j] === 'O' && needFlip(i, j)) {
        board[i][j] = 'X';
      }
    }
  }
}

export default solve;

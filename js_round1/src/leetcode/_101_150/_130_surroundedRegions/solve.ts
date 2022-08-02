// https://leetcode.com/problems/surrounded-regions/
/**
 Do not return anything, modify board in-place instead.
 */
// normal idea
function solve1(board: string[][]): void {
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

  const isInBoard = (x: number, y: number): boolean => {
    return x >= 0 && x < rows && y >= 0 && y < cols;
  };

  const isInBorder = (x: number, y: number): boolean => {
    return x === 0 || x === rows - 1 || y === 0 || y === cols - 1;
  };

  const canReachToBorder = (x: number, y: number): boolean => {
    if (isInBorder(x, y)) {
      return true;
    }

    visited[x][y] = true;
    for (let i = 0; i < dirs.length; i++) {
      const nextX = x + dirs[i][0];
      const nextY = y + dirs[i][1];
      if (
        isInBoard(nextX, nextY) &&
        !visited[nextX][nextY] &&
        board[nextX][nextY] === 'O'
      ) {
        if (canReachToBorder(nextX, nextY)) {
          visited[x][y] = false;
          return true;
        }
      }
    }

    return false;
  };

  const flip = (x: number, y: number) => {
    board[x][y] = 'X';
    for (let i = 0; i < dirs.length; i++) {
      const nextX = x + dirs[i][0];
      const nextY = y + dirs[i][1];
      if (isInBoard(nextX, nextY) && board[nextX][nextY] === 'O') {
        flip(nextX, nextY);
      }
    }
  };

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (!visited[i][j] && board[i][j] === 'O' && !canReachToBorder(i, j)) {
        flip(i, j);
      }
    }
  }
}

// DFS starting from boarder
function solve(board: string[][]): void {
  const rows = board.length;
  const cols = board[0].length;
  const dirs = [
    [0, 1],
    [1, 0],
    [0, -1],
    [-1, 0],
  ];

  const isInBoard = (x: number, y: number): boolean => {
    return x >= 0 && x < rows && y >= 0 && y < cols;
  };

  const dfs = (x: number, y: number) => {
    board[x][y] = '*';
    for (let i = 0; i < dirs.length; i++) {
      const nextX = x + dirs[i][0];
      const nextY = y + dirs[i][1];
      if (isInBoard(nextX, nextY) && board[nextX][nextY] === 'O') {
        dfs(nextX, nextY);
      }
    }
  };

  // first row
  for (let i = 0; i < cols; i++) {
    if (board[0][i] === 'O') {
      dfs(0, i);
    }
  }

  // last row
  for (let i = 0; i < cols; i++) {
    if (board[rows - 1][i] === 'O') {
      dfs(rows - 1, i);
    }
  }

  // first col
  for (let i = 0; i < rows; i++) {
    if (board[i][0] === 'O') {
      dfs(i, 0);
    }
  }

  // last col
  for (let i = 0; i < rows; i++) {
    if (board[i][cols - 1] === 'O') {
      dfs(i, cols - 1);
    }
  }

  for (let i = 0; i < rows; i++) {
    for (let j = 0; j < cols; j++) {
      if (board[i][j] === '*') {
        board[i][j] = 'O';
      } else if (board[i][j] === 'O') {
        board[i][j] = 'X';
      }
    }
  }
}

export default solve;

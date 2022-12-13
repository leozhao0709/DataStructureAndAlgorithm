// https://leetcode.com/problems/minesweeper/
function updateBoard(board: string[][], click: number[]): string[][] {
  const rows = board.length;
  const cols = board[0].length;

  const [clickX, clickY] = click;
  if (board[clickX][clickY] === 'M') {
    board[clickX][clickY] = 'X';
    return board;
  }

  const inBoard = (i: number, j: number) => {
    return i >= 0 && i < rows && j >= 0 && j < cols;
  };

  const dirs = [
    [0, -1],
    [-1, -1],
    [-1, 0],
    [-1, 1],
    [0, 1],
    [1, 1],
    [1, 0],
    [1, -1],
  ];

  const dfs = (i: number, j: number) => {
    if (!inBoard(i, j)) {
      return;
    }

    let mineCount = 0;
    for (const [dx, dy] of dirs) {
      const nextX = i + dx;
      const nextY = j + dy;
      if (inBoard(nextX, nextY) && board[nextX][nextY] === 'M') {
        mineCount++;
      }
    }

    if (mineCount > 0) {
      board[i][j] = mineCount.toString();
      return;
    }

    board[i][j] = 'B';
    for (const [dx, dy] of dirs) {
      const nextX = i + dx;
      const nextY = j + dy;
      if (inBoard(nextX, nextY) && board[nextX][nextY] === 'E') {
        dfs(nextX, nextY);
      }
    }
  };

  dfs(clickX, clickY);
  return board;
}

// test
{
  const board = [
      ['E', 'E', 'E', 'E', 'E'],
      ['E', 'E', 'M', 'E', 'E'],
      ['E', 'E', 'E', 'E', 'E'],
      ['E', 'E', 'E', 'E', 'E'],
    ],
    click = [3, 0];

  console.log(updateBoard(board, click));
}

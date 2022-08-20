// https://leetcode.com/problems/valid-sudoku/

function isValidSudoku(board: string[][]): boolean {
  const n = 9;
  const rowSets = new Array(n).fill(0).map(() => new Set<string>());
  const colSets = new Array(n).fill(0).map(() => new Set<string>());
  const boxSets = new Array(n).fill(0).map(() => new Set<string>());

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      const value = board[i][j];
      if (value === '.') {
        continue;
      }

      if (rowSets[i].has(value)) {
        return false;
      }
      rowSets[i].add(value);

      if (colSets[j].has(value)) {
        return false;
      }
      colSets[j].add(value);

      const boxId = Math.floor(i / 3) * 3 + Math.floor(j / 3);
      if (boxSets[boxId].has(value)) {
        return false;
      }
      boxSets[boxId].add(value);
    }
  }

  return true;
}

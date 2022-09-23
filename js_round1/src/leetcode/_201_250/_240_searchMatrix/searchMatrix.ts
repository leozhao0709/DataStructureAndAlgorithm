function searchMatrix(matrix: number[][], target: number): boolean {
  const m = matrix.length;
  const n = matrix[0].length;

  let start = 0;
  let end = m - 1;
  while (start <= end) {
    const mid = start + Math.floor((end - start) / 2);
    if (matrix[mid][0] === target) {
      return true;
    } else if (matrix[mid][0] < target) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }

  if (end < 0) {
    return false;
  }

  const searchingEndRow = end;

  for (let i = 0; i <= searchingEndRow; i++) {
    // search row start with end
    start = 0;
    end = n - 1;
    while (start <= end) {
      const mid = start + Math.floor((end - start) / 2);
      if (matrix[i][mid] === target) {
        return true;
      } else if (matrix[i][mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
  }

  return false;
}

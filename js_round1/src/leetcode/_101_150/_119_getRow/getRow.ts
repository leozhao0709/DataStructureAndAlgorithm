function getRow(rowIndex: number): number[] {
  const cache = new Map<number, number[]>();
  return helper(rowIndex, cache);
}

function helper(rowIndex: number, cache: Map<number, number[]>): number[] {
  if (cache.has(rowIndex)) {
    return cache.get(rowIndex)!;
  }

  if (rowIndex === 0) {
    return [1];
  }

  const res: number[] = [];
  res[0] = 1;
  res[rowIndex] = 1;

  for (let i = 1; i < rowIndex; i++) {
    res[i] =
      helper(rowIndex - 1, cache)[i] + helper(rowIndex - 1, cache)[i - 1];
  }

  cache.set(rowIndex, res);

  return res;
}

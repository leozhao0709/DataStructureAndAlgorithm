export const partition = (
  arr: number[],
  leftIndex: number,
  rightIndex: number
): number => {
  const candidate = arr[leftIndex];
  let i = leftIndex;
  let j = rightIndex;

  const swap = (arr: number[], i: number, j: number) => {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  };
  while (i < j) {
    while (i < rightIndex && arr[i] <= candidate) {
      i++;
    }

    while (j > leftIndex && arr[j] >= candidate) {
      j--;
    }

    if (i < j) {
      swap(arr, i, j);
    }
  }

  swap(arr, leftIndex, j);

  return j;
};

const quickSort = (arr: number[], leftIndex?: number, rightIndex?: number) => {
  if (leftIndex === undefined) {
    leftIndex = 0;
  }

  if (rightIndex === undefined) {
    rightIndex = arr.length - 1;
  }

  if (leftIndex >= rightIndex) {
    return;
  }

  const candidateIndex = partition(arr, leftIndex, rightIndex);
  quickSort(arr, leftIndex, candidateIndex - 1);
  quickSort(arr, candidateIndex + 1, rightIndex);
};

export default quickSort;

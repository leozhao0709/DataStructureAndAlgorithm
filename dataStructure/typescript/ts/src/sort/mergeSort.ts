export const mergeSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr.slice();

  return mergeSortHelp(arrCopy, 0, arrCopy.length - 1);
}

const mergeSortHelp = <T>(arr: T[], minIndex: number, maxIndex: number): T[] => {
  if (minIndex >= maxIndex) {
    return arr;
  }
  const mid = Math.floor((minIndex + maxIndex) / 2);


  const left = mergeSortHelp(arr.slice(0, mid + 1), 0, mid);
  const right = mergeSortHelp(arr.slice(mid, arr.length), mid + 1, arr.length - 1);

  return merge(left, right);
};

const merge = <T>(arrLeft: T[], arrRight: T[]): T[] => {
  const result: T[] = [];

  let i = 0; // result index
  let j = 0; // left index
  let k = 0; // right index

  while (i < arrLeft.length + arrRight.length) {
    if (arrLeft[j] >= arrRight[k]) {
      result.push(arrLeft[j]);
      j++;
    } else {
      result.push(arrRight[k]);
      k++;
    }
    i++;
  }


  return result;
}

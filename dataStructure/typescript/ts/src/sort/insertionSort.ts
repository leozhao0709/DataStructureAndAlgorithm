export const insertionSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr;

  for (let i = 1; i < arrCopy.length; i++) {
    const current = arrCopy[i];
    let pos = 0;
    for (let j = i; j > 0; j--) {
      if (current < arrCopy[j - 1]) {
        arrCopy[j] = arrCopy[j - 1];
      } else {
        pos = j;
        break;
      }
    }
    arrCopy[pos] = current;
  }

  return arrCopy;
};

export const shellSort = <T>(arr: T[] = [], factor: number = 2): T[] => {
  const arrCopy = arr.slice();

  if (factor < 1 || factor > arr.length) {
    throw Error('factor must be greater than 1 and smaller than array length');
  }

  let gap = Math.floor(arrCopy.length / factor);

  while (gap > 0) {
    for (let i = gap; i < arrCopy.length; i++) {
      for (let j = i; j >= gap; j -= gap) {
        if (arrCopy[j - gap] > arrCopy[j]) {
          [arrCopy[j - gap], arrCopy[j]] = [arrCopy[j], arrCopy[j - gap]];
        } else {
          break;
        }
      }
    }

    gap = Math.floor(gap / factor);
  }


  return arrCopy;
};


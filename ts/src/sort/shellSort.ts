export const shellSort = <T>(arr: T[] = [], factor: number = 1): T[] => {
  const arrCopy = arr.slice();

  if (factor < 1 || factor > arr.length) {
    throw Error('factor must be greater than 1 and smaller than array length');
  }

  let gap = Math.floor(arrCopy.length / factor);

  while (gap > 0) {
    for (let i = 0; i < gap; i++) {

    }

    gap = Math.floor(gap / factor);
  }


  return arrCopy;
};


export const shellSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr;



  return arrCopy;
};

const selectionSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr.slice();

  for (let i = 1; i < arr.length; i++) {
    const currentValue = arrCopy[i];
    for (let j = i; j > 0; j--) {
      if (currentValue < arrCopy[j - 1]) {
        arrCopy[j] = arrCopy[j - 1];
      } else {
        arrCopy[j] = currentValue;
        break;
      }
    }
  }

  return arrCopy;
};

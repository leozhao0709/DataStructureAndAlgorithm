export const selectionSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr.slice();

  for (let i = 0; i < arrCopy.length; i++) {

    let minIndex = i;

    for (let j = i + 1; j < arrCopy.length; j++) {
      if (arrCopy[j] < arrCopy[minIndex]) {
        minIndex = j;
      }
    }

    [arrCopy[i], arrCopy[minIndex]] = [arrCopy[minIndex], arrCopy[i]];
  }

  return arrCopy;
};




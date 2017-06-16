export const quickSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr.slice();
  if (arrCopy.length <= 1) {
    return arrCopy;
  }

  const refInitialIndex = Math.floor(Math.random() * arrCopy.length);
  const ref = arrCopy[refInitialIndex];
  [arrCopy[refInitialIndex], arrCopy[arrCopy.length - 1]] = [arrCopy[arrCopy.length - 1], arrCopy[refInitialIndex]];

  let refFinalIndex = 0;
  for (let i = 0; i < arrCopy.length - 1; i++) {
    if (arrCopy[i] < ref) {
      [arrCopy[i], arrCopy[refFinalIndex]] = [arrCopy[refFinalIndex], arrCopy[i]];
      refFinalIndex++;
    }
  }
  [arrCopy[refFinalIndex], arrCopy[arrCopy.length - 1]] = [arrCopy[arrCopy.length - 1], arrCopy[refFinalIndex]];

  return [...quickSort(arrCopy.slice(0, refFinalIndex)), ref, ...quickSort(arrCopy.slice(refFinalIndex + 1, arrCopy.length))];
}

export const quickSort1 = <T>(arr: T[]): T[] => {
  const arrCopy = arr;
  if (arr.length <= 1) {
    return arr;
  }
  const refInitialIndex = Math.floor(Math.random() * arrCopy.length);
  // const refInitialIndex = 0;
  const ref = arrCopy[refInitialIndex];

  const smallerThanRef: T[] = [];
  const largerThanRef: T[] = [];

  for (let i = 0; i < arrCopy.length; i++) {
    if (i === refInitialIndex) {
      continue;
    }
    if (arrCopy[i] < ref) {
      smallerThanRef.push(arrCopy[i]);
    } else {
      largerThanRef.push(arrCopy[i]);
    }
  }

  return [...quickSort1(smallerThanRef), ref, ...quickSort1(largerThanRef)];
}

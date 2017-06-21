export const printArr = <T>(arr: T[]): void => {
  let result = '';
  for (const value of arr) {
    result += ` ${value}`;
  }

  console.log(result);
}

const isSorted = <T>(arr: T[]): boolean => {
  for (let i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      return false;
    }
  }
  return true;
};

export const sortPerformanceTest = <T>(sortName: string, sortFunction: (arr: T[]) => T[], arr: T[]): void => {
  console.time(sortName);
  const arrCopy = sortFunction(arr.slice());
  console.timeEnd(sortName);

  if (!isSorted(arrCopy)) {
    printArr(arrCopy);
    throw Error(`${sortName} is wrong!`);
  } else {
    console.log(`${sortName} succeed!`);
  }
}

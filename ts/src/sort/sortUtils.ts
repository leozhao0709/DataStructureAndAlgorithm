/**
 *
 * @param length the generated array length
 * @param minValue the min value in this array
 * @param maxValue the max value in this array
 */
export const getRandomArray = (length: number = 1, minValue: number, maxValue: number): number[] => {
  if (length < 0) {
    throw new Error('Array length is at least 0');
  }

  if (maxValue < minValue) {
    throw new Error('Max value must be greater than min value');
  }

  const arr: number[] = [];
  for (let i = 0; i < length; i++) {
    arr[i] = Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
  }

  return arr;
};

export const getNearlySortedArray = (length: number = 1, swapTimes: number = 0): number[] => {
  const arr: number[] = [];

  for (let i = 0; i < length; i++) {
    arr[i] = i;
  }

  for (let i = 0; i < swapTimes; i++) {
    const posX = Math.floor(Math.random() * length);
    const posY = Math.floor(Math.random() * length);
    [arr[posX], arr[posY]] = [arr[posY], arr[posX]];
  }
  return arr;
};

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
    throw Error(`${sortName} is wrong!`);
  } else {
    console.log(`${sortName} succeed!`);
  }
}

import { swap } from '../utils/swap';
export const heapSort = <T>(arr: T[]): T[] => {
  const arrCopy = arr.slice();

  for (let i = Math.floor((arrCopy.length - 2) / 2); i >= 0; i--) {
    shiftDown(arrCopy, i, arrCopy.length - 1);
  }
  // console.log(arrCopy);
  for (let i = arrCopy.length - 1; i > 0; i--) {
    swap(arrCopy, 0, i);
    shiftDown(arrCopy, 0, i - 1);
  }

  return arrCopy;
};

const shiftDown = <T>(arr: T[], index: number, lastIndex: number) => {
  let i = index;
  let leftChildIndex = 2 * i + 1;
  while (leftChildIndex <= lastIndex) {
    let maxIndex = leftChildIndex;
    const rightChildIndex = 2 * i + 2;
    if (rightChildIndex <= lastIndex && arr[rightChildIndex] > arr[leftChildIndex]) {
      maxIndex = rightChildIndex;
    }

    if (arr[maxIndex] > arr[i]) {
      swap(arr, maxIndex, i);
      i = maxIndex;
      leftChildIndex = 2 * i + 1;
    } else {
      break;
    }
  }
};

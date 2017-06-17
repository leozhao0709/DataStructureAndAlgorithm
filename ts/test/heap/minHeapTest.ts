import { getRandomArray, getNearlySortedArray } from '../../src/utils/getArray';
import { MinHeap } from '../../src/heap/minHeap';
import { sortPerformanceTest } from '../sort/sortTestUtils';
import { shellSort } from '../../src/sort/shellSort';
import { mergeSort } from '../../src/sort/mergeSort';
import { quickSort, quickSort1 } from '../../src/sort/quickSort';
const n = 1000000;
// const arr1 = getRandomArray(n, 0, n);
const arr1 = getNearlySortedArray(n, 10);


const heapSort1 = <T>(arr: T[]): T[] => {
  const minHeap = new MinHeap<T>();

  const arrCopy = arr;
  for (const value of arrCopy) {
    minHeap.insertItem(value);
  }

  let i = 0;
  while (!minHeap.isEmpty()) {
    arrCopy[i] = minHeap.extractMin();
    i++;
  }

  return arrCopy;
}

const heapSort2 = <T>(arr: T[]): T[] => {
  const arrCopy = arr;

  const minHeap = new MinHeap<T>();
  minHeap.heapify(arrCopy);

  let i = 0;
  while (!minHeap.isEmpty()) {
    arrCopy[i] = minHeap.extractMin();
    i++;
  }

  return arrCopy;

};

// sortPerformanceTest('mergeSort', mergeSort, arr1);
sortPerformanceTest('shellSort', shellSort, arr1);
sortPerformanceTest('quickSort', quickSort, arr1);
sortPerformanceTest('quickSort1', quickSort1, arr1);
sortPerformanceTest('heapSort1', heapSort1, arr1);
sortPerformanceTest('heapSort2', heapSort2, arr1);

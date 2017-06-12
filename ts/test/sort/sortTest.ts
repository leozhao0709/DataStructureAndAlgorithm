import { getRandomArray, sortPerformanceTest, getNearlySortedArray } from './sortUtils';
import { selectionSort } from '../../src/sort/selectionSort';
import { insertionSort } from '../../src/sort/insertionSort';

const n = 100000;
const arr1 = getRandomArray(n, 0, n);
const arr2 = getNearlySortedArray(n, 10);

sortPerformanceTest('selectionSort', selectionSort, arr1);
sortPerformanceTest('insertionSort', insertionSort, arr1);

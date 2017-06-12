import { getRandomArray, sortPerformanceTest, getNearlySortedArray } from './sortUtils';
import { selectionSort } from './selectionSort';
import { insertionSort } from './insertionSort';

const n = 100000;
const arr1 = getRandomArray(n, 0, n);
const arr2 = getNearlySortedArray(n, 10);


sortPerformanceTest('selectionSort', selectionSort, arr2);
sortPerformanceTest('insertionSort', insertionSort, arr2);

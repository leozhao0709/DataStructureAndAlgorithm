import { getRandomArray, sortPerformanceTest, getNearlySortedArray } from './sortUtils';
import { selectionSort } from '../../src/sort/selectionSort';
import { insertionSort, insertionSort1 } from '../../src/sort/insertionSort';
import { shellSort, shellSort1 } from '../../src/sort/shellSort';

const n = 10000;
const arr1 = getRandomArray(n, 0, n);
// const arr1 = getNearlySortedArray(n, 10);

// sortPerformanceTest('selectionSort', selectionSort, arr1);
sortPerformanceTest('insertionSort', insertionSort, arr1);
sortPerformanceTest('insertionSort1', insertionSort1, arr1);
sortPerformanceTest('shellSort', shellSort, arr1);
sortPerformanceTest('shellSort1', shellSort1, arr1);

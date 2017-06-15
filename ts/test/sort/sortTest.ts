import { getRandomArray, sortPerformanceTest, getNearlySortedArray } from './sortUtils';
import { selectionSort } from '../../src/sort/selectionSort';
import { insertionSort } from '../../src/sort/insertionSort';
import { shellSort } from '../../src/sort/shellSort';
import { mergeSort } from '../../src/sort/mergeSort';

const n = 100000;
const arr1 = getRandomArray(n, 0, n);
// const arr1 = getNearlySortedArray(n, 10);

// sortPerformanceTest('selectionSort', selectionSort, arr1);
// sortPerformanceTest('insertionSort', insertionSort, arr1);
sortPerformanceTest('shellSort', shellSort, arr1);
sortPerformanceTest('mergeSort', mergeSort, arr1);

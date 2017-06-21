import { getRandomArray, getNearlySortedArray } from '../../src/utils/getArray';
import { selectionSort } from '../../src/sort/selectionSort';
import { insertionSort } from '../../src/sort/insertionSort';
import { shellSort } from '../../src/sort/shellSort';
import { mergeSort } from '../../src/sort/mergeSort';
import { quickSort, quickSort1 } from '../../src/sort/quickSort';
import { sortPerformanceTest } from './sortTestUtils';
import { heapSort } from '../../src/heap/heaoSort';

const n = 1000000;
const arr1 = getRandomArray(n, 0, n);
// const arr1 = getNearlySortedArray(n, 10);

// sortPerformanceTest('selectionSort', selectionSort, arr1);
// sortPerformanceTest('insertionSort', insertionSort, arr1);
sortPerformanceTest('shellSort', shellSort, arr1);
sortPerformanceTest('mergeSort', mergeSort, arr1);
sortPerformanceTest('quickSort', quickSort, arr1);
sortPerformanceTest('quickSort1', quickSort1, arr1);
sortPerformanceTest('heapSort', heapSort, arr1);

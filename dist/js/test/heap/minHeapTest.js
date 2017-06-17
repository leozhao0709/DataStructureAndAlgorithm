"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var getArray_1 = require("../../src/utils/getArray");
var minHeap_1 = require("../../src/heap/minHeap");
var sortTestUtils_1 = require("../sort/sortTestUtils");
var shellSort_1 = require("../../src/sort/shellSort");
var quickSort_1 = require("../../src/sort/quickSort");
var n = 1000000;
// const arr1 = getRandomArray(n, 0, n);
var arr1 = getArray_1.getNearlySortedArray(n, 10);
var heapSort1 = function (arr) {
    var minHeap = new minHeap_1.MinHeap();
    var arrCopy = arr;
    for (var _i = 0, arrCopy_1 = arrCopy; _i < arrCopy_1.length; _i++) {
        var value = arrCopy_1[_i];
        minHeap.insertItem(value);
    }
    var i = 0;
    while (!minHeap.isEmpty()) {
        arrCopy[i] = minHeap.extractMin();
        i++;
    }
    return arrCopy;
};
var heapSort2 = function (arr) {
    var arrCopy = arr;
    var minHeap = new minHeap_1.MinHeap();
    minHeap.heapify(arrCopy);
    var i = 0;
    while (!minHeap.isEmpty()) {
        arrCopy[i] = minHeap.extractMin();
        i++;
    }
    return arrCopy;
};
// sortPerformanceTest('mergeSort', mergeSort, arr1);
sortTestUtils_1.sortPerformanceTest('shellSort', shellSort_1.shellSort, arr1);
sortTestUtils_1.sortPerformanceTest('quickSort', quickSort_1.quickSort, arr1);
sortTestUtils_1.sortPerformanceTest('quickSort1', quickSort_1.quickSort1, arr1);
sortTestUtils_1.sortPerformanceTest('heapSort1', heapSort1, arr1);
sortTestUtils_1.sortPerformanceTest('heapSort2', heapSort2, arr1);

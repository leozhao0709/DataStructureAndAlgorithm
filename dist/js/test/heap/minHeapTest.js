"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var getArray_1 = require("../../src/utils/getArray");
var minHeap_1 = require("../../src/heap/minHeap");
var n = 13;
var arr1 = getArray_1.getRandomArray(n, 0, n);
var minHeap = new minHeap_1.MinHeap();
for (var _i = 0, arr1_1 = arr1; _i < arr1_1.length; _i++) {
    var value = arr1_1[_i];
    minHeap.insertItem(value);
}
while (!minHeap.isEmpty()) {
    console.log(minHeap.extractMin());
}

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var getArray_1 = require("../../src/utils/getArray");
var maxHeap_1 = require("../../src/heap/maxHeap");
var n = 13;
var arr1 = getArray_1.getRandomArray(n, 0, n);
var maxHeap = new maxHeap_1.MaxHeap();
for (var _i = 0, arr1_1 = arr1; _i < arr1_1.length; _i++) {
    var value = arr1_1[_i];
    maxHeap.insertItem(value);
}
while (!maxHeap.isEmpty()) {
    console.log(maxHeap.extractMax());
}

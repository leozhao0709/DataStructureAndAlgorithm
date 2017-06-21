"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var swap_1 = require("../utils/swap");
exports.heapSort = function (arr) {
    var arrCopy = arr.slice();
    for (var i = Math.floor((arrCopy.length - 2) / 2); i >= 0; i--) {
        shiftDown(arrCopy, i, arrCopy.length - 1);
    }
    // console.log(arrCopy);
    for (var i = arrCopy.length - 1; i > 0; i--) {
        swap_1.swap(arrCopy, 0, i);
        shiftDown(arrCopy, 0, i - 1);
    }
    return arrCopy;
};
var shiftDown = function (arr, index, lastIndex) {
    var i = index;
    var leftChildIndex = 2 * i + 1;
    while (leftChildIndex <= lastIndex) {
        var maxIndex = leftChildIndex;
        var rightChildIndex = 2 * i + 2;
        if (rightChildIndex <= lastIndex && arr[rightChildIndex] > arr[leftChildIndex]) {
            maxIndex = rightChildIndex;
        }
        if (arr[maxIndex] > arr[i]) {
            swap_1.swap(arr, maxIndex, i);
            i = maxIndex;
            leftChildIndex = 2 * i + 1;
        }
        else {
            break;
        }
    }
};

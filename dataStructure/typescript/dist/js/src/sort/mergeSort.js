"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.mergeSort = function (arr) {
    var arrCopy = arr.slice();
    return mergeSortHelp(arrCopy, 0, arrCopy.length - 1);
};
var mergeSortHelp = function (arr, minIndex, maxIndex) {
    if (minIndex >= maxIndex) {
        return arr;
    }
    var mid = Math.floor((minIndex + maxIndex) / 2);
    var left = mergeSortHelp(arr.slice(0, mid + 1), 0, mid);
    var right = mergeSortHelp(arr.slice(mid, arr.length), mid + 1, arr.length - 1);
    return merge(left, right);
};
var merge = function (arrLeft, arrRight) {
    var result = [];
    var i = 0; // result index
    var j = 0; // left index
    var k = 0; // right index
    while (i < arrLeft.length + arrRight.length) {
        if (arrLeft[j] >= arrRight[k]) {
            result.push(arrLeft[j]);
            j++;
        }
        else {
            result.push(arrRight[k]);
            k++;
        }
        i++;
    }
    return result;
};

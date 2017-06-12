"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.insertionSort = function (arr) {
    var arrCopy = arr;
    for (var i = 1; i < arrCopy.length; i++) {
        var current = arrCopy[i];
        for (var j = i; j > 0; j--) {
            if (current < arrCopy[j - 1]) {
                arrCopy[j] = arrCopy[j - 1];
            }
            else {
                arrCopy[j] = current;
                break;
            }
        }
    }
    return arrCopy;
};

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.shellSort = function (arr) {
    var arrCopy = arr;
    return arrCopy;
};
var selectionSort = function (arr) {
    var arrCopy = arr.slice();
    for (var i = 1; i < arr.length; i++) {
        var currentValue = arrCopy[i];
        for (var j = i; j > 0; j--) {
            if (currentValue < arrCopy[j - 1]) {
                arrCopy[j] = arrCopy[j - 1];
            }
            else {
                arrCopy[j] = currentValue;
                break;
            }
        }
    }
    return arrCopy;
};

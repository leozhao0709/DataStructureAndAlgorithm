"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.selectionSort = function (arr) {
    var arrCopy = arr.slice();
    for (var i = 0; i < arrCopy.length; i++) {
        var minIndex = i;
        for (var j = i + 1; j < arrCopy.length; j++) {
            if (arrCopy[j] < arrCopy[minIndex]) {
                minIndex = j;
            }
        }
        _a = [arrCopy[minIndex], arrCopy[i]], arrCopy[i] = _a[0], arrCopy[minIndex] = _a[1];
    }
    return arrCopy;
    var _a;
};

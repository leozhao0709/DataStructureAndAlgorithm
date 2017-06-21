"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.shellSort = function (arr, factor) {
    if (arr === void 0) { arr = []; }
    if (factor === void 0) { factor = 2; }
    var arrCopy = arr.slice();
    if (factor < 1 || factor > arr.length) {
        throw Error('factor must be greater than 1 and smaller than array length');
    }
    var gap = Math.floor(arrCopy.length / factor);
    while (gap > 0) {
        for (var i = gap; i < arrCopy.length; i++) {
            for (var j = i; j > 0; j -= gap) {
                if (arrCopy[j - gap] > arrCopy[j]) {
                    _a = [arrCopy[j], arrCopy[j - gap]], arrCopy[j - gap] = _a[0], arrCopy[j] = _a[1];
                }
                else {
                    break;
                }
            }
        }
        gap = Math.floor(gap / factor);
    }
    return arrCopy;
    var _a;
};

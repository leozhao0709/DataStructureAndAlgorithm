"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.shellSort = function (arr, factor) {
    if (arr === void 0) { arr = []; }
    if (factor === void 0) { factor = 1; }
    var arrCopy = arr.slice();
    if (factor < 1 || factor > arr.length) {
        throw Error('factor must be greater than 1 and smaller than array length');
    }
    var gap = Math.floor(arrCopy.length / factor);
    while (gap > 0) {
        for (var i = 0; i < gap; i++) {
        }
        gap = Math.floor(gap / factor);
    }
    return arrCopy;
};

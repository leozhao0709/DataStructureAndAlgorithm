"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.quickSort = function (arr) {
    var arrCopy = arr.slice();
    if (arrCopy.length <= 1) {
        return arrCopy;
    }
    var refInitialIndex = Math.floor(Math.random() * arrCopy.length);
    var ref = arrCopy[refInitialIndex];
    _a = [arrCopy[arrCopy.length - 1], arrCopy[refInitialIndex]], arrCopy[refInitialIndex] = _a[0], arrCopy[arrCopy.length - 1] = _a[1];
    var refFinalIndex = 0;
    for (var i = 0; i < arrCopy.length - 1; i++) {
        if (arrCopy[i] < ref) {
            _b = [arrCopy[refFinalIndex], arrCopy[i]], arrCopy[i] = _b[0], arrCopy[refFinalIndex] = _b[1];
            refFinalIndex++;
        }
    }
    _c = [arrCopy[arrCopy.length - 1], arrCopy[refFinalIndex]], arrCopy[refFinalIndex] = _c[0], arrCopy[arrCopy.length - 1] = _c[1];
    return exports.quickSort(arrCopy.slice(0, refFinalIndex)).concat([ref], exports.quickSort(arrCopy.slice(refFinalIndex + 1, arrCopy.length)));
    var _a, _b, _c;
};
exports.quickSort1 = function (arr) {
    var arrCopy = arr;
    if (arr.length <= 1) {
        return arr;
    }
    var refInitialIndex = Math.floor(Math.random() * arrCopy.length);
    // const refInitialIndex = 0;
    var ref = arrCopy[refInitialIndex];
    var smallerThanRef = [];
    var largerThanRef = [];
    for (var i = 0; i < arrCopy.length; i++) {
        if (i === refInitialIndex) {
            continue;
        }
        if (arrCopy[i] < ref) {
            smallerThanRef.push(arrCopy[i]);
        }
        else {
            largerThanRef.push(arrCopy[i]);
        }
    }
    return exports.quickSort1(smallerThanRef).concat([ref], exports.quickSort1(largerThanRef));
};

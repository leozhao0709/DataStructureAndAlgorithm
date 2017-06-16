"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
/**
 *
 * @param length the generated array length
 * @param minValue the min value in this array
 * @param maxValue the max value in this array
 */
exports.getRandomArray = function (length, minValue, maxValue) {
    if (length === void 0) { length = 1; }
    if (length < 0) {
        throw new Error('Array length is at least 0');
    }
    if (maxValue < minValue) {
        throw new Error('Max value must be greater than min value');
    }
    var arr = [];
    for (var i = 0; i < length; i++) {
        arr[i] = Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
    return arr;
};
exports.getNearlySortedArray = function (length, swapTimes) {
    if (length === void 0) { length = 1; }
    if (swapTimes === void 0) { swapTimes = 0; }
    var arr = [];
    for (var i = 0; i < length; i++) {
        arr[i] = i;
    }
    for (var i = 0; i < swapTimes; i++) {
        var posX = Math.floor(Math.random() * length);
        var posY = Math.floor(Math.random() * length);
        _a = [arr[posY], arr[posX]], arr[posX] = _a[0], arr[posY] = _a[1];
    }
    return arr;
    var _a;
};

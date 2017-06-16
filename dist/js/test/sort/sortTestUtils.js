"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.printArr = function (arr) {
    var result = '';
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var value = arr_1[_i];
        result += " " + value;
    }
    console.log(result);
};
var isSorted = function (arr) {
    for (var i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
};
exports.sortPerformanceTest = function (sortName, sortFunction, arr) {
    console.time(sortName);
    var arrCopy = sortFunction(arr.slice());
    console.timeEnd(sortName);
    if (!isSorted(arrCopy)) {
        exports.printArr(arrCopy);
        throw Error(sortName + " is wrong!");
    }
    else {
        console.log(sortName + " succeed!");
    }
};

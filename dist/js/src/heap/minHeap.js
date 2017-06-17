"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var swap_1 = require("../utils/swap");
var MinHeap = (function () {
    function MinHeap() {
        this._arr = [];
    }
    /**
     * heapify
     */
    MinHeap.prototype.heapify = function (arr) {
        var arrCopy = arr.slice();
        this._arr = arrCopy;
        for (var i = Math.floor((arrCopy.length - 1) / 2); i >= 0; i--) {
            this.shiftDown(i);
        }
    };
    /**
     * insert
     */
    MinHeap.prototype.insertItem = function (item) {
        this._arr.push(item);
        this.shiftUp(this._arr.length - 1);
    };
    /**
     * extractMin
     */
    MinHeap.prototype.extractMin = function () {
        var min = this._arr[0];
        swap_1.swap(this._arr, 0, this._arr.length - 1);
        this._arr.splice(-1, 1);
        this.shiftDown(0);
        return min;
    };
    /**
     * isEmpty
     */
    MinHeap.prototype.isEmpty = function () {
        return this._arr.length === 0;
    };
    MinHeap.prototype.shiftUp = function (index) {
        var k = index;
        // parent node index
        var j = Math.floor((k - 1) / 2);
        while (j >= 0) {
            if (this._arr[j] > this._arr[k]) {
                swap_1.swap(this._arr, k, j);
            }
            else {
                break;
            }
            k = j;
            j = Math.floor((k - 1) / 2);
        }
    };
    MinHeap.prototype.shiftDown = function (index) {
        var k = index;
        var leftChildIndex = 2 * k + 1;
        while (leftChildIndex < this._arr.length) {
            var minChildIndex = leftChildIndex;
            var rightChildIndex = leftChildIndex + 1;
            if (rightChildIndex < this._arr.length && this._arr[rightChildIndex] < this._arr[leftChildIndex]) {
                minChildIndex = rightChildIndex;
            }
            if (this._arr[minChildIndex] < this._arr[k]) {
                swap_1.swap(this._arr, minChildIndex, k);
            }
            else {
                break;
            }
            k = minChildIndex;
            leftChildIndex = 2 * k + 1;
        }
    };
    return MinHeap;
}());
exports.MinHeap = MinHeap;

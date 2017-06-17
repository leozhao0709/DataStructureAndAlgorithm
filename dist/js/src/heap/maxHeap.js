"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var swap_1 = require("../utils/swap");
var MaxHeap = (function () {
    function MaxHeap() {
        this._arr = [];
    }
    ;
    /**
     * heapify
     */
    MaxHeap.prototype.heapify = function (arr) {
        var arrCopy = arr.slice();
        this._arr = arrCopy;
        for (var i = Math.floor((arrCopy.length - 1) / 2); i >= 0; i--) {
            this.shiftDown(i);
        }
    };
    /**
     * isEmpty
     */
    MaxHeap.prototype.isEmpty = function () {
        return this._arr.length === 0;
    };
    /**
     * length
     */
    MaxHeap.prototype.length = function () {
        return this._arr.length;
    };
    /**
     * insertItem
     */
    MaxHeap.prototype.insertItem = function (item) {
        this._arr.push(item);
        this.shiftUp(this._arr.length - 1);
    };
    /**
     * extractMax
     */
    MaxHeap.prototype.extractMax = function () {
        if (this.length() === 0) {
            throw Error('this heap is empty');
        }
        var max = this._arr[0];
        swap_1.swap(this._arr, 0, this.length() - 1);
        this._arr.splice(-1, 1);
        this.shiftDown(0);
        return max;
    };
    /**
     * deep
     */
    MaxHeap.prototype.deep = function () {
        var k = this.length();
        var deep = 0;
        while (k !== 0) {
            deep++;
            k = Math.floor(k / 2);
        }
        return deep;
    };
    MaxHeap.prototype.shiftUp = function (index) {
        var k = index;
        // current (index - 1)/2 will be the parent index
        while (this._arr[Math.floor((k - 1) / 2)] < this._arr[k] && k > 0) {
            swap_1.swap(this._arr, k, Math.floor((k - 1) / 2));
            k = Math.floor((k - 1) / 2);
        }
    };
    MaxHeap.prototype.shiftDown = function (index) {
        var k = index;
        // left child must be less than length
        while (2 * k + 1 < this.length()) {
            // k is current index, j is the max child index
            var j = 2 * k + 1;
            if (j + 1 < this.length() && this._arr[j] < this._arr[j + 1]) {
                j = j + 1;
            }
            if (this._arr[k] > this._arr[j]) {
                break;
            }
            swap_1.swap(this._arr, k, j);
            k = j;
        }
    };
    return MaxHeap;
}());
exports.MaxHeap = MaxHeap;

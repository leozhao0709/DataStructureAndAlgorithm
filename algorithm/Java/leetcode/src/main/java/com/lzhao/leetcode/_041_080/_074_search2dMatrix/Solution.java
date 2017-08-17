package com.lzhao.leetcode._041_080._074_search2dMatrix;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        if (matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;

        int i = this.binarySearchFirstCol(matrix, 0, m, target);

        if (i < 0 || i > m) {
            return false;
        }

        if (matrix[i][0] == target) {
            return true;
        }

        int j = this.binarySearchRow(matrix, i, 0, n, target);

        if (j < 0 || j > n) {
            return false;
        }

        return matrix[i][j] == target;
    }

    private int binarySearchRow(int[][] matrix, int row, int left, int right, int target) {
        if (left > right) {
            return right;
        }

        int middle = left + (right-left)/2;
        if (matrix[row][middle] == target) {
            return middle;
        } else if (matrix[row][middle] < target) {
            return this.binarySearchRow(matrix, row, middle+1, right, target);
        } else {
            return this.binarySearchRow(matrix, row, left, middle-1, target);
        }
    }

    private int binarySearchFirstCol(int[][] matrix, int top, int bottom, int target) {
        if (top > bottom) {
            return bottom;
        }

        int middle = top + (bottom-top)/2;
        if (matrix[middle][0] == target) {
            return middle;
        } else if (matrix[middle][0] < target) {
            return this.binarySearchFirstCol(matrix, middle+1, bottom, target);
        } else {
            return this.binarySearchFirstCol(matrix, top, middle-1, target);
        }
    }
}

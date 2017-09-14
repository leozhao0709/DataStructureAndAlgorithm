package com.lzhao.leetcode._201_240._240_searchA2DMatrix2;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }

        int cols = matrix[0].length;

        if (cols == 0) {
            return false;
        }

        int row = this.binarySearchInWhichRow(matrix, 0, rows-1, target);

        if (row < 0 || row > rows-1) {
            return false;
        }

        for (int i = 0; i <= row; i++)
        {
            int col = this.binarySearchInWhichCol(matrix, i, 0, cols-1, target);
            if (col >= 0 && col <= cols-1) {
                return true;
            }
        }

        return false;
    }

    private int binarySearchInWhichCol(int[][] matrix, int row, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int middle = start + (end - start)/2;
        if (matrix[row][middle] == target) {
            return middle;
        } else if (matrix[row][middle] < target) {
            return this.binarySearchInWhichCol(matrix, row, middle+1, end, target);
        } else {
            return this.binarySearchInWhichCol(matrix, row, start, middle-1, target);
        }
    }

    private int binarySearchInWhichRow(int[][] matrix, int start, int end, int target) {
        if (start > end) {
            return end;
        }

        int middle = start + (end - start)/2;

        if (matrix[middle][0] == target) {
            return middle;
        } else if (matrix[middle][0] < target) {
            return this.binarySearchInWhichRow(matrix, middle+1, end, target);
        } else {
            return this.binarySearchInWhichRow(matrix, start, middle-1, target);
        }
    }
}

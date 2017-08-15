package com.lzhao.leetcode._041_080._054_spiralMatrix;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    private List<Integer> result = new LinkedList<Integer>();

    List<Integer> spiralOrder(int[][] matrix) {


        if (matrix.length == 0) {
            return result;
        }


        int m = matrix.length;
        int n = matrix[0].length;

        int rowBegin = 0;
        int rowEnd = m-1;
        int colBegin = 0;
        int colEnd = n-1;

        this.spiralOrder(matrix, rowBegin, rowEnd, colBegin, colEnd);

        return result;
    }

    private void spiralOrder(int[][] matrix, int rowBegin, int rowEnd, int colBegin, int colEnd) {

        if (rowBegin > rowEnd || colBegin>colEnd) {
            return;
        }

        // 最上横行
        for (int i = colBegin; i <= colEnd ; i++)
        {
            result.add(matrix[rowBegin][i]);
        }
        rowBegin++;

        // 最右列
        for (int i = rowBegin; i <= rowEnd; i++)
        {
            result.add(matrix[i][colEnd]);
        }
        colEnd--;

        if (rowBegin <= rowEnd) {
            //最下行
            for (int i = colEnd; i >=colBegin ; i--)
            {
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;
        }

        if (colBegin <= colEnd) {
            //最左列
            for (int i = rowEnd; i >=rowBegin ; i--)
            {
                result.add(matrix[i][colBegin]);
            }
            colBegin++;
        }

        this.spiralOrder(matrix, rowBegin, rowEnd, colBegin, colEnd);
    }
}

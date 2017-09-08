package com.lzhao.leetcode._161_200._200_numberOfIslands;

/**
 * Created by lzhao on 9/8/17.
 */

class Solution {

    int numIslands(char[][] grid) {
        
        if (grid.length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;

        int res = 0;
        
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (grid[i][j] == '1') {
                    res++;
                    this.dfsMark(grid, i, j);
                }
            }
        }
        
        return res;
    }

    private void dfsMark(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return;
        }
        
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            this.dfsMark(grid, i-1, j);
            this.dfsMark(grid, i+1, j);
            this.dfsMark(grid, i, j-1);
            this.dfsMark(grid, i, j+1);
        }
    }


}

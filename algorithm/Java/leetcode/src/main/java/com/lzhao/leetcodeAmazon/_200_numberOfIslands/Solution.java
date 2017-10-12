package com.lzhao.leetcodeAmazon._200_numberOfIslands;

/**
 * Created by lzhao on 10/11/17.
 */

class Solution {

    int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == '1') {
                    count++;
                    this.helper(grid, i, j);
                }
            }
        }

        return count;
    }

    private void helper(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j<0 || j>= grid[0].length) {
            return;
        }

        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            //left
            this.helper(grid, i, j-1);
            //right
            this.helper(grid, i, j+1);
            //top
            this.helper(grid, i-1, j);
            //bottom
            this.helper(grid, i+1, j);
        }
    }
}

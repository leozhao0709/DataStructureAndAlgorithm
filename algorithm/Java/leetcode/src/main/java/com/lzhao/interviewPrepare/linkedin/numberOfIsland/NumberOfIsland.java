package com.lzhao.interviewPrepare.linkedin.numberOfIsland;

/**
 * Created by lzhao on 11/25/17.
 */

class NumberOfIsland {

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
                    this.dfsMark(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfsMark(char[][] grid, int i, int j) {
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') {
            return;
        }

        grid[i][j] = '0';
        this.dfsMark(grid, i-1, j);
        this.dfsMark(grid, i+1, j);
        this.dfsMark(grid, i, j-1);
        this.dfsMark(grid, i, j+1);
    }
}

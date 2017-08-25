package com.lzhao.leetcode._121_160._130_surroundedRegions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/25/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void solve() throws Exception {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };

        System.out.println("board before: ");

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        this.solution.solve(board);
        System.out.println("board after: ");

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
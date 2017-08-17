package com.lzhao.leetcode._041_080._074_search2dMatrix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
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
    public void searchMatrix() throws Exception {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

        assert this.solution.searchMatrix(matrix, 3);
        assertFalse(this.solution.searchMatrix(matrix, 4));

        matrix = new int[][] {{}};
        assertFalse(this.solution.searchMatrix(matrix, 1));

        matrix = new int[][] {{1}};
        assertFalse(this.solution.searchMatrix(matrix, 0));
        assertFalse(this.solution.searchMatrix(matrix, 2));
    }

}
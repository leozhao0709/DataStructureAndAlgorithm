package com.lzhao.leetcode._041_080._064_miniumPathSum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/15/17.
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
    public void minPathSum() throws Exception {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(21, this.solution.minPathSum(grid));
    }

}
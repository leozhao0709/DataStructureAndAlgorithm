package com.lzhao.leetcode._041_080._063_uniquePaths2;

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
    public void uniquePathsWithObstacles() throws Exception {
        int[][] table = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(2, this.solution.uniquePathsWithObstacles(table));

        table = new int[][]{{1, 0}};
        assertEquals(0, this.solution.uniquePathsWithObstacles(table));
    }

}
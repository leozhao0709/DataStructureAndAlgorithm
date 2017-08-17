package com.lzhao.leetcode._041_080._073_setMatrixZeroes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
    public void setZeroes() throws Exception {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        this.solution.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

        matrix = new int[][] {{0}, {1}};
        this.solution.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

}
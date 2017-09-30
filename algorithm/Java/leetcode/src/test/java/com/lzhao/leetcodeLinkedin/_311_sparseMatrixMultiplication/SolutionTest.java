package com.lzhao.leetcodeLinkedin._311_sparseMatrixMultiplication;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/29/17.
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
    public void multiply() throws Exception {
        int[][] A = new int[][]{{1, 0, 0}, {-1, 0, 3}};
        int[][] B = new int[][]{{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] res = this.solution.multiply(A, B);
        System.out.println(Arrays.deepToString(res));

        A = new int[][]{{1, -5}};
        B = new int[][]{{12}, {-1}};
        res = this.solution.multiply(A, B);
        System.out.println(Arrays.deepToString(res));
    }

}
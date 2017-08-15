package com.lzhao.leetcode._041_080._059_spiralMatrix2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/14/17.
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
    public void generateMatrix() throws Exception {
        int n = 4;
        System.out.println(Arrays.deepToString(this.solution.generateMatrix(n)));
    }

}
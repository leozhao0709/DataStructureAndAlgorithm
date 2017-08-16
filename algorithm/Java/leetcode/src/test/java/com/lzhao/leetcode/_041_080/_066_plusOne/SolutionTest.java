package com.lzhao.leetcode._041_080._066_plusOne;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
    public void plusOne() throws Exception {
        int[] digits = {5, 9, 9, 9};
        System.out.println(Arrays.toString(this.solution.plusOne(digits)));

        digits = new int[] {9, 9, 9, 9};
        System.out.println(Arrays.toString(this.solution.plusOne(digits)));

        digits = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(this.solution.plusOne(digits)));
    }

}
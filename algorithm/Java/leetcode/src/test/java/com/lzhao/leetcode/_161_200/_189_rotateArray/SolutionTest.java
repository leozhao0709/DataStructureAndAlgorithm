package com.lzhao.leetcode._161_200._189_rotateArray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/7/17.
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
    public void rotate() throws Exception {
        int[] nums = {1,2,3,4,5,6,7};
        this.solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

}
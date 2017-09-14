package com.lzhao.leetcode._201_240._238_productOfArrayExceptSelf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/13/17.
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
    public void productExceptSelf() throws Exception {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(this.solution.productExceptSelf(nums)));
    }

}
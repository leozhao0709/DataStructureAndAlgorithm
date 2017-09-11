package com.lzhao.leetcode._201_240._209_minimumSizeSubArraySum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/10/17.
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
    public void minSubArrayLen() throws Exception {
        int[] nums = {2,3,1,2,4,3};
        assertEquals(2, this.solution.minSubArrayLen(7, nums));
    }

}
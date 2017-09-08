package com.lzhao.leetcode._161_200._198_houseRobber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/8/17.
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
    public void rob() throws Exception {
        int[] nums = {2, 1, 1, 2};

        assertEquals(4, this.solution.rob(nums));
    }

}
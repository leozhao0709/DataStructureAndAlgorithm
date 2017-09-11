package com.lzhao.leetcode._201_240._213_houseRobber2;

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
    public void rob() throws Exception {
        int[] nums = {4,1,2,7,5,3,1};
        assertEquals(14, this.solution.rob(nums));
    }

}
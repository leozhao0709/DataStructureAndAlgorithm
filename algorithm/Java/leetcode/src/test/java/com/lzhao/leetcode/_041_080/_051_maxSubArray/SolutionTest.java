package com.lzhao.leetcode._041_080._051_maxSubArray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/13/17.
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
    public void maxSubArray() throws Exception {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, this.solution.maxSubArray(nums));

        nums = new int[]{-2, 1};
        assertEquals(1, this.solution.maxSubArray(nums));

        nums = new int[]{1, -1, -2};
        assertEquals(1, this.solution.maxSubArray(nums));
    }

}
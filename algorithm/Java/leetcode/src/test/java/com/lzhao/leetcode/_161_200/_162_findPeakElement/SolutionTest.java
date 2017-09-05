package com.lzhao.leetcode._161_200._162_findPeakElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/4/17.
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
    public void findPeakElement() throws Exception {
        int[] nums = {1, 2, 3, 1};
        assertEquals(2, this.solution.findPeakElement(nums));
    }

}
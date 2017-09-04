package com.lzhao.leetcode._121_160._153_findMinimumInRotatedSortedArray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/30/17.
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
    public void findMin() throws Exception {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};

        assertEquals(0, this.solution.findMin(nums));
    }

}
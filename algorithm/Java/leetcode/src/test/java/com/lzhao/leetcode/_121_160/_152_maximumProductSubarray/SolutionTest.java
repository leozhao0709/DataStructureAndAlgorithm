package com.lzhao.leetcode._121_160._152_maximumProductSubarray;

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
    public void maxProduct() throws Exception {
        int[] nums = {2,3,-2,4};
        assertEquals(6, this.solution.maxProduct(nums));

        System.out.println(this.solution.maxProduct(nums));

    }

}
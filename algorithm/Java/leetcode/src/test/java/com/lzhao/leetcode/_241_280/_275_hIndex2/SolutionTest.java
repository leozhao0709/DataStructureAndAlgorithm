package com.lzhao.leetcode._241_280._275_hIndex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/14/17.
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
    public void hIndex() throws Exception {
        int[] nums = {0, 1, 3, 5, 6};

        assertEquals(3, this.solution.hIndex(nums));
    }

}
package com.lzhao.leetcode._121_160._136_singleNumber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/26/17.
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
    public void singleNumber() throws Exception {
        int[] nums = {2, 3, 4, 3, 4, 2, 5, 6, 7, 7, 6};

        assertEquals(5, this.solution.singleNumber(nums));
    }

}
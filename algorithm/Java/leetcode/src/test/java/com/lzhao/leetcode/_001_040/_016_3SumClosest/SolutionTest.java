package com.lzhao.leetcode._001_040._016_3SumClosest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/5/17.
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
    public void threeSumClosest() throws Exception {

        int[] nums = new int[] {0, 2, 1, -3};
        assertEquals(0, this.solution.threeSumClosest(nums, 1));

        nums = new int[] {-1, 2, 1, -4};
        assertEquals(2, this.solution.threeSumClosest(nums, 1));
    }

}
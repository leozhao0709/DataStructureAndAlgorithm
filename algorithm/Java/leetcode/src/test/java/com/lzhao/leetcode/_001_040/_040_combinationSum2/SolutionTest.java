package com.lzhao.leetcode._001_040._040_combinationSum2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/10/17.
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
    public void combinationSum2() throws Exception {

        int[] nums = new int[] {10, 1, 2, 7, 6, 1, 5};

        System.out.println(this.solution.combinationSum2(nums, 8));
    }

}
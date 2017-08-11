package com.lzhao.leetcode._001_040._039_CombinationSum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

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
    public void combinationSum() throws Exception {
        int[] nums = new int[] {2, 3, 6, 7};

        System.out.println(this.solution.combinationSum(nums, 7));
    }

}
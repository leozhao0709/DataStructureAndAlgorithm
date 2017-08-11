package com.lzhao.leetcode._001_040._034_searchForARange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
    public void searchRange() throws Exception {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};

        System.out.println(Arrays.toString(this.solution.searchRange(nums, 8)));
    }

}
package com.lzhao.leetcode._201_240._228_summaryRanges;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 9/11/17.
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
    public void summaryRanges() throws Exception {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(Arrays.toString(this.solution.summaryRanges(nums).toArray()));

        nums = new int[] {0,2,3,4,6,8,9};
        System.out.println(Arrays.toString(this.solution.summaryRanges(nums).toArray()));
    }

}
package com.lzhao.leetcode._001_040._026_RemoveDuplicatesFromSortedArray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/7/17.
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
    public void removeDuplicates() throws Exception {
        int[] nums = new int[] {1, 1, 1, 2, 2, 3, 3};

        int result = this.solution.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }

}
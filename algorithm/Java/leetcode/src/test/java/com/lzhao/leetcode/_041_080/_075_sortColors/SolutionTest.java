package com.lzhao.leetcode._041_080._075_sortColors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
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
    public void sortColors() throws Exception {
        int[] nums = {2, 2, 1, 0, 1, 0, 1, 1, 0, 2};
        this.solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[] {1, 0};
        this.solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
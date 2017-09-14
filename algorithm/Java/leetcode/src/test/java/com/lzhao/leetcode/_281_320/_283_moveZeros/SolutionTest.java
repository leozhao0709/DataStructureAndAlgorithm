package com.lzhao.leetcode._281_320._283_moveZeros;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
    public void moveZeroes() throws Exception {
        int[] nums = {0, 1, 0, 3, 12};
        this.solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[] {0,0,0,5, 9, 0, 8, 0, 0};
        this.solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
package com.lzhao.leetcode._001_040._031_NextPermutation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/9/17.
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
    public void nextPermutation() throws Exception {
        int[] nums = new int[] {1, 3, 2};
        this.solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

//        nums = new int[] {3, 2, 1};
//        this.solution.nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
//
//        nums = new int[] {1, 1, 5};
//        this.solution.nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
//
//        nums = new int[] {2,3,1,3,3};
//        this.solution.nextPermutation(nums);
//        System.out.println(Arrays.toString(nums));
    }

}
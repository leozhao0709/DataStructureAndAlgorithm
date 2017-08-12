package com.lzhao.leetcode._041_080._047_permutations2;

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
    public void permute() throws Exception {
//        int[] nums = new int[] {1, 1, 2, 2};
        int[] nums = new int[] {3, 3, 0, 3};
//        int[] nums = new int[] {0, 1, 0, 0, 9};
//        int[] nums = new int[] {1, 1, 1, 2, 3};

        System.out.println(this.solution.permuteUnique(nums));
    }

}
package com.lzhao.leetcode._041_080._046_permutations;

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
        int[] nums = new int[] {1, 2, 3};
        System.out.println(this.solution.permute(nums));
    }

}
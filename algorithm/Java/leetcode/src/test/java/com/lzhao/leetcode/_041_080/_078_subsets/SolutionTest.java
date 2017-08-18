package com.lzhao.leetcode._041_080._078_subsets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/17/17.
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
    public void subsets() throws Exception {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = this.solution.subsets(nums);
        System.out.println(Arrays.deepToString(result.toArray()));
    }

}
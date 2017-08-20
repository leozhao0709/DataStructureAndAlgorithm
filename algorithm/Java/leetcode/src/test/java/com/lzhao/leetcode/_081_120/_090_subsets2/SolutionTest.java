package com.lzhao.leetcode._081_120._090_subsets2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/20/17.
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
    public void subsetsWithDup() throws Exception {
        int[] nums = {1, 2, 2};
//        System.out.println(Arrays.deepToString(this.solution.subsetsWithDup(nums).toArray()));

        nums = new int[]{1, 1, 2, 2};
//        System.out.println(Arrays.deepToString(this.solution.subsetsWithDup(nums).toArray()));

        nums = new int[]{4, 4, 4, 1, 4};
        System.out.println(Arrays.deepToString(this.solution.subsetsWithDup(nums).toArray()));
    }

}
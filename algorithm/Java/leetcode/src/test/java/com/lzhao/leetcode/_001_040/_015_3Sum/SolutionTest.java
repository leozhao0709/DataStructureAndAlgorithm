package com.lzhao.leetcode._001_040._015_3Sum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/5/17.
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
    public void threeSum() throws Exception {
        int[] array = new int[] {-1, 0, 1, 2, -1, -4};

        System.out.println(Arrays.deepToString(this.solution.threeSum(array).toArray()));

        array = new int[] {-2, 0, 0, 2, 2};
        System.out.println(Arrays.deepToString(this.solution.threeSum(array).toArray()));
    }

}
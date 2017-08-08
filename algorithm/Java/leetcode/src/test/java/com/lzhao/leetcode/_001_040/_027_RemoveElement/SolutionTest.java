package com.lzhao.leetcode._001_040._027_RemoveElement;

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
    public void removeElement() throws Exception {
        int[] nums = new int[] {2, 3, 3, 4, 5, 3, 6};

        int len = this.solution.removeElement(nums, 3);

        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }

}
package com.lzhao.leetcode._001_040._035_SearchInsertPosition;

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
    public void searchInsert() throws Exception {
        int[] nums = new int[] {1,3,5,6};
        assertEquals(2, this.solution.searchInsert(nums, 5));
        assertEquals(1, this.solution.searchInsert(nums, 2));
        assertEquals(4, this.solution.searchInsert(nums, 7));
        assertEquals(0, this.solution.searchInsert(nums, 0));
    }

}
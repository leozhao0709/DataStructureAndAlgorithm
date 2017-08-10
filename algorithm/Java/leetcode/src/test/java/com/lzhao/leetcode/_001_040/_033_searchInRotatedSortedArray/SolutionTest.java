package com.lzhao.leetcode._001_040._033_searchInRotatedSortedArray;

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
    public void search() throws Exception {
        int[] nums = new int[] {4, 5, 6, 7, 0, 1, 2};

        assertEquals(4, this.solution.search(nums, 0));
        assertEquals(-1, this.solution.search(nums, 9));

        nums = new int[] {3, 1};
        assertEquals(1, this.solution.search(nums, 1));
    }

}
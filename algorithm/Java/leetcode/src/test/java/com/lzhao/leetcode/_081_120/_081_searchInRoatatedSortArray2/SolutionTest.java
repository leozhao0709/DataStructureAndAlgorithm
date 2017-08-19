package com.lzhao.leetcode._081_120._081_searchInRoatatedSortArray2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/18/17.
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
        int[] nums = {4, 5, 6, 7, 1, 0, 2};
        assert this.solution.search(nums, 5);
        assertFalse(this.solution.search(nums, 3));
//
        nums = new int[]{4, 4, 5, 5, 6, 7, 7, 1, 0, 2};
        assert this.solution.search(nums, 7);
        assert this.solution.search(nums, 4);
        assertFalse(this.solution.search(nums, 3));

        nums = new int[] {1, 3, 1, 1, 1};
        assert this.solution.search(nums, 3);

        nums = new int[] { 3, 5, 1};
        assert this.solution.search(nums, 1);
    }

}
package com.lzhao.leetcode._001_040._004_MedianOfTwoSortedArray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 6/24/17.
 */
public class SolutionTest {
    @Test
    public void findMedianSortedArrays() throws Exception {

        Solution solution = new Solution();
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);
    }

}
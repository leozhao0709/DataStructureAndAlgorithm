package com.lzhao.leetcode._081_120._088_mergeSortedArray;

/**
 * Created by lzhao on 8/19/17.
 */

class Solution {

    void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];

        System.arraycopy(nums1, 0, temp, 0, m);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (temp[i] < nums2[j]) {
                nums1[k++] = temp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i < m) {
            nums1[k++] = temp[i++];
        }

        while (j < n) {
            nums1[k++] = nums2[j++];
        }
    }
}

package com.lzhao.leetcode._241_280._275_hIndex2;

/**
 * Created by lzhao on 9/14/17.
 */

class Solution {

    int hIndex(int[] citations) {
        return this.hIndex(citations, 0, citations.length-1, 0);
    }

    private int hIndex(int[] citations, int start, int end, int prev) {
        if (start > end) {
            return prev;
        }

        int middle = start + (end - start)/2;

        if (citations.length - middle <= citations[middle]) {
            return this.hIndex(citations, start, middle-1, citations.length-middle);
        } else {
            return this.hIndex(citations, middle+1, end, prev);
        }
    }
}

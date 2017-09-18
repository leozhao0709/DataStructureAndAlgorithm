package com.lzhao.leetcode._281_320._303_rangeSumQuery;

/**
 * Created by lzhao on 9/17/17.
 */

class NumArray {

    private int[] sumArray;
    private int length;

    public NumArray(int[] nums) {
        this.length = nums.length;
        this.setSumArray(nums);
    }

    private void setSumArray(int[] nums) {
        if (this.length > 0) {
            this.sumArray = new int[this.length];
            this.sumArray[0] = nums[0];
            for (int i = 1; i < this.length; i++) {
                this.sumArray[i] = this.sumArray[i-1] + nums[i];
            }
            }
    }

    public int sumRange(int i, int j) {
        int start = i >= 0 ? i: 0;
        int end = j < this.length? j: this.length-1;

        return start == 0?this.sumArray[end]:this.sumArray[end]-this.sumArray[start-1];
    }
}

package com.lzhao.leetcode._281_320._307_rangeSumQueryMutable;

/**
 * Created by lzhao on 9/18/17.
 */

class NumArray {
    
    private int[] sum;
    private int[] nums;
    
    public NumArray(int[] nums) {
        this.nums = nums;
        this.sum = new int[nums.length];
        if (nums.length > 0) {
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++)
            {
                sum[i] = sum[i-1] + nums[i];
            }
        }
    }
    
    public void update(int i, int val) {
        for (int j = i; j < sum.length; j++)
        {
            this.sum[j] = this.sum[j] + (val - this.nums[i]);
        }
        this.nums[i] = val;
    }
    
    public int sumRange(int i, int j) {
        if (i-1 <0) {
            return sum[j];
        }
        return sum[j] - sum[i-1];
    }
}

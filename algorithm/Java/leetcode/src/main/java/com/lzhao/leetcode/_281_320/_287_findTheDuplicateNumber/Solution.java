package com.lzhao.leetcode._281_320._287_findTheDuplicateNumber;

/**
 * Created by lzhao on 9/14/17.
 */

class Solution {
    
    int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        // 找到快慢指针相遇的地方
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        int find = 0;
        // 用一个新指针从头开始，直到和慢指针相遇
        while(find != slow){
            slow = nums[slow];
            find = nums[find];
        }
        return find;
    }
}

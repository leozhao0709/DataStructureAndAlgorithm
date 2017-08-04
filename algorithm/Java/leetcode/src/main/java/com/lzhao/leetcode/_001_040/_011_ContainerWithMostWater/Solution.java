package com.lzhao.leetcode._001_040._011_ContainerWithMostWater;

/**
 * Created by lzhao on 8/3/17.
 */

class Solution {

    int maxArea(int[] height) {
        int max = 0;

        // time out
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                int maxHeight = height[i] > height[j] ? height[j] : height[i];
//                if (maxHeight * (j - i) > max) {
//                    max = maxHeight * (j - i);
//                }
//            }
//        }

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }


        return max;
    }
}

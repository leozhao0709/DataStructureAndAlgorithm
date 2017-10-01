package com.lzhao.leetcodeLinkedin._605_canPlaceFlowers;

/**
 * Created by lzhao on 9/30/17.
 */

class Solution {
    
    boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length-1)?0:flowerbed[i+1];
                int prev = (i == 0)?0:flowerbed[i-1];
                if (next == 0 && prev == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }

        return n <= 0;
    }
}

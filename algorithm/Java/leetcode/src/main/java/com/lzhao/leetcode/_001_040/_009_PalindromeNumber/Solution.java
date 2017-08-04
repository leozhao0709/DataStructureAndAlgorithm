package com.lzhao.leetcode._001_040._009_PalindromeNumber;

/**
 * Created by lzhao on 8/3/17.
 */

class Solution {

    boolean isPalindrome(int x) {

        if (x < 0 || (x!=0 && x%10==0)) {
            return false;
        }

        int y = 0;

        while (x > y) {
            y = y * 10 + x%10;
            x /= 10;
        }

        return x == y || x == y/10;
    }
}

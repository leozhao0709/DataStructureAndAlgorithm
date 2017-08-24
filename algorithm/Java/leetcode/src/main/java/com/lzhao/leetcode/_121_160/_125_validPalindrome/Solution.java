package com.lzhao.leetcode._121_160._125_validPalindrome;

/**
 * Created by lzhao on 8/23/17.
 */

class Solution {

    boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        
        int head = 0;
        int tail = s.length() - 1;
        
        while (head <= tail) {
            if (!Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            } else if (!Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            } else {
                if (Character.toLowerCase(s.charAt(head)) == Character.toLowerCase(s.charAt(tail))) {
                    head++;
                    tail--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}

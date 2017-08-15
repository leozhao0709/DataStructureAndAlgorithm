package com.lzhao.leetcode._041_080._058_lengthOfLastWord;

/**
 * Created by lzhao on 8/14/17.
 */

class Solution {

    int lengthOfLastWord(String s) {
        int result = 0;

        if (s.length() == 0) {
            return result;
        }

        char[] c = s.trim().toCharArray();

        for (int i = c.length-1; i >=0 ; i--) {
            if (c[i] != ' ') {
                result++;
            }
            else {
                return result;
            }
        }

        return result;
    }
}

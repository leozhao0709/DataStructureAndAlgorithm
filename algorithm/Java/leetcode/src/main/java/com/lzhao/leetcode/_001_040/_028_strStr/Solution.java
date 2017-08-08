package com.lzhao.leetcode._001_040._028_strStr;

/**
 * Created by lzhao on 8/7/17.
 */

class Solution {
    int strStr(String haystack, String needle) {

        if(needle.length() == 0) {
            return 0;
        }

        int result = -1;

        int i = 0;
        int j = 0;

        while (i < haystack.length() && i - j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(i - j)) {
                i++;
            } else {
                j++;
                i = j;
            }

            if (i - j == needle.length()) {
                return j;
            }
        }

        return result;
    }
}

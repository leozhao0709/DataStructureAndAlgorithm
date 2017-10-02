package com.lzhao.leetcodeAmazon._005_longestPalindromicSubstring;

/**
 * Created by lzhao on 10/1/17.
 */

class Solution {

    String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String max = s.substring(0,1);

        for (int i = 0; i < s.length(); i++)
        {
            String temp1 = this.helper(s, i, i);
            String temp2 = this.helper(s, i, i+1);

            String tempMax = temp1.length()>temp2.length()?temp1:temp2;
            max = max.length()>tempMax.length()?max:tempMax;
        }

        return max;
    }

    private String helper(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start+1, end);
    }
}

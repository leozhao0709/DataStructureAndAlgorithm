package com.lzhao.leetcode._321_360._344_reverseString;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    String reverseString(String s) {
        return this.reverseString(s, 0, s.length()-1);
    }

    private String reverseString(String s, int start, int end) {
        StringBuilder sb = new StringBuilder(s);
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }

        return sb.toString();
    }
}

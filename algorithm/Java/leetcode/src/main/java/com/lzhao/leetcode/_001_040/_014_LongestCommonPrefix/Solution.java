package com.lzhao.leetcode._001_040._014_LongestCommonPrefix;

/**
 * Created by lzhao on 8/4/17.
 */

class Solution {

    String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) {
            return "";
        }

        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++)
        {
            commonPrefix = this.getCommonPrefix(commonPrefix, strs[i]);
        }

        return commonPrefix;
    }

    private String getCommonPrefix(String a, String b) {
        int length = a.length() > b.length()? b.length(): a.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++)
        {
            if (a.charAt(i) == b.charAt(i)) {
                sb.append(a.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}

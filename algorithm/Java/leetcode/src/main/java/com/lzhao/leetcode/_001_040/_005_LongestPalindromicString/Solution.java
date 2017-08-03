package com.lzhao.leetcode._001_040._005_LongestPalindromicString;


/**
 * Created by lzhao on 6/24/17.
 */

class Solution {

    String longestPalindrome(String s) {

        if (s.length() == 0) {
            return "";
        }

        String result;

        int longestLength = 0;

        //time out to list all the substr
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i ; j < s.length(); j++) {
//                if (this.isPalindorme(s, i, j) && j+1 - i > longestLength) {
//                    longestLength = j + 1 - i;
//                    result = s.substring(i, j + 1);
//                }
//            }
//        }

        int low = 0;
        int high = 1;

        for (int i = 0; i < s.length(); i++) {
            // odd Palindrome
            int j = 0;
            while (i - j >= 0 && i+j < s.length()) {
                if (s.charAt(i-j) == s.charAt(i+j)) {
                    if (i+j - (i - j) + 1 > longestLength) {
                        longestLength = i+j - (i - j) + 1;
                        low = i - j;
                        high = i + j + 1;
                    }
                    j++;
                } else {
                    break;
                }
            }

            // even Palindrome
            int k = 0;
            while (i - k >=0 && i + k + 1 < s.length()) {
                if (s.charAt(i-k) == s.charAt(i+k+1)) {
                    if ((i+k+1 - (i-k) + 1) > longestLength) {
                        longestLength = i+k+1 - (i-k) + 1;
                        low = i-k;
                        high = i+k+1+1;
                    }
                    k++;
                } else {
                    break;
                }
            }
        }

        result = s.substring(low, high);

        return result;
    }

    private boolean isPalindorme(String s, int from, int to) {
        if (from > to) {
            return false;
        }

        while (from < to) {
            if (s.charAt(from ++) != s.charAt(to --)) {
                return false;
            }
        }

        return true;
    }
}

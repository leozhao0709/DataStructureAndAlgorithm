package com.lzhao.interviewPrepare.linkedin.longestPalindromicSubstring;

/**
 * Created by lzhao on 11/26/17.
 */

class PalindromicSubstring {

    String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        boolean[][] table = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            table[i][i] = true;

            if (i != s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                table[i][i+1] = true;
            }
        }

        int start = 0;
        int end = 0;

        for (int i = s.length()-1; i >=0 ; i--)
        {
            for (int j = i+1; j < s.length(); j++)
            {
                if (table[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    table[i][j] = true;
                }

                if (table[i][j] && j - i > end - start) {
                    end = j;
                    start = i;
                }
            }
        }

        return s.substring(start, end+1);
    }
}

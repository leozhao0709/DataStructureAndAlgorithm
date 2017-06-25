package com.lzhao.leetcode._001_040._005_LongestPalindromicString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 6/24/17.
 */

class Solution {

    public String longestPalindrome(String s) {
        String result = "";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int p = 0;
        int q = 0;

        while (q < s.length()) {
            if (map.containsKey(s.charAt(q))) {
                if (q - p > result.length() - 1) {
                    result = s.substring(p, q + 1);
                    if (p <= map.get(s.charAt(q))) {
                        p = map.get(s.charAt(q)) + 1;
                    }
                }
            }

            map.put(s.charAt(q), q);
            q++;
        }

        return result;
    }
}

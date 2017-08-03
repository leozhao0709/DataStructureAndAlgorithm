package com.lzhao.leetcode._001_040._003_LongestSubstrWithoutRepeating;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 6/23/17.
 */

class Solution {

     int lengthOfLongestSubstring(String s) {
        int result = 0;

        Map<Character, Integer> resultMap = new HashMap<Character, Integer>();

        int p = 0;
        int q = 0;

        while (q < s.length()) {
            Character currentChar = s.charAt(q);

            if (q - p > result) {
                result = q - p;
            }
            if (resultMap.containsKey(currentChar)) {
                if (p <= resultMap.get(currentChar)) {
                    p = resultMap.get(currentChar) + 1;
                }
            }
            resultMap.put(currentChar, q);
            q++;
        }

        if (q - p > result) {
            result = q - p;
        }

        return result;
    }
}

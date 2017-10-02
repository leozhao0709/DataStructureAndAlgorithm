package com.lzhao.leetcodeAmazon._003_longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/30/17.
 */

class Solution {

    int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++)
        {
            Character curr = s.charAt(i);
            if (!map.containsKey(curr)) {
                map.put(curr, i);
            } else {
                max = Math.max(max, i-start);
                start = map.get(curr) < start?start:map.get(curr)+1;
                map.put(curr, i);
            }
        }

        max = Math.max(max, s.length()-start);
        return max;
    }
}

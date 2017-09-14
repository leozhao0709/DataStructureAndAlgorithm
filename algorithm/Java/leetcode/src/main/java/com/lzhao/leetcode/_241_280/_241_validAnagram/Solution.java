package com.lzhao.leetcode._241_280._241_validAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/13/17.
 */

class Solution {

    boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++)
        {
            Character curr = s.charAt(i);
            if (map.containsKey(curr)) {
                map.put(curr, map.get(curr)+1);
            } else {
                map.put(curr, 1);
            }
        }

        for (int i = 0; i < t.length(); i++)
        {
            Character curr = t.charAt(i);
            if (map.containsKey(curr)) {
                int times = map.get(curr);
                if (times == 1) {
                    map.remove(curr);
                } else {
                    map.put(curr, times-1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}

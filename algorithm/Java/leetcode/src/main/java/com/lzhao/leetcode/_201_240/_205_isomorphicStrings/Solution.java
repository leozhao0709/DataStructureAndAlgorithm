package com.lzhao.leetcode._201_240._205_isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/9/17.
 */

class Solution {

    boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        int i = 0;

        while (i < s.length()) {
            Character sCurr = s.charAt(i);
            Character tCurr = t.charAt(i);

            if (sMap.containsKey(sCurr) && tMap.containsKey(tCurr)) {
                if (sMap.get(sCurr).equals(tMap.get(tCurr))) {
                    sMap.put(sCurr, i);
                    tMap.put(tCurr, i);
                } else {
                    return false;
                }
            } else if (!sMap.containsKey(sCurr) && !tMap.containsKey(tCurr)) {
                sMap.put(sCurr, i);
                tMap.put(tCurr, i);
            } else {
                return false;
            }

            i++;
        }

        return true;
    }
}

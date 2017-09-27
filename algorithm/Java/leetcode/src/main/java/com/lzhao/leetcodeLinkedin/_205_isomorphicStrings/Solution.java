package com.lzhao.leetcodeLinkedin._205_isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/26/17.
 */

class Solution {

    boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character sCurr = s.charAt(i);
            Character tCurr = t.charAt(i);

            if (sMap.containsKey(sCurr) && tMap.containsKey(tCurr)) {
                if (!sMap.get(sCurr).equals(tMap.get(tCurr))) {
                    return false;
                } else {
                    sMap.put(sCurr, i);
                    tMap.put(tCurr, i);
                }
            } else if (!sMap.containsKey(sCurr) && !tMap.containsKey(tCurr)) {
                sMap.put(sCurr, i);
                tMap.put(tCurr, i);
            } else {
                return false;
            }
        }

        return true;
    }
}

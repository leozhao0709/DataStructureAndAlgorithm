package com.lzhao.leetcode._281_320._290_wordPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 9/14/17.
 */

class Solution {

    boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split("\\s+");

        if (pattern.length() != strArr.length) {
            return false;
        }


        Map<Character, Integer> patternMap = new HashMap<Character, Integer>();
        Map<String, Integer> strMap = new HashMap<String, Integer>();

        int i = 0;

        while (i < pattern.length()) {
            Character pCurr = pattern.charAt(i);
            String strCurr = strArr[i];

            if (!patternMap.containsKey(pCurr) && !strMap.containsKey(strCurr)) {
                patternMap.put(pCurr, i);
                strMap.put(strCurr, i);
            } else if (patternMap.containsKey(pCurr) && strMap.containsKey(strCurr)) {
                if (patternMap.get(pCurr).equals(strMap.get(strCurr))) {
                    patternMap.put(pCurr, i);
                    strMap.put(strCurr, i);
                } else {
                    return false;
                }
            } else {
                return false;
            }

            i++;
        }

        return true;
    }
}

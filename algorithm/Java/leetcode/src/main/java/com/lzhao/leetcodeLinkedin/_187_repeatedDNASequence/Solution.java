package com.lzhao.leetcodeLinkedin._187_repeatedDNASequence;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 9/26/17.
 */

class Solution {

    List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> res = new LinkedList<String>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String curr = s.substring(i, i+10);
            if (!map.containsKey(curr)) {
                map.put(curr, 1);
            } else {
                if (map.get(curr) == 1) {
                    res.add(curr);
                }
                map.put(curr, map.get(curr)+1);
            }
        }

        return res;
    }
}

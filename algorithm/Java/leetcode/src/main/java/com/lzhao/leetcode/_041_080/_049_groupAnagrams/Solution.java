package com.lzhao.leetcode._041_080._049_groupAnagrams;

import java.util.*;

/**
 * Created by lzhao on 8/13/17.
 */

class Solution {

    List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(final String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                map.put(key, new ArrayList<String>(){{add(str);}});
            }
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        
        return result;
    }
}

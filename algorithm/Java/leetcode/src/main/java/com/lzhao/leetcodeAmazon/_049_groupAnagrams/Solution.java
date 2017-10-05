package com.lzhao.leetcodeAmazon._049_groupAnagrams;

import java.util.*;

/**
 * Created by lzhao on 10/3/17.
 */

class Solution {

    List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<List<String>>();

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++)
        {
            final String curr = strs[i];
            char[] charArray = curr.toCharArray();
            Arrays.sort(charArray);
            if (map.containsKey(String.valueOf(charArray))) {
                map.get(String.valueOf(charArray)).add(curr);
            } else {
                List<String> list = new LinkedList<String>() {{
                    add(curr);
                }};
                map.put(String.valueOf(charArray), list);
            }
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}

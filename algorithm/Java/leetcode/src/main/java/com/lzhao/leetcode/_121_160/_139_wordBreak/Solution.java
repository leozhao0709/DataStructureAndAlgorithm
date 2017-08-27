package com.lzhao.leetcode._121_160._139_wordBreak;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 8/26/17.
 */

class Solution {

    Map<String, Boolean> map = new HashMap<String, Boolean>();

    boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        if (map.containsKey(s)) {
            return map.get(s);
        }

        for(String d: wordDict) {
            if (s.startsWith(d)) {
                if (this.wordBreak(s.substring(d.length()), wordDict)) {
                    return true;
                }
            }
        }

        map.put(s, false);

        return false;
    }
}

package com.lzhao.leetcodeAmazon._139_wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lzhao on 10/9/17.
 */

class Solution {

    boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet<String>(wordDict);
        dp[0] = true;

        for (int i = 1; i < s.length()+1; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}

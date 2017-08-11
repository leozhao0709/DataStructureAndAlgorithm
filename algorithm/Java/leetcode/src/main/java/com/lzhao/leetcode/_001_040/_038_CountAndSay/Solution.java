package com.lzhao.leetcode._001_040._038_CountAndSay;

/**
 * Created by lzhao on 8/10/17.
 */

class Solution {

    String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");

        for (int i = 1; i < n; i++)
        {
            StringBuilder pre = curr;
            curr = new StringBuilder();
            char say = pre.charAt(0);
            int count = 1;
            for (int j = 1; j < pre.length(); j++)
            {
                if (pre.charAt(j) == say) {
                    count++;
                } else {
                    curr.append(count).append(say);
                    count=1;
                    say = pre.charAt(j);
                }
            }
            curr.append(count).append(say);
        }

        return curr.toString();
    }
}

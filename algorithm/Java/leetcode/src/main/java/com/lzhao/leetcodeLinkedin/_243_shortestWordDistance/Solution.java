package com.lzhao.leetcodeLinkedin._243_shortestWordDistance;

/**
 * Created by lzhao on 9/27/17.
 */

class Solution {

    int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1;
        int i2 = -1;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
                if (i2 != -1) {
                    res = Math.min(res, i1-i2);
                }
            }

            if (words[i].equals(word2)) {
                i2 = i;
                if (i1 != -1) {
                    res = Math.min(res, i2 - i1);
                }
            }
        }

        return res;
    }
}

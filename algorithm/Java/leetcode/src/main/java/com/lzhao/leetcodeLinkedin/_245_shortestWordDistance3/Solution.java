package com.lzhao.leetcodeLinkedin._245_shortestWordDistance3;

/**
 * Created by lzhao on 9/27/17.
 */

class Solution {

    int shortestWordDistance(String[] words, String word1, String word2) {
        int i1 = -1;
        int i2 = -1;
        int distance = words.length;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
                if (i2!=-1) {
                    distance = i1!=i2?Math.min(distance, i1-i2):distance;
                }
            }

            if (words[i].equals(word2)) {
                i2 = i;
                if (i1 != -1) {
                    distance = i1!=i2?Math.min(distance,i2-i1):distance;
                }
            }
        }

        return distance;
    }

}

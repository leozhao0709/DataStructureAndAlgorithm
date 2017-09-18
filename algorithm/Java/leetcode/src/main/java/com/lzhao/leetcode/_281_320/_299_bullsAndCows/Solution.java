package com.lzhao.leetcode._281_320._299_bullsAndCows;

/**
 * Created by lzhao on 9/17/17.
 */

class Solution {

    String getHint(String secret, String guess) {
        int[] map = new int[10];
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            int currSec = secret.charAt(i) - '0';
            int currGue = guess.charAt(i) - '0';

            if (currGue == currSec) {
                bulls++;
            } else {
                map[currSec]++;
            }
        }


        for (int i = 0; i < guess.length(); i++) {
            int currSec = secret.charAt(i) - '0';
            int currGue = guess.charAt(i) - '0';

            if (currGue != currSec && map[currGue] > 0) {
                map[currGue]--;
                cows++;
            }
        }

        return bulls+"A"+cows+"B";
    }
}

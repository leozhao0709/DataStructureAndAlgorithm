package com.lzhao.leetcode._281_320._318_maximumProductOfWordLengths;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

    int maxProduct(String[] words) {
        int[] nums = new int[words.length];

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < words[i].length(); j++)
            {
                nums[i] = nums[i] | (1 <<(words[i].charAt(j) - 'a'));
            }
        }

        int res = 0;

        for (int i = 0; i < words.length; i++)
        {
            for (int j = i+1; j < words.length; j++)
            {
                if ((nums[i]&nums[j]) == 0 && words[i].length() * words[j].length() > res) {
                    res = words[i].length() * words[j].length();
                }
            }
        }

        return res;
    }
}

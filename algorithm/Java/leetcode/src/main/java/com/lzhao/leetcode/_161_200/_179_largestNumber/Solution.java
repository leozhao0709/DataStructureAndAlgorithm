package com.lzhao.leetcode._161_200._179_largestNumber;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by lzhao on 9/7/17.
 */

class Solution {

    String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String str: strs) {
            sb.append(str);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}

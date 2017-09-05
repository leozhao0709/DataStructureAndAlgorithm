package com.lzhao.leetcode._161_200._165_compareVersionNumbers;

/**
 * Created by lzhao on 9/4/17.
 */

class Solution {

    int compareVersion(String version1, String version2) {
        String[] v1Arr = version1.split("\\.");
        String[] v2Arr = version2.split("\\.");
        
        int i = 0, j = 0;
        
        while (i < v1Arr.length && j < v2Arr.length) {
            if (Integer.parseInt(v1Arr[i]) < Integer.parseInt(v2Arr[i])) {
                return -1;
            } else if (Integer.parseInt(v1Arr[i]) > Integer.parseInt(v2Arr[i])){
                return 1;
            }
            i++;
            j++;
        }

        while (i < v1Arr.length) {
            if (Integer.parseInt(v1Arr[i]) != 0) {
                return 1;
            }
            i++;
        }

        while (j < v2Arr.length) {
            if (Integer.parseInt(v2Arr[j]) != 0) {
                return -1;
            }
            j++;
        }

        return 0;

    }
}

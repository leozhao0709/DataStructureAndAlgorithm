package com.lzhao.leetcode._121_160._151_reverseWordsInAString;

/**
 * Created by lzhao on 8/30/17.
 */

class Solution {

    String reverseWords(String s) {
        String[] arr = s.split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for(String str: arr) {
            sb.append(str).append(" ");
        }

        return sb.toString().trim();
    }
}

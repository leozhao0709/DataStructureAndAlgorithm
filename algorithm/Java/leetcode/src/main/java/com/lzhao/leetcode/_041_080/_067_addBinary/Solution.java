package com.lzhao.leetcode._041_080._067_addBinary;

/**
 * Created by lzhao on 8/15/17.
 */

class Solution {

    String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        }

        if (b.length() == 0) {
            return a;
        }

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i>=0 || j>=0) {
            int p = i>=0 ? a.charAt(i)-'0':0;
            int q = j>=0 ? b.charAt(j)-'0':0;
            int sum = p+q+carry;
            carry = sum/2;
            sb.append(sum%2);
            j--;
            i--;
        }

        if (carry == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }

}

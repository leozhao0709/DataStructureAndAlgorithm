package com.lzhao.leetcode._081_120._093_restoreIPAddress;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/20/17.
 */

class Solution {

    private List<String> result = new LinkedList<String>();

    List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }

        this.helper(s, 0, s.length()-1, 0, new StringBuilder());
        return this.result;
    }

    private void helper(String s, int left, int right, int part, StringBuilder sb) {
        if (left > right || part >= 4) {
            return;
        }

        if (part == 3) {
            if (this.valide(s.substring(left))) {
                this.result.add(sb.append(s.substring(left)).toString());
            }
            return;
        }

        for (int i = 0; i < 4 && left+i < s.length(); i++) {
            String str = s.substring(left, left+i+1);
            if (this.valide(str)) {
                StringBuilder temp = new StringBuilder(sb.toString());
                this.helper(s, left+1+i, right, part+1, temp.append(str).append("."));
            } else {
                return;
            }
        }
    }

    private boolean valide(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }
        int digits = Integer.parseInt(s);
        return digits >= 0 && digits <= 255;
    }
}

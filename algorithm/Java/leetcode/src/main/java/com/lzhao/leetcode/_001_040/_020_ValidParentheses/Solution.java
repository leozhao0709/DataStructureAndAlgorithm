package com.lzhao.leetcode._001_040._020_ValidParentheses;

import java.util.Stack;

/**
 * Created by lzhao on 8/6/17.
 */

class Solution {

    boolean isValid(String s) {

        if (s.length() < 2) {
            return false;
        }

        Stack<String> stack = new Stack<String>();


        for (int i = 0; i < s.length(); i++) {
            String currentStr = String.valueOf(s.charAt(i));

            if (currentStr.equals("(")|| currentStr.equals("[") || currentStr.equals("{")) {
                stack.push(currentStr);
            } else {
                if (stack.empty()) {
                    return false;
                }

                String stackTop = stack.pop();
                if (currentStr.equals(")") && !stackTop.equals("(")) {
                    return false;
                }

                if (currentStr.equals("]") && !stackTop.equals("[")) {
                    return false;
                }

                if (currentStr.equals("}") && !stackTop.equals("{")) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}

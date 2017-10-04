package com.lzhao.leetcodeAmazon._020_validParentheses;

import java.util.Stack;

/**
 * Created by lzhao on 10/2/17.
 */

class Solution {

    boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i <s.length() ; i++)
        {
            Character curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character left = stack.pop();
                if (curr == ')' && left != '(' || curr == ']' && left != '[' || curr == '}' && left != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

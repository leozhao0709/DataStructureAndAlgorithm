package com.lzhao.leetcode._001_040._032_LongestValidParentheses;

import java.util.Stack;

/**
 * Created by lzhao on 8/9/17.
 */

class Solution {

    int longestValidParentheses(String s) {
        int result = 0;

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.empty()) {
                    int j = stack.pop();
                    if (i - j + 1 > result) {
                        result = i - j + 1;
                    }

                }
            }
        }

        return result;
    }
    
}

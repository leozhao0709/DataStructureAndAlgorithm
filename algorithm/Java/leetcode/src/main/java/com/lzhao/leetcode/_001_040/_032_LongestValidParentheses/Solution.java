package com.lzhao.leetcode._001_040._032_LongestValidParentheses;

import java.util.Stack;

/**
 * Created by lzhao on 8/9/17.
 */

class Solution {

    int longestValidParentheses(String s) {
        int result = 0;

        Stack<Integer> stack = new Stack<Integer>();
        int begin = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.empty()) {
                    begin = i+1;
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        if (i - begin+1 > result) {
                            result = i - begin+1;
                        }
                    } else {
                        if (i - stack.peek()> result) {
                            result = i - stack.peek();
                        }
                    }
                }
            }
        }

        return result;
    }
    
}

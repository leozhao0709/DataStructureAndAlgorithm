package com.lzhao.leetcode._121_160._150_evaluateReversePolishNotation;

import java.util.Stack;

/**
 * Created by lzhao on 8/29/17.
 */

class Solution {

    int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());

                if (token.equals("+")) {
                    stack.push(String.valueOf(op2 + op1));
                } else if (token.equals("-")) {
                    stack.push(String.valueOf(op2 - op1));
                } else if (token.equals("*")) {
                    stack.push(String.valueOf(op2 * op1));
                } else if (token.equals("/")) {
                    stack.push(String.valueOf(op2 / op1));
                }

            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}

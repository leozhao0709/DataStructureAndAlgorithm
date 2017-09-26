package com.lzhao.leetcodeLinkedin._150_evalReversePolishNotation;

import java.util.Stack;

/**
 * Created by lzhao on 9/25/17.
 */

class Solution {

    int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i].matches("-?\\d+")) {
                stack.push(tokens[i]);
            } else {
                int op1 = Integer.parseInt(stack.pop());
                int op2 = Integer.parseInt(stack.pop());
                if (tokens[i].equals("+")) {
                    stack.push(String.valueOf(op1+op2));
                } else if (tokens[i].equals("-")) {
                    stack.push(String.valueOf(op2-op1));
                } else if (tokens[i].equals("*")) {
                    stack.push(String.valueOf(op1*op2));
                } else if (tokens[i].equals("/")) {
                    stack.push(String.valueOf(op2/op1));
                }
            }
        }

        return Integer.parseInt(stack.pop());
    }
}

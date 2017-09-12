package com.lzhao.leetcode._201_240._224_basicCalculator;

import java.util.Stack;

/**
 * Created by lzhao on 9/11/17.
 */

class Solution {

    int calculate(String s) {
        String rpn = this.getRpn(s);
        Stack<Integer> stack = new Stack<Integer>();

        int i = 0;
        while (i < rpn.length())
        {
            Character curr = rpn.charAt(i);
            StringBuilder sb = new StringBuilder();
            while (i < rpn.length() && curr <= '9' && curr >= '0') {
                sb.append(curr);
                i++;
                if (i >= rpn.length()) {
                    break;
                }
                curr = rpn.charAt(i);
            }

            if (sb.length() > 0) {
                stack.push(Integer.parseInt(sb.toString()));
            }
            
            if (i < rpn.length()) {
                curr = rpn.charAt(i);
                while (curr == ' ') {
                    i++;
                    if (i >= rpn.length()) {
                        break;
                    }
                    curr = rpn.charAt(i);
                }

                if (i >= rpn.length()) {
                    break;
                }

                if (curr > '9' || curr < '0') {
                    int operator1 = stack.pop();
                    int operator2 = stack.pop();

                    int res = this.calculate(operator2, operator1, curr);
                    stack.push(res);
                    i++;
                }
            }
        }

        return stack.pop();
    }

    private String getRpn(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<Character>();

        int i = 0;

        loop: while (i < s.length()) {
            Character curr = s.charAt(i);

            while (curr == ' ') {
                i++;
                if (i >= s.length()) {
                    break loop;
                }
                curr = s.charAt(i);
            }

            if (curr >= '0' && curr <= '9') {
                sb.append(curr);
            } else {
                sb.append(' ');
                if (curr != ')') {
                    if (curr == '(') {
                        stack.push(curr);
                    } else {
                        if (!stack.isEmpty() && stack.peek() != '(') {
                            sb.append(stack.pop());
                        }
                        stack.push(curr);
                    }
                } else {
                    while (stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                }
            }
            i++;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    private int calculate(int operator1, int operator2, Character op) {
        switch (op) {
            case '+': return operator1+operator2;
            case '-': return operator1-operator2;
        }
        return -1;
    }
}

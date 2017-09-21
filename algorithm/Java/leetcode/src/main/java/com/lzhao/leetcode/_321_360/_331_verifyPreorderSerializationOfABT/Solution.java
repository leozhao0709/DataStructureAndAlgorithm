package com.lzhao.leetcode._321_360._331_verifyPreorderSerializationOfABT;

import java.util.Stack;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    boolean isValidSerialization(String preorder) {
        String[] strArr = preorder.split(",");

        Stack<String> stack = new Stack<String>();

        for (String aStrArr : strArr)
        {
            stack.push(aStrArr);
            while (stack.size() >= 3 && stack.peek().equals("#") && stack.get(stack.size() - 2).equals("#") && !stack.get(stack.size() - 3).equals("#"))
            {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.push("#");
            }
        }

        return stack.size()==1&&stack.peek().equals("#");
    }
}

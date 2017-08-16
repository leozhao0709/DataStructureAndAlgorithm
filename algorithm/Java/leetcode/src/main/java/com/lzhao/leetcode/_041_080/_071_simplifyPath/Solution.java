package com.lzhao.leetcode._041_080._071_simplifyPath;

import java.util.Stack;

/**
 * Created by lzhao on 8/16/17.
 */

class Solution {

    String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();

        String[] pathArr = path.split("/");
        Stack<String> stack = new Stack<String>();

        for (String str: pathArr) {
            if (str.equals(".") || str.equals("")) {
                continue;
            } else if (str.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }

        if (stack.empty()) {
            sb.append("/");
        }

        while (!stack.empty()) {
            sb.insert(0, "/" + stack.pop());
        }

        return sb.toString();
    }
}

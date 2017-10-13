package com.lzhao.leetcodeAmazon._interview_;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/13/17.
 */

class Solution {
    List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<String> ();

        for(int i=1; i<=n; i++) {
            // i is how many pairs of well-formed brackets
            this.helper(res, "", i, i); // for loop call this.helper(res, "", 1, 1) -> this.helper(res, "", 2, 2);
        }
        return res;
    }

    private void helper(List<String> res, String s, int left, int right) {
        //1st loop: 1.left=1 and right=1

        //2nd loop: 1. left = 2, right = 2
        if(left > right) {
            return;
        }


        if(left==0 && right==0) {
            // 1st loop: 4. res = ["()"]

            // 2nd loop: res = ["()", "(())"]
            // 2nd loop: res = ["()", "(())", "()()"]
            res.add(s);
            return;
        }

        if(left > 0) {
            //1st loop: 2. res = [], left = 0, s = "(", right = 1

            //2nd loop: res=["()"], left=1, s="(", right=2
            //2nd loop: res= ["()"], left=0, s="((", right=2

            //2nd loop: res=["()", "(())", left=0, s="()(", right=1]
            this.helper(res, s+"(", left-1, right);
        }


        if(right > 0) {
            //1st loop: 3. res = [], left = 0, s="()", right = 0

            //2nd loop: res= ["()"], left=0, s="(()", right=1
            //2nd loop: res= ["()"], left=0, s="(())", right=0

            //2nd loop: res=["()", "(())"], left=1, s="()", right=1
            //2nd loop: res=["()", "(())"], left=0, s="()()", right=0
            this.helper(res, s+")", left, right-1);
        }
    }
}

package com.lzhao.interviewPrepare.linkedin.expressionAddOperators;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 12/5/17.
 */

class ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        List<String> res = new LinkedList<String>();
        this.helper(num, target, 0, 0, 0, "", res);
        return res;
    }

    private void helper(String nums, int target, int start, long curVal, long preVal, String currExpression, List<String> res) {
        if(start == nums.length()) {
            if(curVal == target) {
                res.add(currExpression);
            }
            return;
        }

        for(int i=start+1; i <= nums.length(); i++) {
            String curr = nums.substring(start, i);
            if(i!=start+1 && curr.charAt(0) == '0') {
                break;
            }
            Long val = Long.parseLong(curr);
            if(start == 0) {
                this.helper(nums, target, i, val, val, curr, res);
            } else {
                this.helper(nums, target, i, curVal+val, val, currExpression+"+"+curr, res);
                this.helper(nums, target, i, curVal-val, -val, currExpression+"-"+curr, res);
                this.helper(nums, target, i, curVal-preVal+(preVal*val), preVal*val, currExpression+"*"+curr, res);
            }
        }
    }
}

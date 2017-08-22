package com.lzhao.leetcode._081_120._118_pascalTriangle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        if (numRows == 0) {
            return res;
        }

        res.add(new LinkedList<Integer>(){{
            add(1);
        }});

        for (int i = 1; i < numRows; i++)
        {
            List<Integer> subRes = new LinkedList<Integer>();
            List<Integer> lastRes = res.get(res.size() - 1);
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i) {
                    subRes.add(1);
                } else {
                    int temp1 = lastRes.get(j-1);
                    int temp2 = lastRes.get(j);
                    subRes.add(temp1 + temp2);
                }
            }
            res.add(subRes);
        }

        return res;
    }
}

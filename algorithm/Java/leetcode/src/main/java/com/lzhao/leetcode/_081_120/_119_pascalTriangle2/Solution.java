package com.lzhao.leetcode._081_120._119_pascalTriangle2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 8/22/17.
 */

class Solution {

    List<Integer> getRow(int rowIndex) {

        List<Integer> res = new LinkedList<Integer>();

        for (int i = 0; i <= rowIndex; i++)
        {
            res.add(1);
        }

        if (rowIndex == 0) {
            return res;
        }


        for (int i = 1; i <= rowIndex; i++)
        {
            for (int j = i-1; j >=1 ; j--)
            {
                if (j == 0 || j == i) {
                    res.set(j, 1);
                } else {
                    res.set(j, res.get(j-1) + res.get(j));
                }
            }
        }

        return res;
    }
}

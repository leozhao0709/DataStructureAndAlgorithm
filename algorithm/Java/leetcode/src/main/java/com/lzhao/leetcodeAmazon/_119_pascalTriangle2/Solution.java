package com.lzhao.leetcodeAmazon._119_pascalTriangle2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/7/17.
 */

class Solution {

    List<Integer> getRow(int rowIndex) {
       List<Integer> res = new LinkedList<Integer>();
       
       if (rowIndex < 0) {
           return res;
       }
       
       if (rowIndex == 0) {
           res.add(1);
           return res;
       }

       if (rowIndex == 1) {
           res.add(1);
           res.add(1);
           return res;
       }

       for (int i = 0; i <= rowIndex; i++)
        {
            res.add(1);
        }

        for (int i = 2; i <= rowIndex; i++)
        {
            for (int j = i; j>=1 ; j--)
            {
                if (j == 0 || j == i) {
                    res.set(j, 1);
                } else {
                    res.set(j, res.get(j)+res.get(j-1));
                }
            }
        }

        return res;
    }
}

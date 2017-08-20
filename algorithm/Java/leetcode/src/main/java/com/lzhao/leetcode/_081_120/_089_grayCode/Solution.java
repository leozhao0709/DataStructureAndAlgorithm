package com.lzhao.leetcode._081_120._089_grayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhao on 8/19/17.
 */

class Solution {

//    private List<Integer> result = new ArrayList<Integer>();

//    List<Integer> grayCode(int n) {
//        if (n == 0) {
//            result.add(0);
//            return result;
//        }
//
//        result.add(0);
//        result.add(1);
//
//        for (int i = 1; i < n; i++) {
//            int higestBit = 1 << i;
//
//            for (int j = result.size() - 1; j >=0; j--) {
//                result.add(higestBit+result.get(j));
//            }
//        }
//
//        return this.result;
//    }

    List<Integer> grayCode(int n) {
        return grayCodeHelper(n);
    }

    private List<Integer> grayCodeHelper(int n) {
        if (n == 0) {
            return new ArrayList<Integer>() {
                {
                    add(0);
                }
            };
        }

        if (n == 1) {
            return new ArrayList<Integer>() {
                {
                    add(0);
                    add(1);
                }
            };
        }

        List<Integer> temp = this.grayCode(n-1);
        List<Integer> tempres = new ArrayList<Integer>(temp);
        int highBit = 1 << n-1;
        for (int i = temp.size()-1; i >=0 ; i--) {
            tempres.add(highBit+temp.get(i));
        }

        return tempres;
    }
}

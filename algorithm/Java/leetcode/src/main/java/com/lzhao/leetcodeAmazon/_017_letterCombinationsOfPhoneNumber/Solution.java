package com.lzhao.leetcodeAmazon._017_letterCombinationsOfPhoneNumber;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 10/2/17.
 */

class Solution {

    List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<String>();
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++)
        {
            res = this.helper(res, map[Character.getNumericValue(digits.charAt(i))]);
        }

        return res;
    }

    private List<String> helper(List<String> res, String s) {
        List<String> result = new LinkedList<String>();

        if (res.size() == 0) {
            for (int i = 0; i < s.length(); i++)
            {
                result.add(String.valueOf(s.charAt(i)));
            }
        } else {
            for (int i = 0; i < res.size(); i++)
            {
                String temp = res.get(i);
                for (int j = 0; j < s.length(); j++)
                {
                    result.add(temp+s.charAt(j));
                }
            }
        }

        return result;
    }
}

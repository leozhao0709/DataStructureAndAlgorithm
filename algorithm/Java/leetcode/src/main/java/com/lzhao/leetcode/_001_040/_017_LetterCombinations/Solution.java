package com.lzhao.leetcode._001_040._017_LetterCombinations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzhao on 8/5/17.
 */

class Solution {

    List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<String>();

        String[] array = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            if (i == 0) {
                for (int j = 0; j < array[digit].length(); j++) {
                    result.add(String.valueOf(array[digit].charAt(j)));
                }
            } else {
                result = this.twoArrayLetterCombination(result, array[digit]);
            }
        }

        return result;
    }

    private List<String> twoArrayLetterCombination(List<String> a, String b) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.length(); j++) {
                String tempA = a.get(i);
                Character tempB = b.charAt(j);
                result.add(tempA + tempB);
            }
        }

        return result;
    }
}

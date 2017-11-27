package com.lzhao.interviewPrepare.linkedin.romanInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lzhao on 11/24/17.
 */

class RomanInteger {

    int romanToInt(String s) {
        if (!this.validRomanString(s)) {
            throw new RuntimeException("invalid Roman string!!!");
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int res = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if (map.get(curr) <= map.get(prev)) {
                res += map.get(curr);
            } else {
                res = res - 2 * map.get(prev) + map.get(curr);
            }
        }

        return res;
    }

    //M是1000，D是500，C是100，L是50，X是10，V是5，I是1
    private boolean validRomanString(String s) {
        return s.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

    String intToRoman(int num) {
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "XI", "V", "VI", "I"};
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (nums[i] > num) {
                i++;
            } else {
                sb.append(symbols[i]);
                num -= nums[i];
            }
        }

        return sb.toString();
    }
}

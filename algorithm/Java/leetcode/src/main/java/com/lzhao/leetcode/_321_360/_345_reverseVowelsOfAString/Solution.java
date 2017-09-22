package com.lzhao.leetcode._321_360._345_reverseVowelsOfAString;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lzhao on 9/20/17.
 */

class Solution {

    String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;

        StringBuilder sb = new StringBuilder(s);
        Set<Character> set = new HashSet<Character>() {{
           add('a');
           add('e');
           add('i');
           add('o');
           add('u');
           add('A');
           add('E');
           add('I');
           add('O');
           add('U');
        }};

        while (start < end) {
            while (start < end) {
                if (set.contains(sb.charAt(start))) {
                    break;
                }
                start++;
            }
            while (start < end) {
                if (set.contains(sb.charAt(end))) {
                    break;
                }
                end--;
            }

            if (start >= end) {
                break;
            }

            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }

        return sb.toString();
    }
}

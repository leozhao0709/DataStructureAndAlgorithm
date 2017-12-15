package com.lzhao.interviewPrepare.linkedin.minimumWindowSubstring;

/**
 * Created by lzhao on 11/29/17.
 */

class MinimumWindowSubstring {

    String minWindow(String s, String t) {
        int[] tMap = new int[127];
        int[] sMap = new int[127];

        for (int i = 0; i < t.length(); i++)
        {
            tMap[t.charAt(i)]++;
        }

        int count = 0;
        int start = 0;
        int min = s.length();
        int begin = -1;
        int end = -1;
        for (int i = 0; i < s.length(); i++)
        {
            sMap[s.charAt(i)]++;
            if (tMap[s.charAt(i)] >= sMap[s.charAt(i)]) {
                count++;
            }

            if (count == t.length()) {
                while (start < i && sMap[s.charAt(start)] > tMap[s.charAt(start)]) {
                    sMap[s.charAt(start)]--;
                    start++;
                }


                if (i - start + 1 <= min) {
                    begin = start;
                    end = i;
                    min = i - start + 1;
                }

                count--;
                sMap[s.charAt(start)]--;
                start++;
            }
        }

        return begin == -1? "":s.substring(begin, end+1);
    }
}

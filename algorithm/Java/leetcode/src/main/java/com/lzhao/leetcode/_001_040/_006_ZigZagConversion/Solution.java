package com.lzhao.leetcode._001_040._006_ZigZagConversion;

/**
 * Created by lzhao on 8/3/17.
 */

class Solution {
    String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        int numberForEachGroup = numRows + (numRows - 2);
        int groupNumber = (int) Math.ceil((double) s.length()/numberForEachGroup);
        int numCols = groupNumber * (numRows - 1);

        String[][] table = new String[numRows][numCols];
        int index = 0;

        for (int i = 0; i < numCols; i++)
        {
            for (int j = 0; j < numRows; j++)
            {
                if (index < s.length()) {
                    int mod = i % (numRows - 1);
                    if (mod == 0) {
                        table[j][i] = String.valueOf(s.charAt(index++));
                    } else {
                        if (j == numRows - 1 -mod) {
                            table[j][i] = String.valueOf(s.charAt(index++));
                        } else {
                            table[j][i] = "";
                        }
                    }
                } else {
                    table[j][i] = "";
                }
            }
        }

        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                sb.append(table[i][j]);
            }
        }

        return sb.toString();
    }
}

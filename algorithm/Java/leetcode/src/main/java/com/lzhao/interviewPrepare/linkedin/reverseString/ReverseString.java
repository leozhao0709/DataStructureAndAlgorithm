package com.lzhao.interviewPrepare.linkedin.reverseString;

/**
 * Created by lzhao on 11/24/17.
 */

class ReverseString {
    String reverseString(String s) {
        char[] c = s.trim().toCharArray();
        int start = 0;
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] == ' ') {
                this.reverseCharArray(c, start, i-1);
                start = i+1;
            }
        }

        this.reverseCharArray(c, start, c.length-1);
        this.reverseCharArray(c, 0, c.length-1);

        return new String(c);
    }

    private void reverseCharArray(char[] c, int start, int end) {
        while (start < end) {
            char temp = c[start];
            c[start++] = c[end];
            c[end--] = temp;
        }
    }
}

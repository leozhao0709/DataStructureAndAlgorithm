package com.lzhao.leetcode._001_040._029_DivideTwoIntegers;

/**
 * Created by lzhao on 8/8/17.
 */

class Solution {

    int divide(int dividend, int divisor) {

        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        
        boolean negative = false;

        
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) {
            negative = true;
        }

        long result = 0;
        long dividendTemp = dividend;
        long divisorTemp = divisor;

        dividendTemp = Math.abs(dividendTemp);
        divisorTemp = Math.abs(divisorTemp);

        while (dividendTemp >= divisorTemp) {
            int i = 1;
            while (dividendTemp >= divisorTemp) {
                dividendTemp -= divisorTemp;
                result += i;
                divisorTemp = 2*divisorTemp;
                i = 2*i;

                if (result > Integer.MAX_VALUE) {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
            }
            divisorTemp = Math.abs((long)divisor);
        }

        return (int) (negative?-result:result);
    }
}

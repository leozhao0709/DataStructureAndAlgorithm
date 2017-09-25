package com.lzhao.leetcodeLinkedin._050_powXy;

/**
 * Created by lzhao on 9/23/17.
 */

class Solution {

    double myPow(double x, int n) {
        if (n < 0) {
            return 1/x * myPow(1/x, -(n+1));
        }
        if (n == 0) {
            return 1;
        }
        
        if (n==2) {
            return x*x;
        }

        if (n%2 == 0) {
            return myPow(myPow(x, n/2), 2);
        } else {
            return x * myPow(myPow(x, n/2), 2);
        }
    }
}

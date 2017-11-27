package com.lzhao.interviewPrepare.linkedin.doubleSqrt;

/**
 * Created by lzhao on 11/21/17.
 */

class DoubleSqrt {

    double mySqrt(double x, int diffBase) {
        if (x < 0) {
            return -1;
        }
        double diff = 1/Math.pow(10, diffBase);
        double end = x;
        if (x < 1) {
            end = 1.0;
        }
        return this.binarySearch(x, 0,  end, diff);
    }

    private double binarySearch(double x, double start, double end, double diff) {
        if (start > end - diff) {
            return start+(end - start)/2;
        }

        double mid = start + (end -start)/2;
        if (mid * mid == x) {
            return mid;
        } else if (mid > x/mid) {
            return this.binarySearch(x, start, mid, diff);
        } else {
            return this.binarySearch(x, mid, end, diff);
        }
    }
}

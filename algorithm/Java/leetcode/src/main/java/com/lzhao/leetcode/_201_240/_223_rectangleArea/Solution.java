package com.lzhao.leetcode._201_240._223_rectangleArea;

import java.util.Arrays;

/**
 * Created by lzhao on 9/11/17.
 */

class Solution {

    int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int dup = 0;
        
        if (E >= C || A >= G || F>=D || H<=B) {
            dup = 0;
        } else {
            int[] x = {A, C, E, G};
            int[] y = {B, D, F, H};
            Arrays.sort(x);
            Arrays.sort(y);
            dup = (x[2] - x[1]) * (y[2] - y[1]);
        }

        return (C - A) * (D - B) + (G - E)*(H - F) - dup;
    }
}

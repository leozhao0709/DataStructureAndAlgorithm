package com.lzhao.leetcodeLinkedin._170_twoSum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lzhao on 9/26/17.
 */

class TwoSum {

    private ArrayList<Integer> arr;
    private boolean sorted;

    /** Initialize your data structure here. */
    public TwoSum() {
        this.arr = new ArrayList<Integer>();
        this.sorted = false;
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        this.arr.add(number);
        this.sorted = false;
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        if (!this.sorted) {
            Collections.sort(this.arr);
            this.sorted = true;
        }

        int i = 0, j = this.arr.size()-1;

        while (i < j) {
            if (this.arr.get(i) + this.arr.get(j) == value) {
                return true;
            } else if (this.arr.get(i) + this.arr.get(j) > value) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}

package com.lzhao.interviewPrepare.linkedin.findTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lzhao on 11/24/17.
 */

class Triangle {

    List<List<Integer>> findTriangle(int[] arrs) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (arrs.length < 3) {
            return res;
        }

        Arrays.sort(arrs);

        for (int i = 0; i < arrs.length-2; i++)
        {
            for (int j = i+1; j < arrs.length-1; j++)
            {
                int k = j+1;

                while (k < arrs.length) {
                    if (arrs[i] + arrs[j] > arrs[k]) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(arrs[i]);
                        temp.add(arrs[j]);
                        temp.add(arrs[k]);
                        res.add(temp);
                    } else {
                        break;
                    }
                    k++;
                }
            }
        }

        return res;
    }

    int countTriangle(int[] arrs) {
        int count = 0;

        for (int i = 0; i < arrs.length-2; i++)
        {
            int k = i+2;
            for (int j = i+1; j < arrs.length-1; j++)
            {
                while (k < arrs.length) {
                    if (arrs[i] + arrs[j] > arrs[k]) {
                        k++;
                    } else {
                        break;
                    }
                }
                count += k-j-1;
            }
        }

        return count;
    }
}

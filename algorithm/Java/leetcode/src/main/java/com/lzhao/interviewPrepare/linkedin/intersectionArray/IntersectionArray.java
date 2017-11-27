package com.lzhao.interviewPrepare.linkedin.intersectionArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by lzhao on 11/22/17.
 */

class IntersectionArray {

    int[] intersection1(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        ArrayList<Integer> tempRes = new ArrayList<Integer>();
        for(Integer i: nums1) {
            map.put(i, false);
        }

        for(Integer i: nums2) {
            if (map.containsKey(i) && !map.get(i)) {
                tempRes.add(i);
                map.put(i, true);
            }
        }

        int[] res = new int[tempRes.size()];

        for (int i = 0; i < res.length; i++)
        {
            res[i] = tempRes.get(i);
        }

        return res;
    }

    int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j = 0;
        int index = 0;
        int[] temp = new int[nums1.length];

        while (i<nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (index == 0) {
                    temp[index++] = nums1[i];
                } else {
                    if (nums1[i] != temp[index-1]) {
                        temp[index++] = nums1[i];
                    }
                    i++;
                    j++;
                }
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[index];

        System.arraycopy(temp, 0, res, 0, res.length);

        return res;
    }
}

package com.lzhao.leetcode._321_360._322_coinChange;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lzhao on 9/19/17.
 */

class Solution {

//    private int coinsNumber = -1;
//    private List<Integer> list = new LinkedList<Integer>();
//    int coinChange(int[] coins, int amount) {
//        Arrays.sort(coins);
//        this.helper(coins, amount, 0, new LinkedList<Integer>());
//        System.out.println(Arrays.toString(this.list.toArray()));
//        return this.coinsNumber;
//    }
//
//    private void helper(int[] coins, int amount, int coinsNumber, List<Integer> list) {
//        if (amount == 0) {
//            this.coinsNumber = coinsNumber;
//            this.list = list;
//            return;
//        }
//
//        if (amount < 0) {
//            return;
//        }
//
//        for (int i = coins.length-1; i >=0; i--)
//        {
//            List<Integer> tempList = new LinkedList<Integer>(list);
//            tempList.add(coins[i]);
//            int temp = coinsNumber+1;
//            this.helper(coins, amount - coins[i], temp, tempList);
//            if (this.coinsNumber != -1) {
//                return;
//            }
//        }
//    }
}

package sort.binaryInsertionSort;

import sort.common.SortFunction;

/**
 * Created by lzhao on 7/23/17.
 */

public class BinaryInsertionSort implements SortFunction{

    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (i >= 1) {
                int correctPos;
                int pos = this.binarySearchPostion(array, 0, i - 1, current);
                if (array[pos] < current) {
                    correctPos = pos + 1;
                } else {
                    correctPos = pos;
                }
                for (int j = i; j > correctPos ; j--) {
                    array[j] = array[j - 1];
                }
                array[correctPos] = current;
            }

        }

        return array;
    }

    public int binarySearchPostion(int[] array, int leftIndex, int rightIndex, int target) {
        if (leftIndex >= rightIndex) {
            return leftIndex;
        }

        int midIndex = (leftIndex + rightIndex)/2;
        if (array[midIndex] < target) {
            return binarySearchPostion(array, midIndex+1, rightIndex, target);
        } else if (array[midIndex] > target) {
            return binarySearchPostion(array, leftIndex, midIndex-1, target);
        } else {
            return midIndex;
        }
    }
}

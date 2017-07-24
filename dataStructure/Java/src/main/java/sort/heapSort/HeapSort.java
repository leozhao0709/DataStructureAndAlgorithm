package sort.heapSort;

import sort.common.SortFunction;
import sort.common.SortUtils;

/**
 * Created by lzhao on 7/23/17.
 */

public class HeapSort implements SortFunction {

    public int[] sort(int[] array) {

        for (int i = array.length/2; i >= 0 ; i--) {
            shiftDown(array, i, array.length); // heapify
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            SortUtils.swap(array, i, 0);
            shiftDown(array, 0, i);
        }

        return array;
    }

    private void shiftDown(int[] array, int index, int maxLength) {
        int i = index;
        int leftChildIndex = 2 * i + 1;

        while (leftChildIndex < maxLength) {
            int bigChildIndex = leftChildIndex;
            int rightChildIndex = 2 * i + 2;
            if (rightChildIndex < maxLength && array[rightChildIndex] > array[leftChildIndex]) {
                bigChildIndex = rightChildIndex;
            }

            if (array[bigChildIndex] > array[i]) {
                SortUtils.swap(array, bigChildIndex, i);
                i = bigChildIndex;
                leftChildIndex = 2 * i + 1;
            } else {
                break;
            }
        }
    }
}

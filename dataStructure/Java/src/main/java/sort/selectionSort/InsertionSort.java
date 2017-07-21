package sort.selectionSort;

import sort.common.SortFunction;

/**
 * Created by lzhao on 7/20/17.
 */

public class InsertionSort implements SortFunction {
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int pos = 0;
            int current = array[i];
            for (int j = i ; j >= 1 ; j--) {
                if (array[j - 1] > current) {
                    array[j] = array[j - 1];
                } else {
                    pos = j;
                    break;
                }
            }
            array[pos] = current;
        }

        return array;
    }
}

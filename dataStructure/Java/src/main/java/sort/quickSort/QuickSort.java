package sort.quickSort;

import sort.common.SortFunction;

/**
 * Created by lzhao on 7/24/17.
 */

public class QuickSort implements SortFunction {

    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        
        if (low >= high) {
            return;
        }
        
        int p = partition(array, low, high);
        quickSort(array, low, p - 1);
        quickSort(array, p+1, high);
    }

    private int partition(int[] array, int low, int high) {
        return -1;
    }
}

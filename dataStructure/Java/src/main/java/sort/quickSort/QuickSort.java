package sort.quickSort;

import sort.common.SortFunction;
import sort.common.SortUtils;

import java.util.Arrays;

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

     int partition(int[] array, int low, int high) {

        int reference = array[low];
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= high && array[i] < reference) {
                i++;
            }
            while (j >= low+1 && array[j] > reference) {
                j--;
            }
            if ( i > j) {
                break;
            }
            SortUtils.swap(array, i, j);
            i++;
            j--;
        }
        SortUtils.swap(array, low, j);
        return j;
    }
}

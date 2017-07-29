package sort.mergeSort;

import sort.common.SortFunction;

/**
 * Created by lzhao on 7/25/17.
 */

public class MergeSort implements SortFunction {
    public int[] sort(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    private int[] mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return new int[]{ array[high] };
        }

        int middle = (low + high) / 2;
        int[] left = this.mergeSort(array, low, middle);
        int[] right = this.mergeSort(array, middle + 1, high);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        // left array index
        int i = 0;
        // right array index
        int j = 0;
        // result index
        int k = 0;

        while (true) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;

            if (i >= left.length || j >= right.length) {
                break;
            }
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}

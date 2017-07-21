package sort.selectionSort;
import sort.common.SortFunction;
import sort.common.SortUtils;

/**
 * Created by lzhao on 7/20/17.
 */

public class SelectionSort implements SortFunction {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++)
        {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < array.length; j++)
            {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            SortUtils.swap(array, i, minIndex);
        }

        return array;
    }
}

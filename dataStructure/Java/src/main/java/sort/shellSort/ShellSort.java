package sort.shellSort;

import sort.common.SortFunction;
import sort.common.SortUtils;

/**
 * Created by lzhao on 7/23/17.
 */

public class ShellSort implements SortFunction {

    public int[] sort(int[] array) {

        int gap = array.length/2;
        
        while (gap > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j >= gap ; j-=gap) {
                    if (array[j-gap] > array[j]) {
                        SortUtils.swap(array, j, j-gap);
                    } else {
                        break;
                    }
                }
            }
            
            gap = gap/2;
        }

        return array;
    }
}

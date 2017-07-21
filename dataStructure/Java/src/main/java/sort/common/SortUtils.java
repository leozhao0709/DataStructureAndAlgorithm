package sort.common;

/**
 * Created by lzhao on 7/20/17.
 */

public class SortUtils {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

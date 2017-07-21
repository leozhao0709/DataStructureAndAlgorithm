package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.common.SortFunction;
import sort.selectionSort.*;

import java.util.Arrays;

/**
 * Created by lzhao on 7/20/17.
 */
public class SortTest {
    private int[] array;

    @Before
    public void setUp() throws Exception {
        int n = 100000;

        this.array = this.getRandomArray(n, 0, n);
    }

    private int[] getRandomArray(int length, int minValue, int maxValue) {
        if (length < 0) {
            throw new RuntimeException("random array length must be greater than 0");
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
        {
            arr[i] = (int) (minValue + Math.random()*(maxValue - minValue + 1));
        }

        return arr;
    }

    private boolean isSortedArray(int[] array) {
        for (int i = 0; i < array.length-1; i++)
        {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    private void sortPerformanceTest(String sortName, int[] array, SortFunction sortFunction) {

        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);

        long startTime = System.currentTimeMillis();
        sortFunction.sort(arrayCopy);
        long endTime = System.currentTimeMillis();
        System.out.println(sortName + ": " + (endTime - startTime) + " ms");

        if (!isSortedArray(arrayCopy)) {
            System.out.println(Arrays.toString(arrayCopy));
            throw new RuntimeException(sortName + " is wrong!!!");
        } else {
            System.out.println(sortName + " succeed!");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void selectionSortTest() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        this.sortPerformanceTest("selectionSort", this.array, selectionSort);
    }

}
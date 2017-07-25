package sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sort.binaryInsertionSort.BinaryInsertionSort;
import sort.common.SortFunction;
import sort.heapSort.HeapSort;
import sort.insertionSort.InsertionSort;
import sort.quickSort.QuickSort;
import sort.selectionSort.*;
import sort.shellSort.ShellSort;

import java.util.Arrays;

/**
 * Created by lzhao on 7/20/17.
 */
public class SortTest {


    private int n = 1000000;

    private int[] array = this.getRandomArray(n, 0, n);

    @Before
    public void setUp() throws Exception {

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

        int[] sortedArrayCopy = this.getSortedCopyArray();

        for (int i = 0; i < sortedArrayCopy.length; i++)
        {
            if (array[i] != sortedArrayCopy[i]) {
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
            System.out.println("Original Array: " + Arrays.toString(this.array));
            System.out.println("-----------------------------------");
            System.out.println("Sorted result: " + Arrays.toString(arrayCopy));
            throw new RuntimeException(sortName + " is wrong!!!");
        } else {
            System.out.println(sortName + " succeed!");
        }

    }

    private int[] getSortedCopyArray() {
        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        Arrays.sort(arrayCopy);

        return arrayCopy;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void binarySortTest() throws Exception {
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        int[] array = new int[] {3, 1, 1, 0};
        binaryInsertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void performanceTest() throws Exception {
//        SelectionSort selectionSort = new SelectionSort();
//        this.sortPerformanceTest("selectionSort", this.array, selectionSort);

//        InsertionSort insertionSort = new InsertionSort();
//        this.sortPerformanceTest("insertionSort", this.array, insertionSort);

//        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
//        this.sortPerformanceTest("binaryInsertionSort", this.array, binaryInsertionSort);

        ShellSort shellSort = new ShellSort();
        this.sortPerformanceTest("shellSort", this.array, shellSort);

        HeapSort heapSort = new HeapSort();
        this.sortPerformanceTest("heapSort", this.array, heapSort);

        QuickSort quickSort = new QuickSort();
        this.sortPerformanceTest("quickSort", this.array, quickSort);
    }
}
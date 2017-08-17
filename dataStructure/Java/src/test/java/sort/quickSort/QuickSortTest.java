package sort.quickSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 8/16/17.
 */
public class QuickSortTest {

    private QuickSort quickSort;

    @Before
    public void setUp() throws Exception {
        this.quickSort = new QuickSort();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sort() throws Exception {
        int[] nums = {1, 2, 1, 0, 1, 0, 1, 1, 0, 2};
        int j = this.quickSort.partition(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        System.out.println(j);
    }

}
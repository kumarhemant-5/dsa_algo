package sorting;

import com.sorting.BubbleSort;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    BubbleSort sorter = new BubbleSort();

    @Test
    void testAlreadySortedArray() {
        int[] arr = {1,2,3,4,5};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = {5,4,3,2,1};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {4,1,3,5,2};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {10};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{10}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testTwoElementsSorted() {
        int[] arr = {1,2};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2}, arr);
    }

    @Test
    void testTwoElementsUnsorted() {
        int[] arr = {2,1};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2}, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {3,1,2,3,1};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,1,2,3,3}, arr);
    }

    @Test
    void testAllSameElements() {
        int[] arr = {7,7,7,7};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{7,7,7,7}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-3,-1,-7,-2};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{-7,-3,-2,-1}, arr);
    }

    @Test
    void testMixedPositiveNegative() {
        int[] arr = {3,-1,4,-2,0};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{-2,-1,0,3,4}, arr);
    }

    @Test
    void testLargeNumbers() {
        int[] arr = {1000,5000,100,300};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{100,300,1000,5000}, arr);
    }

    @Test
    void testZeros() {
        int[] arr = {0,5,0,3,0};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{0,0,0,3,5}, arr);
    }

    @Test
    void testNearlySorted() {
        int[] arr = {1,2,3,5,4};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5}, arr);
    }

    @Test
    void testLargeInput() {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, arr);
    }

    @Test
    void testBubbleSortWithFiveLakhElements() {

        int[] arr = new Random().ints(200000, -200000, 200000).toArray();
        int[] expected = arr.clone();
        long time1 = System.currentTimeMillis();
        Arrays.sort(expected);
        long time2 = System.currentTimeMillis();
        System.out.println("java sort: "+ (time2-time1));

        long time3 = System.currentTimeMillis();
        sorter.bubbleSort(arr);
        long time4 = System.currentTimeMillis();

        System.out.println("count sort: "+(time4-time3));
        assertArrayEquals(expected, arr);
    }
}

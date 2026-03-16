package com.sorting;

public class QuickSort {

    public void quickSort(int [] arr){
        quickSortAlgo(arr,0,arr.length-1);
    }
    public  void quickSortAlgo(int[] arr, int lo, int hi) {
        if (lo >= hi) return;

        int pi = partition(arr, lo, hi);
        quickSortAlgo(arr, lo, pi - 1);
        quickSortAlgo(arr, pi + 1, hi);
    }

    // Partition
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];   // pivot value
        int i = lo;            // boundary for smaller elements

        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                swap(i, j, arr);
                i++;
            }
        }
        swap(i, hi, arr);      // place pivot at correct position
        return i;
    }

    //swap
    public static void swap(int i, int j, int [] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

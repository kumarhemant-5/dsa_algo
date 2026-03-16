package com.sorting;

public class MergeSort {

    public int[] mergeSort(int [] arr){
        if(arr == null || arr.length == 0){
            return new int[0];
        }
        return mergerSortAlgo(arr,0,arr.length-1);
    }

    public static int[] mergerSortAlgo(int [] arr, int lo, int hi){
        if(lo==hi){
            return new int []{arr[lo]};
        }
        int mid = lo+(hi-lo)/2;
        int [] la =mergerSortAlgo(arr,lo,mid);
        int [] ra  =mergerSortAlgo(arr,mid+1,hi);
        return mergeTwoSortedArray(la,ra);
    }

    public static int[] mergeTwoSortedArray(int [] arr1, int[] arr2){
        int m=arr1.length, n= arr2.length,i=0,j=0,idx=0;
        int[] msa = new int[m+n];

        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                msa[idx++]=arr1[i++];
            }else{
                msa[idx++]=arr2[j++];
            }
        }
        while(i<m) msa[idx++]=arr1[i++];
        while(j<n)msa[idx++]=arr2[j++];
        return msa;
    }
}

package com.sorting;

public class CountSort {
    public  void countSort(int [] arr){
        if (arr == null || arr.length == 0) return;

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int e: arr){
            min= Math.min(e,min);
            max= Math.max(e,max);
        }

        int range = max-min;
        int [] fa = new int [range+1];

        for(int e: arr){
            fa[e-min]++;
        }

        for(int i=1; i<fa.length; i++){
            fa[i]+=fa[i-1];
        }

        int [] res = new int [arr.length];

        for(int i=arr.length-1; i>=0; i--){
            int val= arr[i];
            res[fa[val-min]-1]=val;
            fa[val-min]--;
        }

        System.arraycopy(res, 0, arr, 0, arr.length);
    }
}

package com.recursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationBacktrack {
    public static void main(String[] args) {

        String str = "raja";
        List<String> res = new ArrayList<String>();
       // permutate(str.toCharArray(),0,res);
        System.out.println(res);




    }

    public static void permutate(char [] arr, int index, List<String> res){
        if(index==arr.length){
            System.out.println(String.valueOf(arr));

            res.add(String.valueOf(arr));
            return;
        }

        for(int i = index; i<arr.length; i++){
            swap (arr,i,index);
            permutate(arr,index+1,res);
            swap(arr,i,index);
        }
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package com.recursionAndBacktracking;

public class Permutation {

    public static void main(String[] args) {
        String str = "abcdefghij";

//        String pre  = str.substring(0,1);
//        System.out.println(pre);
//        char ch = 'a';
        long t3 = System.currentTimeMillis();
        printPermutation(str,"");
        long t4 = System.currentTimeMillis();

        System.out.println(t4-t3);

        long t1 = System.currentTimeMillis();
     //   permute(str.toCharArray(),0);
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }

    public static void printPermutation(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            String st = str.substring(0,i)+str.substring(i+1);
            printPermutation(st,ans+str.charAt(i));
        }
    }

    public static void permute(char[] arr, int index){
        if(index == arr.length){
            System.out.println(String.valueOf(arr));
            return;
        }

        for(int i = index; i < arr.length; i++){
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i); // backtrack
        }
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

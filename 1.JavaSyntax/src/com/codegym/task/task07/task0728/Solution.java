package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here

        Arrays.sort(array);

        int[] newArray = new int[20];

        for(int i=0;i<=19;i++){
            newArray[i] = array[19-i];
        }

        for(int j=0;j<=19;j++){
            array[j] = newArray[j];
        }


    }
}

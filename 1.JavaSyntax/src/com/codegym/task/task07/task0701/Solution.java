package com.codegym.task.task07.task0701;

import java.io.*;
import java.util.Arrays;

/* 
Maximum in an array

*/

public class Solution {


    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] arr = new int[20];

        for(int i=1;i<=20;i++){
            InputStream inputStream = System.in;

            Reader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader buffer = new BufferedReader(inputStreamReader);

            String numberString1 = buffer.readLine();

            int number1 = Integer.parseInt(numberString1);

            arr[i-1] = number1;
        }

        return arr;
    }

    public static int max(int[] array) {
        // Find the maximum

        int max=Integer.MIN_VALUE;

        for(int c:array){
            if(c>max){
                max=c;
            }
        }

        return max;
    }
}

package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here


        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        String numberString2 = buffer.readLine();

        String numberString3 = buffer.readLine();

        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        int number3 = Integer.parseInt(numberString3);


        int[] arr = new int[]{number1,number2,number3};

        Arrays.sort(arr);

        for(int i=2;i>=0;i--){
            System.out.println(arr[i]);
        }


    }
}

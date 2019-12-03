package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int[] arr = new int[10];

        for(int i=1;i<=10;i++){
            InputStream inputStream = System.in;

            Reader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader buffer = new BufferedReader(inputStreamReader);

            String numberString1 = buffer.readLine();
            int number1 = Integer.parseInt(numberString1);

            arr[i-1]=number1;
        }

        for(int j=9;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}


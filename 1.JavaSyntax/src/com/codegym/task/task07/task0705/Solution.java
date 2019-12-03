package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(int i=0;i<=19;i++){
            InputStream inputStream = System.in;

            Reader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader buffer = new BufferedReader(inputStreamReader);

            String numberString1 = buffer.readLine();
            int number1 = Integer.parseInt(numberString1);
            arr[i]=number1;
        }

        for(int k=0;k<=19;k++){
            if(k<=9){
                arr1[k]=arr[k];
            }else if(k>9){
                arr2[k-10]=arr[k];
            }
        }

        for(int j=0;j<=9;j++){
            System.out.println(arr2[j]);
        }
    }
}

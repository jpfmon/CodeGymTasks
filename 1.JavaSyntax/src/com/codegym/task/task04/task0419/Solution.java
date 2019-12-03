package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        String numberString2 = buffer.readLine();

        String numberString3 = buffer.readLine();

        String numberString4 = buffer.readLine();

        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        int number3 = Integer.parseInt(numberString3);

        int number4 = Integer.parseInt(numberString4);

        int[] arr = new int[]{number1,number2,number3,number4};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<=3;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}

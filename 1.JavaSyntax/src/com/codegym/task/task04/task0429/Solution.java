package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

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

        int countneg = 0;
        int countpos = 0;


        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        int number3 = Integer.parseInt(numberString3);

        if(number1<0){
            countneg++;
        }else if(number1>0){
            countpos++;
        }

        if(number2<0){
            countneg++;
        }else if(number2>0){
            countpos++;
        }

        if(number3<0){
            countneg++;
        }else if(number3>0){
            countpos++;
        }

        System.out.println("Number of negative numbers: " + countneg);
        System.out.println("Number of positive numbers: " + countpos);

    }
}

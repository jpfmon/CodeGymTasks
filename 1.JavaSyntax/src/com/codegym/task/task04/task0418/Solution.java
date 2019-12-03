package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

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

        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        if(number1==number2){
            System.out.println(number1);

        }else if(number1<number2){
            System.out.println(number1);
        }else if(number1>number2){
            System.out.println(number2);
        }

    }
}
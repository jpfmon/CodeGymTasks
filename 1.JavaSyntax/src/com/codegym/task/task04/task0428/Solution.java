package com.codegym.task.task04.task0428;

/* 
Positive number

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

        int count = 0;

        int number1 = Integer.parseInt(numberString1);


        if(number1>0){
            count++;
        }

        int number2 = Integer.parseInt(numberString2);

        if(number2>0){
            count++;
        }

        int number3 = Integer.parseInt(numberString3);

        if(number3>0){
            count++;
        }

        System.out.println(count);

    }
}

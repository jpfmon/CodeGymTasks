package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String number1String = buffer.readLine();

        String number2String = buffer.readLine();

        String number3String = buffer.readLine();

        int number1 = Integer.parseInt(number1String);

        int number2 = Integer.parseInt(number2String);

        int number3 = Integer.parseInt(number3String);


        int sum12 = number1+number2;
        int sum13 = number1+number3;
        int sum23 = number2+number3;

        if(sum12>number3 && sum13>number2 && sum23>number1){
            System.out.println("The triangle is possible.");
        }else{
            System.out.println("The triangle is not possible.");
        }

    }
}
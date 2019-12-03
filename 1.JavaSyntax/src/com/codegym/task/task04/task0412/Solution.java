package com.codegym.task.task04.task0412;

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

        String numberString = buffer.readLine();

        int number = Integer.parseInt(numberString);

        if(number<0){
            number = number + 1;
            System.out.println(number);
        }else if(number>0){
            number = number*2;
            System.out.println(number);
        }else{
            System.out.println(number);
        }


    }

}
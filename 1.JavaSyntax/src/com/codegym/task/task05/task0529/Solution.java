package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        int sum=0;

        while(true) {

            String numberString1 = buffer.readLine();

            if(numberString1.equals("sum")){
                break;
            }

            int number = Integer.parseInt(numberString1);
            sum = sum + number;
        }

        System.out.println(sum);
    }
}

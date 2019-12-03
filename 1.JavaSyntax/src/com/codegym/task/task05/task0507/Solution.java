package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        double sum=0;
        int count=0;
        double average=0;
        while(true) {

            String numberString1 = buffer.readLine();
            double number1 = Double.parseDouble(numberString1);

            if(number1==-1){
                break;
            }else{
                sum = sum + number1;
                count++;
                average = sum/count;
            }
        }

        System.out.println(average);
    }
}


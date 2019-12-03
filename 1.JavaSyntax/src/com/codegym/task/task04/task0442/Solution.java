package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        int sum=0;

        while(true){
            String numberString1 = buffer.readLine();
            int number1 = Integer.parseInt(numberString1);
            sum = sum + number1;
            if(number1==-1){
                break;
            }
        }
        System.out.println(sum);



    }
}

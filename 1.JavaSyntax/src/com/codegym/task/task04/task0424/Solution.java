package com.codegym.task.task04.task0424;

/* 
Three numbers

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

        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        int number3 = Integer.parseInt(numberString3);

        int[] arr = new int[]{number1,number2,number3};



        if(number1==number2){
            System.out.println(3);
        }else if(number1==number3){
            System.out.println(2);
        }else if(number2==number3){
            System.out.println(1);
        }else{

        }

    }
}

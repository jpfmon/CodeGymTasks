package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

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


        if(number1==number2 && number2==number3){
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if(number1==number2){
            System.out.println(number1 + " " + number2);
        }else if(number1==number3){
            System.out.println(number1 + " " + number3);
        }else if(number2==number3){
            System.out.println(number2 + " " + number3);
        }


    }
}
package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        int number1 = Integer.parseInt(numberString1);

        while(number1>0){

            int digit=number1%10;

            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            number1=number1/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}

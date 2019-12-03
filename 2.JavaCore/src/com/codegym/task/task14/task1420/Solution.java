package com.codegym.task.task14.task1420;

/* 
GCD
Greatest common divisor (GCD).
Enter 2 positive integers from the keyboard.
Display the greatest common divisor.


Requirements:
1. The program should read 2 lines from the keyboard.
2. If the entered lines can't be converted to positive integers, throw an exception.
3. The program should display data on the screen.
4. The program should display the greatest common divisor (GCD) of the numbers read from the keyboard and then terminate successfully.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {


        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        String numberString2 = buffer.readLine();

        Integer number1=null;
        Integer number2=null;

        try{
        number1 = Integer.parseInt(numberString1);

            if(number1<=0){
                throw new Exception();
            }
        }catch (Exception e){
            throw e;
        }

        try{
            number2 = Integer.parseInt(numberString2);
            if(number2<=0){
                throw new Exception();
            }
        }catch (Exception e){
            throw e;
        }

        int maxDivisor1=1;
        int maxDivisor2=1;
        int max;

        if(number1<number2){
            max=number1;
        }else{
            max=number2;
        }


        for(int i=1;i<=max;i++){
                if(number1%i==0){
                    if(number2%i==0){
                        maxDivisor1=i;
                        maxDivisor2=i;
                    }
                }
        }


        System.out.println(maxDivisor1);

    }
}

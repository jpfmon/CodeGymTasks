package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

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


        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);


        for(int i=1;i<=number1;i++){
            for(int j=1;j<=number2;j++){
                System.out.print(8);
            }
            System.out.println();
        }

    }
}

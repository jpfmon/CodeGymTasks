package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();


        String numberString1 = buffer.readLine();

        String numberString2 = buffer.readLine();

        String numberString3 = buffer.readLine();

        int number1 = Integer.parseInt(numberString1);

        int number2 = Integer.parseInt(numberString2);

        int number3 = Integer.parseInt(numberString3);


        System.out.println("My name is " + name + ".");

        System.out.println("I was born on " + number2 + "/" + number3 + "/" + number1);
    }
}

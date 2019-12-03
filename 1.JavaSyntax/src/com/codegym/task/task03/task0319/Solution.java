package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        String number1 = buffer.readLine();

        String number2 = buffer.readLine();

        System.out.println(name + " will receive "+ number1 + " in "+number2+ " years.");
    }
}

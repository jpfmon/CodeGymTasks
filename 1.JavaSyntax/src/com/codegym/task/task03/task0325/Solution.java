package com.codegym.task.task03.task0325;

import java.io.*;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String n = buffer.readLine();


        System.out.println("I will earn $" + n +" per hour");
    }
}

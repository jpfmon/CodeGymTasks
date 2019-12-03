package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String yearString = buffer.readLine();

        int year = Integer.parseInt(yearString);

        if(year%400==0){
            System.out.println("Number of days in the year: 366");
        }else if(year%100==0){
            System.out.println("Number of days in the year: 365");
        }else if(year%4==0){
            System.out.println("Number of days in the year: 366");
        }else{
            System.out.println("Number of days in the year: 365");
        }
    }
}
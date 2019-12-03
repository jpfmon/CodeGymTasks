package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        String[] ar= new String[10];

        for(int i=1;i<=8;i++){
            InputStream inputStream = System.in;

            Reader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader buffer = new BufferedReader(inputStreamReader);

            String numberString1 = buffer.readLine();

            ar[i-1]=numberString1;
        }

        for(int j=9;j>=0;j--){
            System.out.println(ar[j]);
        }

    }
}
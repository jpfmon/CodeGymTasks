package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        String[] ar= new String[10];

        int[] arInt = new int[10];

        for(int i=1;i<=10;i++){
            InputStream inputStream = System.in;

            Reader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader buffer = new BufferedReader(inputStreamReader);

            String numberString1 = buffer.readLine();

            ar[i-1]=numberString1;

            arInt[i-1]=numberString1.length();

        }

        for(int j=0;j<=9;j++){
            System.out.println(arInt[j]);
        }

    }
}

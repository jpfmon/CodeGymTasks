package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numberString1 = reader.readLine();
        String numberString2 = reader.readLine();
        String numberString3 = reader.readLine();
        String numberString4 = reader.readLine();
        String numberString5 = reader.readLine();

        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);
        int number3 = Integer.parseInt(numberString3);
        int number4 = Integer.parseInt(numberString4);
        int number5 = Integer.parseInt(numberString5);

        int[] ar= new int[]{number1,number2,number3,number4,number5};

        Arrays.sort(ar);

        for(int i=0;i<=4;i++){
            System.out.println(ar[i]);
        }
        //write your code here
    }
}

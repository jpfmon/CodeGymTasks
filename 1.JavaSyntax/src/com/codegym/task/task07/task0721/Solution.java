package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for(int i=1;i<=20;i++){

            String numberString = reader.readLine();
            int numberString1 = Integer.parseInt(numberString);
            list[i-1]=numberString1;
        }

        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        //write your code here

        for(int n:list){
            if(n>maximum){
                maximum=n;
            }

            if(n<minimum){
                minimum=n;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}

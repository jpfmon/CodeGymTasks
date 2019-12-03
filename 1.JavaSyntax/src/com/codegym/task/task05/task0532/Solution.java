package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numberString = reader.readLine();
        int numbersToRead = Integer.parseInt(numberString);
        int count =1;
        ArrayList<Integer> ar = new ArrayList<>();

        while(true){

            String numbersStr = reader.readLine();
            int numberToAdd = Integer.parseInt(numbersStr);
            ar.add(numberToAdd);
            count++;
            if(count>numbersToRead){
                //System.out.println("Count is: " + count);
                break;
            }
        }

        Collections.sort(ar);

        int maximum = ar.get(numbersToRead-1);

        //write your code here

        System.out.println(maximum);
    }
}

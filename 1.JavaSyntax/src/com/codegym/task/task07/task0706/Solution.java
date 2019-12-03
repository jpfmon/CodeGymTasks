package com.codegym.task.task07.task0706;

import java.io.*;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int[] arr = new int[15];
        int countEven=0;
        int countOdd = 0;

        for(int i=0;i<=14;i++){

            InputStream inputStream = System.in;
            Reader reader = new InputStreamReader(inputStream);
            BufferedReader bufreader = new BufferedReader(reader);

            String numberString = bufreader.readLine();
            int number= Integer.parseInt(numberString);

            arr[i]=number;

            if(i%2==0 || i==0){
                countEven = countEven + number;
            }else if(i%2!=0){
                countOdd = countOdd + number;
            }
        }

        if(countEven>countOdd){
            System.out.println("Even-numbered houses have more residents.");
        }else if(countOdd>countEven){
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}

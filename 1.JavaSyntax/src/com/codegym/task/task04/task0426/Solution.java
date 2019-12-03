package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String timeS = buffer.readLine();

        int time = Integer.parseInt(timeS);

        if(time<0){
            if(time%2==0){
                System.out.println("Negative even number");
            }else{
                System.out.println("Negative odd number");
            }
        }else if(time>0){
            if(time%2==0){
                System.out.println("Positive even number");
            }else{
                System.out.println("Positive odd number");
            }
        }else{
            System.out.println("Zero");
        }

    }
}

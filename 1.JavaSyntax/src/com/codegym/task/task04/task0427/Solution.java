package com.codegym.task.task04.task0427;

/* 
Describing numbers

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


        if(time>=1 && time<=999){

            if(time%2==0){
                if(time<10){
                    System.out.println("even single-digit number");
                }else if(time>=10 && time<100){
                    System.out.println("even two-digit number");
                }else if(time>=100){
                    System.out.println("even three-digit number");
                }
            }else if(time%2!=0){
                if(time<10){
                    System.out.println("odd single-digit number");
                }else if(time>=10 && time<100){
                    System.out.println("odd two-digit number");
                }else if(time>=100){
                    System.out.println("odd three-digit number");
                }
            }


        }

    }
}

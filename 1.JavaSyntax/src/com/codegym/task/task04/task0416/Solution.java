package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String timeS = buffer.readLine();

        double time = Double.parseDouble(timeS);

        while(time>=5.0){
            time=time-5.0;
        }

        if(time<5.0 && time>=0.0){
            if(time <3.0){
                System.out.println("green");
            }else if (time>=3.0 && time<4.0){
                System.out.println("yellow");
            }else if(time>=4.0 && time<5.0 ){
                System.out.println("red");
            }
        }

    }
}
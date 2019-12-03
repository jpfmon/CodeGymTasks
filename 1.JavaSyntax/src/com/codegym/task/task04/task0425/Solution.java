package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        String numberString2 = buffer.readLine();

        int a = Integer.parseInt(numberString1);

        int b = Integer.parseInt(numberString2);

        if(a>0){
            if(b>0){
                System.out.println(1);
            }else if(b<0){
                System.out.println(4);
            }
        }if(a<0){
            if(b<0){
                System.out.println(3);
            }else if(b>0){
                System.out.println(2);
            }
        }


    }
}

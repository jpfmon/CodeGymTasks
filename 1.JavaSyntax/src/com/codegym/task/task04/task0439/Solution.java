package com.codegym.task.task04.task0439;

/* 
Chain letter

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here


        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        for(int i=1;i<=10;i++){
            System.out.println(name + " loves me.");
        }

    }
}

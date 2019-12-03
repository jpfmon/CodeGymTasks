package com.codegym.task.task03.task0320;


/* 
The humble programmer

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        System.out.println(name + " makes $120,000 a year. Ha-ha-ha!");
    }
}

package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name1 = buffer.readLine();

        String name2 = buffer.readLine();

        if(name1.equals(name2)){
            System.out.println("The names are identical");
        }else{
            if(name1.length()==name2.length()){
                System.out.println("The names are the same length");
            }
        }

    }
}

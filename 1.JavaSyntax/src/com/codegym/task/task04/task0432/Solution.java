package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        String timeS = buffer.readLine();

        int time = Integer.parseInt(timeS);
        int i=1;

        if(time>0){

            while(i<=time){
                System.out.println(name);
                i++;
            }
        }

    }
}

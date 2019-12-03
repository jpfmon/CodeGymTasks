package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr = new ArrayList<>();

        InputStream input = System.in;

        Reader reader = new InputStreamReader(input);

        BufferedReader buffer = new BufferedReader(reader);

        for(int i=1;i<=10;i++){

            String str = buffer.readLine();

            arr.add(0,str);
        }

        for(String s:arr){
            System.out.println(s);
        }
    }
}

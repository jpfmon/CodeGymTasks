package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr =new ArrayList<>();

        InputStream input = System.in;

        Reader reader = new InputStreamReader(input);

        BufferedReader buffer = new BufferedReader(reader);

        for(int i=1;i<=5;i++){

            String str = buffer.readLine();

            arr.add(str);
        }

        for(int j=1;j<=13;j++){

            int index = arr.size()-1;

            String c = arr.get(index);

            arr.remove(index);
            arr.add(0,c);
        }

        for(String d:arr){
            System.out.println(d);
        }


    }
}

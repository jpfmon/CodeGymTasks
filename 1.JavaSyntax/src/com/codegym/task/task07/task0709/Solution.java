package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        List<String> arr= new ArrayList<>();

        int min = Integer.MAX_VALUE;

        ArrayList<String> shorts =new ArrayList<>();

        InputStream input = System.in;

        Reader reader = new InputStreamReader(input);

        BufferedReader buffer = new BufferedReader(reader);

        for(int i=1;i<=5;i++){

            String str = buffer.readLine();

            arr.add(str);
        }

        for(String s:arr){
            if(s.length()<min){
                min=s.length();
                shorts = new ArrayList<>();
                shorts.add(s);
            }else if(s.length()==min){
                shorts.add(s);
            }
        }

        for(String s:shorts){
            System.out.println(s);
        }





    }
}

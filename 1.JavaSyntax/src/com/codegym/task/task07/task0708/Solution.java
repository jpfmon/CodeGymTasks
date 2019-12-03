package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        strings = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        ArrayList<String> longs=new ArrayList<>();

        for(int i=1;i<=5;i++){
            InputStream input = System.in;
            Reader reader = new InputStreamReader(input);
            BufferedReader buffer = new BufferedReader(reader);

            String string1 = buffer.readLine();

            strings.add(string1);
        }

        for(String s:strings){
            if(s.length()>max){
                max=s.length();
                longs = new ArrayList<>();
                longs.add(s);
            }else if(s.length()==max){
                longs.add(s);
            }
        }

        for(String s:longs){
            System.out.println(s);
        }



    }
}

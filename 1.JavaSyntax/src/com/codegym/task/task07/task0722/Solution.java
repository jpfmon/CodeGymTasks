package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<=Integer.MAX_VALUE;i++){
            String s = reader.readLine();

            if(s.equals("end")){
                break;
            }else{
                list.add(s);
            }
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
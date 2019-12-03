package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Sam");
        arr.add("I");
        arr.add("Am");

            for(int i=0;i<arr.size();i++){

                if(arr.get(i).equals("Sam") || arr.get(i).equals("I") || arr.get(i).equals("Am")){
                    arr.add(i+1,"Ham");
                }
            }


        for(String s:arr){
            System.out.println(s);
        }
    }
}

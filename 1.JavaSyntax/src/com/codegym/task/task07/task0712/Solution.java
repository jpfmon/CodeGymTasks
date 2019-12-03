package com.codegym.task.task07.task0712;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String shortest="";
        String longest="";

        Date date;
        long timeMin= 0;
        long timeMax= 0;

        InputStream input = System.in;

        Reader reader = new InputStreamReader(input);

        BufferedReader buffer = new BufferedReader(reader);

        for(int i=1;i<=10;i++){

            String str = buffer.readLine();

            arr.add(str);

            if(str.length()<min){
                shortest = str;
                min=str.length();
                date=new Date();
                timeMin = date.getTime();
            }

            if(str.length()>max){
                longest = str;
                max=str.length();
                date=new Date();
                timeMax = date.getTime();
            }
        }



        if(arr.indexOf(shortest)<arr.indexOf(longest)){
            System.out.println(shortest);
        }else{
            System.out.println(longest);
        }

//        if(timeMax<timeMin){
//            System.out.println(longest);
//        }else if(timeMax>timeMin){
//            System.out.println(shortest);
//        }

    }
}

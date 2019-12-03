package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        ArrayList<Integer> arr = new ArrayList<>();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        int anterior=0;
        int count=1;
        int max= 1;

        for(int i=1;i<=10;i++){

            String numberString1 = buffer.readLine();

            int number = Integer.parseInt(numberString1);

            arr.add(number);

            if(i==1){
                anterior=number;
            } if(i>1){
                if(number==anterior){
                   count++;
                   if(count>max){
                       max=count;
                   }
                   anterior=number;
                }else if(number!=anterior){
                    count=1;
                    anterior=number;
                }
            }

        }

        System.out.println(max);







    }
}
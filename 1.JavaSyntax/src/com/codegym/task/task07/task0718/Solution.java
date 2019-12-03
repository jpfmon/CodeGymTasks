package com.codegym.task.task07.task0718;

import java.io.*;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        ArrayList<String> list = new ArrayList<>();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);


        for(int i=1;i<=10;i++){

            String numberString1 = buffer.readLine();

            list.add(numberString1);
        }

        int size =0;

        for(int i=0;i<=list.size()-1;i++){

            if(i==0){
                size=list.get(i).length();
            }else{
                if(list.get(i).length()>size){
                    size=list.get(i).length();
                }else{
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}


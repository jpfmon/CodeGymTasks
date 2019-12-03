package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr = new ArrayList<>();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        for(int i=1;i<=5;i++) {
            String numberString1 = buffer.readLine();

            arr.add(numberString1);
        }

        arr.remove(2);


        for(int j=arr.size()-1;j>=0;j--){
            System.out.println(arr.get(j));
        }

    }
}



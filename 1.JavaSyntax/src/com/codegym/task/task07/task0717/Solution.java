package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here

        ArrayList<String> list = new ArrayList<>();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);


        for(int i=1;i<=10;i++){

            String numberString1 = buffer.readLine();

            list.add(numberString1);
        }

        ArrayList<String> result = doubleValues(list);

        // Display result

        for(String s:result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> nueva = new ArrayList<>();

        for(String s:list){
                nueva.add(s);
                nueva.add(s);
        }
        return nueva;
    }
}

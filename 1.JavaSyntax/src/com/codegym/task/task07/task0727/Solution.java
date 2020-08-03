package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<>();

        for (String s: list){
            int size = s.length();
            if(size%2==0){
                String lineEven = s + " " + s;
                newList.add(lineEven);
            }else {
                String lineOdd = s + " " + s + " " + s;
                newList.add(lineOdd);
            }
        }

        for (String ns:newList){
            System.out.println(ns);
        }

    }
}

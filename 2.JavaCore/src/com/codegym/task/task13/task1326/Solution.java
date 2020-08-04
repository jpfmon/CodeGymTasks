package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        FileInputStream fileLines = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileLines));

        List<Integer> list = new ArrayList<>();

        while (reader.ready()) {
            Integer number = Integer.parseInt(reader.readLine());
            if(number%2==0){
                list.add(number);
            }
        }

        fileLines.close();

        Collections.sort(list);
        for (Integer a : list) {
            System.out.println(a);
        }


    }
}

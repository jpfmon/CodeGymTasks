package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m;
        int n;

        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());

        ArrayList<String> arr = new ArrayList<>();

        for(int i=1;i<=n;i++){
            String s = reader.readLine();
            arr.add(s);
        }

        for(int i=0;i<=m-1;i++){
            arr.add(arr.get(i));
        }

        for(int i=0;i<=m-1;i++){
            arr.remove(0);
        }

        for(String s:arr){
            System.out.println(s);
        }

        //write your code here
    }
}

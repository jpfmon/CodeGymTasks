package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] arr = s.split(" ");

        for(int i=0;i<arr.length;i++){
            char change = arr[i].charAt(0);
            Character.toUpperCase(arr[i].charAt(0));
            System.out.println(change);
        }
        //write your code here

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}

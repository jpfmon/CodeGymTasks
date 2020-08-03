package com.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //write your code here

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(isGreaterThan(array[i],array[j])!=false){
                    String c = array[j];
                    array[j] = array[i];
                    array[i] = c;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {

//        System.out.println(a.compareTo(b));
//        System.out.println(a + " anterior a " + b + " : " + a.compareTo(b));
        return a.compareTo(b) > 0;
    }
}

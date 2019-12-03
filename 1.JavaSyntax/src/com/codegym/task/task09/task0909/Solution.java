package com.codegym.task.task09.task0909;

/* 
Exception when working with arrays

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "" + e.getClass());
        }

        //write your code here
    }
}

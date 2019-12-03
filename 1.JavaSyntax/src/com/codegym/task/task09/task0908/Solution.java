package com.codegym.task.task09.task0908;

/* 
Exception while working with strings

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + " " + e.getClass());
        }

        //write your code here
    }
}

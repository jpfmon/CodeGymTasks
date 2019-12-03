package com.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
Exception when working with List collections

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " " + e.getClass());
        }

        //write your code here
    }
}
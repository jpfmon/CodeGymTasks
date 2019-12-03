package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> arr = new ArrayList<>();

        arr.add("hola");
        arr.add("hola1");
        arr.add("hola2");
        arr.add("hola3");
        arr.add("hola4");

        System.out.println(arr.size());

        for(String s:arr){
            System.out.println(s);
        }


    }
}

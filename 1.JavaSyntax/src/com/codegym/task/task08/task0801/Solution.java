package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("watermelon");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("pear");
        hashSet.add("cantaloupe");
        hashSet.add("blackberry");
        hashSet.add("ginseng");
        hashSet.add("strawberry");
        hashSet.add("iris");
        hashSet.add("potato");

        for(String s:hashSet){
            System.out.println(s);
        }

    }
}

package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here

        HashSet<Integer> set = new HashSet<>();

        for(int i=1;i<=20;i++){
            set.add(i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here

        HashSet<Integer> nuevo = new HashSet<>();

        for(Integer n:set){
            if(n<=10){
                nuevo.add(n);
            }
        }
        return nuevo;
    }

    public static void main(String[] args) {

    }
}

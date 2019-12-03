package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        //write your code here

        char[] arry = s.toCharArray();
        //System.out.println(arry.length);

        for (int i = 1; i <= 43; i++) {
            if (i < 43) {
                for (int j = i - 1; j <= arry.length - 1; j++) {
                    System.out.print(arry[j]);
                }
                System.out.println();
            } else {
                for (int j = i - 1; j <= arry.length - 1; j++) {
                    System.out.print(arry[j]);
                }
            }
        }
    }
}


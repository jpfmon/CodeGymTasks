package com.codegym.task.task10.task1001;

/* 
Task No. 1 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a =  (byte) 0;
        int b =  (short) a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (char)  (a + f / c + b);
        System.out.println(d);
    }
}

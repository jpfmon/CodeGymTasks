package com.codegym.task.task10.task1007;

/* 
Task No. 7 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
//        long l = (byte) 1234_564_890L;
        long l =  1234_564_890L;
//        System.out.println(l);
//        int x = (byte) 0b1000_1100_1010;
        int x =  0b1000_1100_1010;
//        System.out.println(x);
        double m = (byte) 110_987_654_6299.123_34;
//        System.out.println(m);
//        float f = (byte) l++ + 10 + ++x - (float) m;
        float f = l++ + 10 + ++x - (float) m;

//        System.out.println(f);
        l = (long) f / 1000;
        System.out.println(l);
    }
}
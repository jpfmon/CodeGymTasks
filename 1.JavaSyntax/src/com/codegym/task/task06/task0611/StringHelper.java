package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s+s+s+s+s;
        //write your code here
        return result;
    }

    public static String multiply(String s, int count) {

        String result ="";
        for(int i=1;i<=count;i++) {
            result = result+s;
        }
        //write your code here
        return result;
    }

    public static void main(String[] args) {


    }
}

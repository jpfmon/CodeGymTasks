package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String s) {
        //write your code here

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.print(stackTraceElements[stackTraceElements.length-1] +" "+ " "+s);
        System.out.print(stackTraceElements[2].getClassName() +": "+ stackTraceElements[2].getMethodName() +": "+s);


    }
}

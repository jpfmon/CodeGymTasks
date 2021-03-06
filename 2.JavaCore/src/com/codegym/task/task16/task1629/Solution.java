package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
1. In the Solution class, create a public static Read3Strings class that inherits Thread.
        2. In the run method, read three lines from the console.
        3. Three lines should be read in succession on one thread and combined into one space-delimited string.
        4. In the main method, display the result for each thread.
        5. Use join.

        Example:

        Input:
        a
        b
        c
        d
        e
        f

        Output:
        a b c
        d e f


        Requirements:
        1. In the Solution class, declare the public static Read3Strings class.
        2. The Read3Strings class should inherit the Thread class.
        3. The Read3Strings class's run method must read three lines.
        4. The Read3Strings class must have a public printResult method.
        5. The printResult method should display the 3 read lines, separating them with spaces.
        6. The main method should call the created threads' start methods.
        7. The main method should call the created threads' join methods.
        8. The program's output should indicate that the threads read the lines sequentially, not in parallel.
*/


public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //write your code here

    public static class Read3Strings extends Thread{
        String a;
        String b;
        String c;
        @Override
        public void run() {
            try {
                a = reader.readLine();
                b = reader.readLine();
                c = reader.readLine();
            } catch (IOException e) {

            }
        }
        public void printResult(){
            System.out.print(a + " " + b + " " + c);
            System.out.println();
        }
    }


}

package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


//        1. Create 5 different threads that differ from Thread:
//        1.1. Thread 1 must run indefinitely;
//        1.2. Thread 2 should display "InterruptedException" when an InterruptedException occurs;
//        1.3. Thread 3 should display "Hurray" every half second";
//        1.4. Thread 4 must implement the Message interface. When the showWarning method is called, the thread should stop;
//        1.5. Thread 5 should read numbers from the console until "N" is entered. Then it should display the sum of the entered numbers.
//        2. In a static block, add your threads to List<Thread> threads in the specified order.
//        3. The threads should not start automatically.
//
//        Hint:
//        Thread 4 can be checked using isAlive()
//
//
//        Requirements:
//        1. The Solution class's static block must create 5 threads and add them to the threads list.
//        2. The threads in the threads list should not start automatically.
//        3. Thread 1 in the threads list must run infinitely.
//        4. Thread 2 in the threads list should display "InterruptedException" when an InterruptedException occurs.
//        5. Thread 3 in the threads list should display "Hurray" every half second.
//        6. Thread 4 in the threads list must implement the Message interface.
//        When the showWarning method is called, the thread should stop.
//        7. Thread 5 in the threads list should read numbers from the console until "N" is entered.
//        Then it should display the sum of the entered numbers.
//

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    public static class infinite extends Thread {

        public void run() {
            while (true) {
                int sum = 1;
                sum++;
            }
        }
    }

    ;

    public static class interrupted extends Thread {
        public void run() {
            try {
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    ;

    public static class hurray extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    ;

    public static class MiMessage extends Thread implements Message {


        @Override
        public void run() {
            while (isAlive()) {
                // showWarning();
            }
        }

        @Override
        public void showWarning() {
            this.stop();
        }
    }

    public static class numbers extends Thread {
        InputStream input = System.in;
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader buffer = new BufferedReader(reader);
        String entry = "";
        int sum = 0;

        @Override
        public void run() {
            while (true) {
                try {
                    entry = buffer.readLine();
                } catch (IOException e) {

                }
                if (entry.equals("N")) {
                    break;
                } else {
                    sum = sum + Integer.parseInt(entry);
                }
            }
            System.out.println(sum);
        }
    }

    static {

        Thread t1 = new infinite();
        threads.add(t1);
        Thread t2 = new interrupted();
        threads.add(t2);
        Thread t3 = new hurray();
        threads.add(t3);
        Thread t4 = new MiMessage();
        threads.add(t4);
        Thread t5 = new numbers();
        threads.add(t5);
    }


    public static void main(String[] args) {

        for(int i=0;i<threads.size();i++){
            threads.get(i).start();
        }
    }
}
package com.codegym.task.task16.task1626;


//Figure out how the program works.
//        Similar to CountdownRunnable, create a CountUpRunnable thread that displays values ​​in the counting order: from 1 to number.
//
//
//        Requirements:
//        1. The CountUpRunnable class must implement the Runnable interface.
//        2. The CountUpRunnable class must have a public run method with no parameters.
//        3. The CountUpRunnable class's run method should run for approximately 2.5 seconds.
//        4. Every half second, the CountUpRunnable class's run method should display the thread's name, a colon, and the value of the counter from 1 to 5 (for example: "Increase: 1").
//        5. The CountUpRunnable class's run method should call Thread.sleep(500).
//

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Decrease").start();
        new Thread(new CountUpRunnable(), "Increase").start();
    }

    public static class CountUpRunnable implements Runnable{
        //write your code here
        private int countUpIndex = 0;

        @Override
        public void run() {
            long init = System.currentTimeMillis();
            long now= System.currentTimeMillis();
            try {
                while ((now-init)<2500) {
                    Thread.sleep(500);
                    countUpIndex += 1;
                    System.out.println(toString());
                    if (countUpIndex == Solution.number) return;
                    now = System.currentTimeMillis();
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}

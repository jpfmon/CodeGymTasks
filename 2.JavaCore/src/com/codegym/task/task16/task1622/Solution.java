package com.codegym.task.task16.task1622;

/* 
Consecutive threads
1. In the run method, add a delay of 10 milliseconds after all the actions. Display "Thread interrupted" if the thread is interrupted.
2. Make all the threads run sequentially: first, for thread 1, count down from COUNT to 1; then for thread 2 - from COUNT to 1, etc.

Example:
#1: 4
#1: 3
...
#1: 1
#2: 4
...


Requirements:
1. The program should create 4 SleepingThread objects.
2. The main method should call join on each created SleepingThread object.
3. The run method should use Thread.sleep(10).
4. The program's output must correspond to the task conditions.
5. If a SleepingThread thread is interrupted, it should display "Thread interrupted".
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            Thread nuevo = new SleepingThread();
            //write your code here
            nuevo.join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //write your code here
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }

        public String toString() {

            return "#" + getName() + ": " + countdownIndex;
        }
    }
}

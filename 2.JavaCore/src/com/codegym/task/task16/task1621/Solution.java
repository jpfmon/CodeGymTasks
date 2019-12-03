package com.codegym.task.task16.task1621;

/* 
Thread.currentThread always returns the current thread
1. In the printMsg method, assign the current thread to the variable t.
2. In the printMsg method, add a delay of 1 millisecond after all the actions.


Requirements:
1. The printMsg method must get the current thread using Thread.currentThread.
2. The printMsg method should put the thread to sleep for 1 millisecond.
3. The printMsg method should call the getName method on the current thread.
4. The main method should call the printMsg method on the ThreadNamePrinter object 5 times.
5. The run method must call the printMsg method 5 times.
6. The ThreadNamePrinter class's printMsg method must be called a total 10 times.
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = null; // The current thread should be assigned to the variable t
            t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name = " + name);
            // Add sleep here
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
    }
}

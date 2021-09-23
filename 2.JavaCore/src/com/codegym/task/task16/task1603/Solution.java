package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads
In the main method, add 5 threads to the static list. Each thread must be a new Thread object that works with its own SpecialThread object.


Requirements:
1. In the main method, create 5 SpecialThread objects.
2. In the main method, create 5 Thread objects.
3. Add 5 different threads to list.
4. Each thread in list should work with its own SpecialThread object.
5. The SpecialThread class's run method should display "This is the run method inside SpecialThread".
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        //write your code here
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        SpecialThread specialThread5 = new SpecialThread();

        list.add(new Thread(specialThread1));
        list.add(new Thread(specialThread2));
        list.add(new Thread(specialThread3));
        list.add(new Thread(specialThread4));
        list.add(new Thread(specialThread5));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}

package com.codegym.task.task17.task1722;

/* 
Let's count
1. Make it so that the result is calculated for all the array elements, WITHOUT using Thread.sleep in the main(String[] args) method.
2. Correct the synchronized block so that the values array is filled with 1s


Requirements:
1. The Solution class must contain the Counter class.
2. The Counter class must be a thread.
3. The Counter class's run() method must have a synchronized block.
4. The run() method's synchronized block must not lock this.
5. The Solution class's main(String[] args) method should not use Thread.sleep().
6. For each thread, in the Solution class's main(String[] args) method, use a method that waits for the thread to end.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter1.join();
        counter2.start();
        counter2.join();
        counter3.start();
        counter3.join();
        counter4.start();
        counter4.join();

        for (int i = 1; i <= 100; i++) {
            System.out.println(values[i]);
            if (values[i] != 1) {
                System.out.println(values[i]);
                System.out.println("The values array contains elements not equal to 1");
                break;
            }
        }
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {

        count++;
    }

    public static int getCount() {

        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
           System.out.println(currentThread().getName() + " - " +  getCount());
            do {
                synchronized (values) {
                    incrementCount();
                    values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException ignored) {
                }
            } while (getCount() < 100);
        }
    }
}

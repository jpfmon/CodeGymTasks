package com.codegym.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Restaurant
1. Figure out what the program does. For some reason, the waiter isn't bringing the prepared dishes out to the tables :(

2. Fix the bug.

Hint: it's one line


Requirements:
1. The Restaurant class should contain a list of cooks and waiters (public static List<Thread> threads).
2. The Manager class must contain an order queue (private final Queue<Order> orderQueue).
3. The Manager class must have a queue with the prepared dishes (private final Queue<Dish> dishQueue).
4. The Manager class must implement the singleton pattern.
5. The Waiter class must implement the Runnable interface.
6. The Cook class must implement the Runnable interface.
7. If there are no prepared dishes in the queue, the Waiter thread should take an order from a table and add it to the order queue.
8. If there are prepared meals in the queue, the Waiter thread should take the dish out of the queue and place the order on the table.
9. If there are no orders in the order queue, the Cook thread should rest (i.e. the cook should rest).
10. If there are orders in the order queue, the Cook thread should prepare the dish and add it to the queue of prepared dishes.
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}

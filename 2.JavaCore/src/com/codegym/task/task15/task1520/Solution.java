package com.codegym.task.task15.task1520;

/* 
Brain training
Find the error in the logic: Duck should correctly implement the CanMove interface.
Fix the bug.

The output should be:
Flying
Moving

Requirements:
1. The screen output must match the task conditions.
2. The Duck class must implement the doAnotherAction method.
3. The Duck class's doAnotherAction() method should display "Moving".
4. The Util class's move method should call the doAnotherAction method on the object passed to it.
5. The Duck class must implement the CanMove interface.
6. The Duck class must implement the CanFly interface.
*/

public class Solution {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck implements CanFly, CanMove {
        @Override
        public void doAnotherAction() {
            System.out.println("Moving");
        }

        @Override
        public void doAction() {
            System.out.println("Flying");
        }
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) {
            animal.doAnotherAction();
        }
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }
}

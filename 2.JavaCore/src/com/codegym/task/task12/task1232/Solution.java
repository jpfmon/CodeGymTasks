package com.codegym.task.task12.task1232;

/* 
Adding new functionality
Make a Pegasus class using the Horse class and the CanFly interface.


Requirements:
1. The Solution class must have a CanFly interface with a fly() method.
2. The Solution class must have a Horse class with a run() method.
3. The Solution class must have a Pegasus class.
4. The Pegasus class must inherit the Horse class.
5. The Pegasus class must implement the CanFly interface.
*/

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void fly() {

        }
    }
}

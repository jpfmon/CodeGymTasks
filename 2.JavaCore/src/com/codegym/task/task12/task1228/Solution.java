package com.codegym.task.task12.task1228;

/* 
Interfaces for the Human class
Add as many interfaces to the Human class as possible, but be sure that it doesn't become an abstract class.
You can't add methods to the Human class.


Requirements:
1. The Solution class must have an Employee interface with a void workLazily() method.
2. The Solution class must have a Businessman interface with a void workHard() method.
3. The Solution class must have a Secretary interface with a void workLazily() method.
4. The Solution class must have a Miner interface with a void workVeryHard() method.
5. The Solution class must have a Human class with the methods: void workHard() and void workLazily().
6. The Human class must implement three interfaces.
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Employee {
        public void workLazily();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazily();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Businessman,Employee,Secretary{

        public void workHard() {
        }

        public void workLazily() {
        }
    }
}

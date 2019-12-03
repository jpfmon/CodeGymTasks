package com.codegym.task.task13.task1321;


/* 
Fixing bugs
1. Rework inheritance in the classes and interfaces so the program compiles as it should and exhibits the same behavior.
2. The Hobby class must inherit the Desire and Dream interfaces.


Requirements:
1. The Hobby class must implement the Desire interface.
2. The Hobby class must implement the Dream interface.
3. The Hobby class must have a static variable called INDEX.
4. The Hobby class's toString method must increment the INDEX variable and return it as a String.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream  {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
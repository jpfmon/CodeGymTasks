package com.codegym.task.task15.task1528;

/* 
OOP: The Euro is money too
Correct the Euro class to avoid a StackOverflowError.


Requirements:
1. The Euro class must be a descendant of the Money class.
2. The Euro class must implement the getAmount method.
3. The Euro class's getAmount method must return the value of the field amount.
4. There shouldn't be any exceptions or errors while the program is running.
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {

            return getMoney().getAmount();
        }
    }

    // Add your code below
    public static class Euro extends Money {
        private double amount = 123d;

        @Override
        public Object getAmount() {
        return amount;
        }

        public Euro getMoney() {

            return this;
        }
    }
}

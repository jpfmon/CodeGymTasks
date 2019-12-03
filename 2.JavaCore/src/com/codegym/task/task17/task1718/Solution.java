package com.codegym.task.task17.task1718;

/* 
Ironing
Back to the daily grind...
Add one synchronized keyword to make diana and steve take turns ironing, since there's only one iron!

Hint:
Use class-level locking.


Requirements:
1. The Solution class must contain the public static Clothes class.
2. The Solution class must contain the public static Iron class.
3. The Solution class must contain the public static Person class.
4. The Person class must be a thread.
5. The Person class's run() method must have a synchronized block.
6. The synchronized block must use a class-level lock.
*/

public class Solution {
    public static void main(String[] args) {
        Person diana = new Person("Diana");
        Person steve = new Person("Steve");

            diana.start();
            steve.start();

    }

    public static class Person extends Thread {

        public Person(String name) {

            super(name);
        }

        @Override
        public void run() {
            synchronized (Iron.class) {
                Iron iron = takeIron();
                Clothes clothes = takeClothes();
                iron(iron, clothes);
                returnIron();
            }
        }

        protected Iron takeIron() {
            System.out.println("Taking the iron");
            return new Iron();
        }

        protected Iron returnIron() {
            System.out.println("Returning the iron");
            return new Iron();
        }

        protected Clothes takeClothes() {
            return new Clothes("T-shirt");
        }

        protected void iron(Iron iron, Clothes clothes) {
            System.out.println(getName() + " is iron a " + clothes.name);
        }
    }


    public static class Iron {
    }

    public static class Clothes {
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    }
}

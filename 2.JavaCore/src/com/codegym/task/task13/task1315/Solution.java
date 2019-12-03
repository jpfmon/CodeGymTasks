package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike
1. Create Dog, Cat, and Mouse classes.
2. Implement interfaces for the added classes, considering the following:
- A cat can move, can eat someone, and can be eaten.
- A mouse can move and be eaten.
- A dog can move and eat someone.


Requirements:
1. The Cat class must be inside the Solution class.
2. The Dog class must be inside the Solution class.
3. The Mouse class must be inside the Solution class.
4. A cat can move, can eat someone, and can be eaten.
5. A mouse can move and be eaten.
6. A dog can move and eat someone.
*/

public class Solution {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat{

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Cat implements CanEat,CanMove,Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements CanMove, Edible{
        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }
}
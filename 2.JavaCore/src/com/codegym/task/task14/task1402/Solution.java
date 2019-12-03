package com.codegym.task.task14.task1402;

/* 
Bingo!
Correct the 'Cat cat = new Cat();' line so that the program displays "Bingo!"


Requirements:
1. The Cat class must implement the CanMove interface.
2. The Cat class must be a parent (parent class) of the Tomcat class.
3. The variable cat should reference an object that simultaneously implements CanMove, and is a Cat and a Tomcat.
4. The program must display the following: "Bingo!"
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}

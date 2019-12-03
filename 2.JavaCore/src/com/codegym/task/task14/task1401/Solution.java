package com.codegym.task.task14.task1401;

/* 
Bingo!
Correct the 'Object animal = new Pet();' line in the main method so that the program displays "Bingo!"


Requirements:
1. The Cat class must inherit the Pet class.
2. The Tiger class must inherit the Cat class.
3. The Object variable animal should reference an object that is simultaneously a Pet, a Cat, and a Tiger.
4. The program must display the following: "Bingo!"
*/

public class Solution {
    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }

}

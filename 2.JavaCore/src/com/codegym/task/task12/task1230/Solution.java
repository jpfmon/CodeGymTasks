package com.codegym.task.task12.task1230;

/* 
Making the top ten
Add one more method so that the program displays the number 10.

Hint:
use method overloading.


Requirements:
1. The Solution class must contain three methods.
2. The overloaded transformValue method must double the number passed to it.
3. Don't change the type and value of the i variable.
4. Don't change the type and value of the x variable.
5. Don't change the screen output command.
6. The main method should only call the transformValue method once.
7. The program should display the number 10.
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {

        return i * i;
    }

    public static int transformValue(Integer i) {

        return i + i;
    }
}

package com.codegym.task.task13.task1325;

import java.awt.*;

/* 
Compiling the program
1. Fix the Fox and BigFox classes so that the program compiles.
This task does not involve creating instances of the base class.
2. Don't change the main method.


Requirements:
1. The Fox class must implement the Animal interface.
2. The Fox class must only implement one method (getName).
3. The Animal interface must declare a getColor method.
4. The BigFox class must inherit the Fox class.
5. The Fox class must be abstract.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public  static class BigFox extends Fox{
        @Override
        public Color getColor() {
            return null;
        }
    }

}

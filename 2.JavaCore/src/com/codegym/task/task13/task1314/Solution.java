package com.codegym.task.task13.task1314;

import java.awt.*;

/* 
A big fox is still a fox
1. Fix the BigFox class so that the program compiles.


Requirements:
1. The Fox class must implement the Animal interface.
2. The Fox class must only implement one method (getName).
3. The Animal interface must declare a getColor method.
4. The BigFox class must inherit the Fox class.
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

    public static class BigFox extends Fox implements Animal {

        public Color Color() {

            return Color.GRAY;
        }

        @Override
        public Color getColor() {
            return null;
        }
    }

}

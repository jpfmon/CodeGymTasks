package com.codegym.task.task13.task1324;

import java.awt.*;

/* 
One method in a class
1. Make Fox inherit the Animal interface.
2. Edit the code so that the getName method is the only method in the Fox class.
3. Don't delete any methods!


Requirements:
1. The Fox class must implement the Animal interface.
2. The Fox class must only implement one method (getName).
3. The Animal interface must declare a getColor method.
4. Don't create additional classes or interfaces.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal{
        public String getName() {

            return "Fox";
        }

    }
}

package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens
1. In the Solution class, create a Cat class with a public String field name.
2. In the static block, create a Cat object and assign it to the variable cat (don't forget to initialize the field name).
3. In the Cat class, don't create constructors with parameters.
4. In the static block, display the created cat's name on the screen.


Requirements:
1. The Cat class must be inside the Solution class and must be public and static.
2. The Cat class must have a public String field name.
3. The variable cat must be initialized in the static block of the Solution class.
4. In the static block, the created cat's name should be displayed on the screen.
5. The Cat class must not have constructors with parameters.
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "hola";
        System.out.println(cat.name);
    }
    public static void main(String[] args) {

    }

    public static class Cat{
        public String name;
    }
}

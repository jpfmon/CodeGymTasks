package com.codegym.task.task12.task1225;

/* 
Visitors
Write a method that will determine the type of object passed to it.
The program should display one of the following:
"Cat", "Tiger", "Lion", "Bull", "Cow" or "Animal".

Note:
try to determine the type of animal as accurately as possible.


Requirements:
1. The Solution class must have Cat, Tiger, Lion, Bull, Cow, and Animal classes.
2. The Solution class must have a String getObjectType(Object o) method.
3. The getObjectType() method must return "Cat" if a Cat object is passed.
4. The getObjectType() method must return "Tiger" if a Tiger object is passed.
5. The getObjectType() method must return "Lion" if a Lion object is passed.
6. The getObjectType() method must return "Bull" if a Bull object is passed.
7. The getObjectType() method must return "Cow" if a Cow object is passed.
8. The getObjectType() method must return "Animal" if an Animal object is passed.
9. The program should display the result of calling the getObjectType() method.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //write your code here
        String type = o.getClass().getSimpleName();


        switch (type){
            case "Cat":
                return "Cat";
            case "Tiger":
                return "Tiger";
            case "Lion":
                return "Lion";
            case "Bull":
                return "Bull";
            case "Cow":
                return "Cow";
            default:
                return "Animal";
        }
    }

    public static class Cat extends Animal   // <-- Class inheritance!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

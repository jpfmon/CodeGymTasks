package com.codegym.task.task12.task1205;

/* 
Animal identification

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));

    }

    public static String getObjectType(Object o) {
        //write your code here

        String type = o.getClass().getSimpleName();

        switch (type){
            case "Cow":
                return "Cow";
            case "Dog":
                return "Dog";
            case "Whale":
                return "Whale";
            default:
                return "Unknown Animal";
        }


    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}

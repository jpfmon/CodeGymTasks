package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<>();

        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        Set<Object> joined = new HashSet<>();
        joined.addAll(cats);
        joined.addAll(dogs);

        return joined;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here

        Set<Object> copia = new HashSet<>(pets);

        for(Object o:copia){
            for(Object o2:cats) {
                if (o.equals(o2)){
                    pets.remove(o);
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here

        for(Object o:pets){
            System.out.println(o);
        }
    }


    public static class Cat {}

    public static class Dog{}

}

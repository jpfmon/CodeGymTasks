package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {


    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator<Cat> iterator = cats.iterator();

        iterator.next();
        iterator.remove();


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2

        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for(Cat c:cats){
            System.out.println(c);
        }
    }
    public static class Cat{}
    // step 1
}

package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);


    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> mapa = new HashMap<>();

        mapa.put("Pipotudo", new Cat("Pipotudo"));
        mapa.put("ipotudo", new Cat("ipotudo"));
        mapa.put("potudo", new Cat("potudo"));
        mapa.put("otudo", new Cat("otudo"));
        mapa.put("tudo", new Cat("tudo"));
        mapa.put("udo", new Cat("udo"));
        mapa.put("do", new Cat("do"));
        mapa.put("Pipotud", new Cat("Pipotud"));
        mapa.put("Pipotu", new Cat("Pipotu"));
        mapa.put("Pipot", new Cat("Pipot"));

        return mapa;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here

        Set<Cat> catSet = new HashSet<>();



        for(Map.Entry elemento : map.entrySet()){
            catSet.add((Cat) elemento.getValue());
        }

        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

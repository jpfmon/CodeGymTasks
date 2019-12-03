package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here

        Map<String,String> mapa = new HashMap<>();

        mapa.put("Fernandez","Juan");
        mapa.put("ernandez","Juano");
        mapa.put("rnandez","Juanai");
        mapa.put("nandez","Juan");
        mapa.put("andez","Juanas");
        mapa.put("Fernand","Juane");
        mapa.put("Fernand","Juanaa");
        mapa.put("Fernan","Juan");
        mapa.put("Ferna","Juanousi");
        mapa.put("ernande","Juanai");


        return mapa;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

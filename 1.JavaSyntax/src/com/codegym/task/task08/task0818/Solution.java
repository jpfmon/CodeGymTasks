package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here

        HashMap<String,Integer> map = new HashMap<>();
        map.put("Fernandez",1);
        map.put("ernandez",2);
        map.put("rnandez",3);
        map.put("nandez",4);
        map.put("andez",5);
        map.put("ndez",6);
        map.put("Fernande",7);
        map.put("Fernand",8);
        map.put("Fernan",9);
        map.put("Ferna",10);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here

        HashMap<String,Integer> copia = new HashMap<>(map);

        for(Map.Entry<String,Integer> entrada:copia.entrySet()){
            if(entrada.getValue()<500){
                map.remove(entrada.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
package com.codegym.task.task08.task0817;

import org.w3c.dom.html.HTMLMapElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here

        HashMap<String,String> map = new HashMap<>();
        map.put("Fernandez","Juan");
        map.put("ernandez","JuanP");
        map.put("rnandez","Jua");
        map.put("nandez","Juan");
        map.put("andez","Juano");
        map.put("ndez","Juani");
        map.put("Fernande","Juan");
        map.put("Fernand","Juane");
        map.put("Fernan","Ju");
        map.put("Ferna","Juan");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

        ArrayList<String> remove = new ArrayList<>();
        int count=0;

        for(Map.Entry<String,String> entrada:map.entrySet()){

            for(Map.Entry<String,String> entrada2:map.entrySet()){

                if(entrada.getValue().equals(entrada2.getValue())){

                    count++;
                }
            }
            if(count>1 && !remove.contains(entrada.getValue())) {
                remove.add(entrada.getValue());
            }
            count=0;
        }

//        for(String s:remove){
//            System.out.print(s + ".");
//        }

        for(String s:remove){
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

//        for(Map.Entry<String,String> entrada:map.entrySet()){
//            System.out.println(entrada.getKey() + " || " + entrada.getValue());
//        }
    }

    public static void main(String[] args) {

//        HashMap<String,String> map = new HashMap<>();
//        map.put("Fernandez","Juan");
//        map.put("ernandez","JuanP");
//        map.put("rnandez","Jua");
//        map.put("nandez","Juan");
//        map.put("andez","Juano");
//        map.put("ndez","Juani");
//        map.put("Fernande","Juan");
//        map.put("Fernand","Juane");
//        map.put("Fernan","Ju");
//        map.put("Ferna","Juan");
//
//        removeFirstNameDuplicates(map);



    }
}

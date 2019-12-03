package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        HashMap<String, String> hashMap = new HashMap<>();

                hashMap.put("watermelon","melon");
                hashMap.put("banana","fruit");
                hashMap.put("cherry","fruit");
                hashMap.put("pear","fruit");
                hashMap.put("cantaloupe","melon");
                hashMap.put("blackberry","fruit");
                hashMap.put("ginseng","root");
                hashMap.put("strawberry","fruit");
                hashMap.put("iris","flower");
        hashMap.put("potato","tuber");

        for(Map.Entry<String,String> pair:hashMap.entrySet()){
            String key = pair.getKey();
            String value =pair.getValue();
            System.out.println(key +" - " + value);
        }
    }
}

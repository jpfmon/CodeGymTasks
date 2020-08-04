package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id = 0;
        String name = null;



        boolean next = true;

        HashMap<String, Integer> map = new HashMap();



        while (true) {

            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {

                break;
            }

            name = reader.readLine();

            map.put(name, id);
            if(name.isEmpty()){
                break;
            }
        }

        map.forEach((key, value) -> System.out.println( value + " " + key));
    }
}

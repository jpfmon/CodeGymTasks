package com.codegym.task.task08.task0828;

import java.io.*;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String monthStr = buffer.readLine();



        HashMap<String,Integer> months = new HashMap<>();

        months.put("January",1);
        months.put("February",2);
        months.put("March",3);
        months.put("April",4);
        months.put("May",5);
        months.put("June",6);
        months.put("July",7);
        months.put("August",8);
        months.put("September",9);
        months.put("October",10);
        months.put("November",11);
        months.put("December",12);


        int coin=0;



        for(Map.Entry<String,Integer> entrada:months.entrySet()){
            if(entrada.getKey().equals(monthStr)){

                System.out.println(monthStr + " is month " + entrada.getValue());
                break;
            }
        }





    }
}

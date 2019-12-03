package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallon", df.parse("MAY 1 1980"));
        map.put("Stalloe", df.parse("JANUARY 1 1980"));
        map.put("Stallne", df.parse("JUNE 1 1980"));
        map.put("Staone", df.parse("FEBRUARY 1 1980"));
        map.put("Sllone", df.parse("JUNE 1 1980"));
        map.put("Sallone", df.parse("JULY 1 1980"));
        map.put("tallone", df.parse("AUGUST 1 1980"));
        map.put("llone", df.parse("JUNE 1 1980"));
        map.put("tlone", df.parse("MAY 1 1980"));


        return map;
        //write your code here
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here

        ArrayList<String> delete = new ArrayList<>();



        for(Map.Entry<String,Date> entrada:map.entrySet()){
            if(entrada.getValue().getMonth()>4 && entrada.getValue().getMonth()<8){
                delete.add(entrada.getKey());
            }
        }

        for(String s:delete){
            map.remove(s);
        }

    }

    public static void main(String[] args) throws ParseException {



    }
}

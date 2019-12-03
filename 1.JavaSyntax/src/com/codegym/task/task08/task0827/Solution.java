package com.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        Date date1 = new SimpleDateFormat("MMMM dd yyyy").parse(date);

        String[] arr= date.split(" ");

        Date dateBeginning = new SimpleDateFormat("MMMM dd yyyy").parse("JANUARY 1 " + arr[2]);

        //System.out.println(date1);



        long diff = date1.getTime()- dateBeginning.getTime() ;

        long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)+1;

       // System.out.println(dateBeginning);
        //System.out.println(days);


        if(days%2==0){
            return false;
        }else{
            return true;
        }


    }
}

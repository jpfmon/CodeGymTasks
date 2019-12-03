package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String sDate1 = buffer.readLine();

        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);


        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        String strDate = formatter.format(date1);
        String strDateUpper = strDate.toUpperCase();
        //System.out.println("Date Format with MMM dd, yyyy : "+strDate);
        System.out.println(strDateUpper);

    }
}

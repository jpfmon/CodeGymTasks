package com.codegym.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Exception invasion
Populate the list exceptions with ten (10) different exceptions.
The first exception is already implemented in the initExceptions method.


Requirements:
1. The list exceptions must contain 10 elements.
2. All items in the list exceptions must be exceptions (descendants of the Throwable class).
3. All items in the list exceptions must be unique.
4. The initExceptions method must be static.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception

        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
            String str = null;
            System.out.println(str.length());
        }catch (Exception e){
            exceptions.add(e);
        }

        try{
            int[] arr = new int[4];

            // this statement causes an exception
            int i = arr[4];
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(Exception e) {
            exceptions.add(e);
        }

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (Exception e)
        {
         exceptions.add(e);
        }

        try{
            BufferedReader rd = new BufferedReader(new FileReader(new File("fileName")));
        }catch (Exception e){
            exceptions.add(e);
        }






    }
}

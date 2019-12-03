package com.codegym.task.task09.task0921;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        //write your code here

    ArrayList<Integer> array = new ArrayList<>();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);


        while(true){
            String numberString1 = null;
            try {
                numberString1 = buffer.readLine();

            } catch (IOException e) {
                e.printStackTrace();            }

            try {
                int number1 = Integer.parseInt(numberString1);
                array.add(number1);
            } catch (NumberFormatException e) {
                break;
            }
        }

        for(int i:array){
            System.out.println(i);
        }

    }
}

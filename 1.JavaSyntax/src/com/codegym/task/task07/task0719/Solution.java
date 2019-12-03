package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++){

            String numberString = reader.readLine();
            int numberString1 = Integer.parseInt(numberString);


            list.add(numberString1);
        }

        for(int i=9;i>=0;i--){

            System.out.println(list.get(i));
        }

    }
}

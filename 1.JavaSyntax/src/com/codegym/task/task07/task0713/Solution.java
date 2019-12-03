package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);


        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arrX = new ArrayList<>();


        for(int i=1;i<=20;i++) {
            String numberString1 = buffer.readLine();
            int number1 = Integer.parseInt(numberString1);

            arr.add(number1);
        }

        for(Integer n:arr){
            if(n%3==0){
                arr3.add(n);
            }

            if(n%2==0){
                arr2.add(n);
            }

            if(n%3!=0 && n%2!=0){
                arrX.add(n);
            }
        }

        printList(arr3);
        printList(arr2);
        printList(arrX);

    }

    public static void printList(List<Integer> list) {
        //write your code here

        for(Integer n:list){
            System.out.println(n);
        }
    }
}

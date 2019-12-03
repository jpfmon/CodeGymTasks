package com.codegym.task.task08.task0822;

import java.io.*;
import java.util.*;

/* 
Minimum of N numbers

*/

public class Solution {



    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here

        int min = Integer.MAX_VALUE;

        for(int n:array){
            if(n<min){
                min = n;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String NS = buffer.readLine();

        int N = Integer.parseInt(NS);

        List<Integer> lista = new ArrayList<>();

        for(int i=1;i<=N;i++) {

            String numberString = buffer.readLine();
            int number = Integer.parseInt(numberString);
            lista.add(number);
        }
        return lista;
    }
}

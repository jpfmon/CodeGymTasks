package com.codegym.task.task19.task1920;

/* 
The richest
The first parameter of the main method is a file name.
Each line of the specified file has the following format:
name value
where [name] is a String and [value] is a double. [name] and [value] are separated by a space.

Find the sum of all the values for each name.
Display in alphabetical order the names with the highest sum.
Separate the names with a space or new line.
Close the streams.

Example input file:
Peterson 0.501
Smith 1.35
Peterson 0.85

Example output:
Peterson


Requirements:
1. The program must NOT read data from the console.
2. The program must read the file's contents (use FileReader).
3. The file input stream (FileReader) must be closed.
4. The program should output the names with the highest sum to the console.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        TreeMap<String,Double> treeMap = new TreeMap<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        double value = 0.0;
        String name = "";
        String line = "";


        while (bufferedReader.ready()){

            line = bufferedReader.readLine();

            String[] lineArray = line.split(" ");

            name = lineArray[0];

            value = Double.parseDouble(lineArray[1]);

            if(!treeMap.containsKey(name)){
                treeMap.put(name,value);
            }else{
                double valueI = treeMap.get(name) + value;
                treeMap.replace(name,valueI);
            }
        }

        bufferedReader.close();
        double max = Double.MIN_VALUE;

        for(Map.Entry m:treeMap.entrySet()){
            if((double)m.getValue()>max){
                max = (double) m.getValue();
            }
        }

        TreeMap<String,Double> finalMap = new TreeMap<>();

        for(Map.Entry m:treeMap.entrySet()){
            if((double)m.getValue()==max){
                finalMap.put((String) m.getKey(),(Double) m.getValue());
            }
        }

        for(Map.Entry m:finalMap.entrySet()){
            System.out.println(m.getKey());
        }

    }
}

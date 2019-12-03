package com.codegym.task.task19.task1919;

/* 
Calculating salaries
The first parameter of the main method is a file name.
Each line of the specified file has the following format:
name value
where [name] is a String and [value] is a double. [name] and [value] are separated by a space.

Find the sum of all the values for each name.
Display all the data, sorted by name in ascending order.
Close the streams.

Example input file:
Peterson 2
Smith 6
Baxter 1.35
Peterson 3.1

Example output:
Baxter 1.35
Peterson 5.1
Smith 6.0


Requirements:
1. The program must NOT read data from the console.
2. The program must read the file's contents (use FileReader).
3. The file input stream (FileReader) must be closed.
4. The program should write to the console each name, sorted in ascending order, and the sum of all its values.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

        TreeMap<Double,String> finalMap = new TreeMap<>();

        for(Map.Entry m:treeMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        finalMap.put((Double)m.getValue(),(String) m.getKey());
        }

//        for(Map.Entry m:finalMap.entrySet()){
//            System.out.println(m.getValue() + " " + m.getKey());
//        }

        bufferedReader.close();

    }
}

package com.codegym.task.task19.task1924;

import java.awt.image.BufferedImageFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers
1. In a static block, initialize map with (number, word) pairs from 0 to 12 inclusive.
For example, (0, "zero"), (1, "one"), (2, "two")
2. Read the file name from the console, and then read the contents of the file.
3. Use map to replace all of the numbers with words.
4. Display the result.
5. Close the streams.

Example file data:
This costs 1 dollar, but this is 12.
The variable is called file1.
110 is a number.

Example console output:
This costs one dollar, but this is twelve.
The variable is called file1.
110 is a number.


Requirements:
1. The Solution class must have a public static Map<Integer, String> field called words that is initialized immediately.
2. The program must read the file name from the console (use BufferedReader).
3. The BufferedReader used for reading input from the console must be closed after use.
4. The program must read the file's contents (use FileReader).
5. The file input stream (FileReader) must be closed.
6. The program should write all of the lines from the file to the console, but any numbers must be replaced with the corresponding words in map.
7. The Solution class must have a static block that adds thirteen pairs to map.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(fileName));

       //BufferedReader bufferedReaderFile = new BufferedReader(new FileReader("prueba.txt"));

        ArrayList<String> content = new ArrayList<>();

        while (bufferedReaderFile.ready()){
            String line = bufferedReaderFile.readLine();

            String[] lineArray = line.split(" ");

            StringBuilder stringBuilder = new StringBuilder();

            for(String l:lineArray){
                try {
                    String lregex = l.replaceAll("\\W","");
                    int digit = Integer.parseInt(lregex);

                    if(map.containsKey(digit)){
                    for(Map.Entry m:map.entrySet()) {
                        if (digit == (int) m.getKey()) {
                            stringBuilder.append(m.getValue() + " ");
                        }
                    }
                    }else{
                        stringBuilder.append(l + " ");
                    }
                }catch (NumberFormatException e){
                    stringBuilder.append(l + " ");
                }
            }

            String lineToAdd = stringBuilder.toString().trim();
            content.add(lineToAdd);

        }

        bufferedReaderFile.close();

        for(String l:content){
            System.out.println(l);
        }

    }
}

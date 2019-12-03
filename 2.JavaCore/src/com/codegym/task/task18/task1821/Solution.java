package com.codegym.task.task18.task1821;

/* 
Symbol frequency
The program is started with one argument: the name of a file that contains text.
Calculate how often each symbol is encountered.
Sort the results by increasing ASCII code (read about it online).

Example:
','=44, 's'=115, 't'=116.

Display the sorted results:
[symbol1] frequency1
[symbol2] frequency2
Close the streams.

Example output:
, 19
- 7
f 361


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. You need to calculate the frequency of each symbol in the file and display the results.
4. The displayed results should be sorted by ascending ASCII code.
5. The stream used to read the file must be closed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String filaName = args[0];

        ArrayList<Byte> list = new ArrayList<>();
        TreeMap<Character,Integer> map = new TreeMap<>();

        FileInputStream reader = new FileInputStream(args[0]);

        while(reader.available()>0){
            byte letra = (byte) reader.read();
            list.add(letra);
        }

        reader.close();


        for(byte b:list){
            char car = (char) b;

            if(!map.containsKey(car)){
                map.put(car,1);
            }else{
                int count = map.get(car) +1 ;
                map.replace(car,count);
            }
        }

        for(Map.Entry s:map.entrySet()){
            System.out.println(s.getKey() + " " + s.getValue());
        }


    }
}

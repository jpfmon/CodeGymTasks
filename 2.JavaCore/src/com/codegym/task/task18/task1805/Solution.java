package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes
Enter a file name from the console.
Read all the bytes from the file.
Ignoring repetitions, sort them by byte-code in ascending order.
Display the result on the screen.
Close the IO stream.

Example of bytes in the input file:
44 83 44

Example output:
44 83


Requirements:
1. The program should read a file name from the console.
2. Use a FileInputStream to read from the file.
3. The program should display all the unique bytes in the file in ascending order, separated by spaces.
4. The screen output should be displayed in one line.
5. The stream used to read the file must be closed.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Byte> array = new ArrayList<>();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";

        fileName = buffer.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        byte actual = 0;

        while (inputStream.available() > 0) {

            actual = (byte) inputStream.read();
            array.add(actual);
        }

        inputStream.close();

        TreeSet<Byte> set = new TreeSet<>();

        for(byte b:array){
            set.add(b);
        }

        for(byte b:set){
            System.out.print(b + " ");
        }




    }
}
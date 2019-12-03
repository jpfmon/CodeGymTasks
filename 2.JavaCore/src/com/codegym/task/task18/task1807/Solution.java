package com.codegym.task.task18.task1807;

/* 
Counting commas
Read a file name from the console.
Count the number of commas (',') in the file. Display the number.
Close the streams.

Hint:
You need to compare with the ASCII code for ','.


Requirements:
1. The program should read a file name from the console.
2. Use a FileInputStream to read from the file.
3. The program should display the number of commas in the read file.
4. The stream used to read the file must be closed.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";

        fileName = buffer.readLine();

        buffer.close();

        FileInputStream inputStream = new FileInputStream(fileName);

        int count =0;

        byte actual = 0;

        while (inputStream.available() > 0) {

            actual = (byte) inputStream.read();

            if(actual==44){
                count++;
            }
        }
            inputStream.close();

        System.out.println(count);
    }
}

package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte
Enter a file name from the console.
Find the maximum byte in the file. Display it on the screen.
Close the IO stream.


Requirements:
1. The program should read a file name from the console.
2. Use a FileInputStream to read from the file.
3. The program should display the maximum byte read from the file.
4. The stream used to read the file must be closed.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String fileName="";

        fileName = buffer.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        byte max = -128;
        byte actual = 0;

        while(inputStream.available() > 0){

            actual = (byte) inputStream.read();

            if(actual>max){
                max=actual;
            }
        }
        inputStream.close();

        System.out.println(max);
    }
}

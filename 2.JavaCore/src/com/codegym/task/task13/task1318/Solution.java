package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file
1. Read a file name from the console.
2. Display the contents of the file in the console (on the screen).
3. Don't forget to free up resources. Close the streams for file input and keyboard input.


Requirements:
1. The program must read the file name from the console.
2. The program must display the contents of the file.
3. You must close the file input stream (FileInputStream).
4. The BufferedReader must also be closed.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        InputStream inStream = new FileInputStream(name);

        Reader nuevo = new InputStreamReader(inStream);

        while (nuevo.ready()){
            System.out.print((char)nuevo.read());
        }
        inStream.close();
        inputStream.close();
        inputStreamReader.close();
        buffer.close();

    }
}
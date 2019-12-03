package com.codegym.task.task19.task1926;

/* 
Mirror image
1. Read a file name from the console. Read the contents of the file.
2. For each line in the file:
2.1. reverse the order of all characters.
2.2. display the result.
3. Close the streams.

Example input file:
I'm a programmer.
Amigo

Example result:
.remmargorp a m'I
ogimA


Requirements:
1. The program must read the file name from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the file's contents (use FileReader).
4. The file input stream (FileReader) must be closed.
5. The program should display all of the characters from the file in reverse order.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(file));
        boolean first = true;

        while (bufferedReaderFile.ready()){

            if(!first){
                System.out.println();
            }
            String line = bufferedReaderFile.readLine();

            char[] array = line.toCharArray();

            for(int  i=array.length-1;i>=0;i--){
                System.out.print(array[i]);
            }

            first = false;
        }

        bufferedReaderFile.close();
    }
}

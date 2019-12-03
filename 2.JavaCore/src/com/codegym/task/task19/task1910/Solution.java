package com.codegym.task.task19.task1910;

/* 
Punctuation
Read 2 file names from the console.
The first file contains text.
Read the contents of the first file, and remove all punctuation marks, including newline characters.

Then output the result to the second file.

Close the streams.


Requirements:
1. The program should read file names from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the first file's contents (use the BufferedReader constructor that takes a FileReader argument).
4. The file input stream (BufferedReader) must be closed.
5. The program must write the contents of the first file to the second file, removing all punctuation marks, including newline characters
(use the BufferedWriter constructor that takes a FileWriter argument to write to the file).
6. The file output stream (BufferedWriter) must be closed.
*/

import java.io.*;

public class Solution {





    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        bufferedReader.close();
        //"data.txt"
        //"result.txt"
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        String pattern = "\\p{Punct}";

        while (bufferedReader1.ready()){

            String line = bufferedReader1.readLine();
            System.out.println(line.replaceAll(pattern,""));
            String lineToWrite = line.replaceAll(pattern,"");
            bufferedWriter.write(lineToWrite);

        }

        bufferedReader1.close();
        bufferedWriter.close();

    }
}

package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks
Read 2 file names from the console.
The first file contains text.
Read the contents of the first file and change all the periods (".") to exclamation points ("!").
Then output the result to the second file.
Close the streams.


Requirements:
1. The program should read file names from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the first file's contents (use the BufferedReader constructor that takes a FileReader argument).
4. The file input stream (BufferedReader) must be closed.
5. The program must write the contents of the first file to the second file, replacing all the periods (".") with exclamation points ("!") (use the BufferedWriter constructor that takes a FileWriter argument).
6. The file output stream (BufferedWriter) must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        while (bufferedReader1.ready()){

            int letra = bufferedReader1.read();

            if(letra==46){
                bufferedWriter.write(33);
            }else{
                bufferedWriter.write(letra);
            }

        }

        bufferedReader1.close();
        bufferedWriter.close();
    }
}

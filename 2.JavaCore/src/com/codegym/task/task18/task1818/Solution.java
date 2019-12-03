package com.codegym.task.task18.task1818;

/* 
Two in one
Read 3 file names from the console.
Write the contents of the second file to the first file, and then append the contents of the third file to the first file.
Close the streams.


Requirements:
1. The program should read a file name three times from the console.
2. Create an output stream for the first file. For the other two, create input streams.
3. The contents of the second file must be copied to the first file.
4. The contents of the third file must be appended to the first file (after the second file has been written to the first file).
5. The file streams must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();

        bufferedReader.close();


//"file2.txt", "file3.txt", file1.txt
        BufferedReader inputStreamReaderFile2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));
        BufferedReader inputStreamReaderFile3 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName3)));
    //fileName1
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName1)));

        while (inputStreamReaderFile2.ready()){
            int letra = inputStreamReaderFile2.read();
            bufferedWriter.write(letra);
        }

        while (inputStreamReaderFile3.ready()){
            int letra = inputStreamReaderFile3.read();
            bufferedWriter.write(letra);
        }

        inputStreamReaderFile2.close();
        inputStreamReaderFile3.close();
        bufferedWriter.close();





    }
}

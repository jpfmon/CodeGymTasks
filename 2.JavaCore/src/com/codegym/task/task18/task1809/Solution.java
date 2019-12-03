package com.codegym.task.task18.task1809;

/* 
Reversing a file
Read 2 file names from the console: file1, file2.
Write all the bytes in file1 to file2, but in the reverse order.
Close the streams.


Requirements:
1. The program should read a file name twice from the console.
2. Use FileInputStream to read from a file, and use FileOutputStream to write to a file.
3. In the second file, you need to write all the bytes from the first file in the reverse order.
4. The FileInputStream and FileOutputStream must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String file1 = buffer.readLine();
        String file2 = buffer.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);

        int length = inputStream.available();

        int maxIndex = length-1;

        byte[] bufferF = new byte[length];
        byte[] bufferF2 = new byte[length];

        inputStream.read(bufferF);

        for(int i=maxIndex;i>=0;i--){
            bufferF2[maxIndex-i] = bufferF[i];
        }

        outputStream2.write(bufferF2);

        buffer.close();
        inputStream.close();
        outputStream2.close();
    }
}

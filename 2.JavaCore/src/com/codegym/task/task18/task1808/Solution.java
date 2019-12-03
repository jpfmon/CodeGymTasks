package com.codegym.task.task18.task1808;

/* 
Splitting a file
Read 3 file names from the console: file1, file2, file3.
Split file1 as follows:
Write the first half of its bytes to file2,and write the second half of its bytes to file3.
If the number of bytes in file1 is odd, then file2 should contain the larger half.
Close the streams.


Requirements:
1. The program should read a file name three times from the console.
2. Use FileInputStream to read from a file, and use FileOutputStream to write to files.
3. The first half of the bytes in the first file must be written to the second file.
4. The second half of the bytes in the first file must be written to the third file.
5. The FileInputStream and FileOutputStream must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String file1 = buffer.readLine();
        String file2 = buffer.readLine();
        String file3 = buffer.readLine();



        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        int length = inputStream.available();

        byte[] bufferF = new byte[length];

        int count = inputStream.read(bufferF);

        if(count%2!=0){
            int half = count/2+1;
            int left = count-half;
            outputStream2.write(bufferF,0,half);
            outputStream3.write(bufferF,half,left);
        }else{
            int half = count/2;
            int left = count-half;
            outputStream2.write(bufferF,0,half);
            outputStream3.write(bufferF,half,left);
        }

        buffer.close();
        inputStream.close();
        outputStream2.close();
        outputStream3.close();








    }
}

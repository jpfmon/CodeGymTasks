package com.codegym.task.task18.task1819;

/* 
Combining files
Read 2 file names from the console.
Write the contents of the second file to the beginning of the first file so that the files are combined.
Close the streams.


Requirements:
1. The program should read a file name twice from the console.
2. Create an input stream for the first file and read its contents.
3. Then create an output stream for the first file. And an input stream for the second file.
4. The contents of the first and second files must be combined in the first file.
5. The contents of the second file should go first, then the contents of the first file.
6. The file streams must be closed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String file1 = reader.readLine();
            String file2 = reader.readLine();

            FileInputStream inputStream1 = new FileInputStream(file1);
            FileInputStream inputStream2 = new FileInputStream(file2);
            List<Integer> list = new ArrayList<>();

            while (inputStream2.available() > 0) {
                int data = inputStream2.read();
                list.add(data);
            }


            while (inputStream1.available() > 0) {
                int data = inputStream1.read();

                list.add(data);
            }

            FileOutputStream outputStream = new FileOutputStream(file1);
            for (int i = 0; i < list.size(); i++) {
                outputStream.write(list.get(i));
            }

            outputStream.close();
            inputStream1.close();
            inputStream2.close();


        } catch (IOException e) {
        }
    }

}
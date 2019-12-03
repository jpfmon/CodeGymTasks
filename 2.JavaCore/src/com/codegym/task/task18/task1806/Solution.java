package com.codegym.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Fix the bugs
Fix the functionality according to the requirements.

The program should:
1. Write all the bytes from one file into another in one batch.
2. Close the IO streams.

Hint:
There are 4 bugs.


Requirements:
1. The program must use the FileInputStream and FileOutputStream classes.
2. The program should write all the bytes from one file into another in one batch.
3. The FileInputStream and FileOutputStream must be closed.
4. You need to fix 4 bugs.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Create a stream to write bytes to a file

        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) {
            // Read the entire file in one batch

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            outputStream.write(buffer);
            //outputStream.flush();
        }

        inputStream.close();

        outputStream.close();
    }
}

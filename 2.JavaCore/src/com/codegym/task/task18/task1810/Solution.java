package com.codegym.task.task18.task1810;

/* 
DownloadException
1 Read file names from the console.
2 If the file is less than 1000 bytes, then:
2.1 Close the file stream.
2.2. Throw a DownloadException.


Requirements:
1. The program should read file names from the console.
2. Use a FileInputStream to read from the files.
3. The program should work until the entered file is less than 1000 bytes.
4. The program should terminate with a DownloadException.
5. The FileInputStream must be closed.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            String file1 = buffer.readLine();
            FileInputStream inputStream = new FileInputStream(file1);
            if(inputStream.available()<1000){
                inputStream.close();
                throw new DownloadException();
            }else{
                inputStream.close();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}

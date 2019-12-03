package com.codegym.task.task18.task1816;

/* 
ABCs
The first parameter of the main method is a file name.
Count the letters of the English alphabet in the file.
Display the number of letters.
Close the streams.


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. You need to count the letters of the English alphabet in the file and display the number.
4. You must count both uppercase and lowercase letters.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        int count = 0;

        while (inputStreamReader.ready()){
            int letra = inputStreamReader.read();

            if(letra >= 65 && letra <= 90 || letra >= 97 && letra <=122){
                count++;
            }
        }

        inputStreamReader.close();
        System.out.println(count);

    }
}

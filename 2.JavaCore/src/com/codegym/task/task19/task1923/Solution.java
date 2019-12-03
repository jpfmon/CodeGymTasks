package com.codegym.task.task19.task1923;

/* 
Words with numbers
The main method's first parameter is file1 and the second is file2.
file1 contains lines with words separated by spaces.
Write to file2 all the words that contain numbers, for example, a1 or abc3d. Separate the words with spaces.
Close the streams.


Requirements:
1. The program must NOT read data from the console.
2. The program must read the first file's contents (use the FileReader constructor with a String parameter).
3. The file input stream (FileReader) must be closed.
4. The program should write all the words containing numbers from the first file to the second file (use FileWriter).
5. The file output stream (FileWriter) must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file1 = args[0];
        String file2 = args[1];

        BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriterFile2 = new BufferedWriter(new FileWriter(file2));

        while (bufferedReaderFile1.ready()){
            String line = "";

            line = bufferedReaderFile1.readLine();

            String[] lineArray = line.split(" ");

            for(String s:lineArray){
                boolean valid = false;

                for(char c:s.toCharArray()){
                    if(c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9'){
                        valid=true;
                        break;
                       }
                }

                if(valid){
                    bufferedWriterFile2.write(s + " ");
                }
            }
        }

        bufferedReaderFile1.close();
        bufferedWriterFile2.close();

    }
}

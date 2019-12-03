package com.codegym.task.task19.task1925;

/* 
Long words
The main method's first parameter is file1 and the second is file2.
file1 contains words separated by spaces.
Write to file2 a comma-separated list of words longer than 6 characters.
file2 should not end with a comma.
Close the streams.

Example output to file2:
lengthy,shortened,abbreviation


Requirements:
1. The program must NOT read data from the console.
2. The program must read the first file's contents (use the FileReader constructor with a String parameter).
3. The file input stream (FileReader) must be closed.
4. The program should write to the second file all the words from the first file longer than 6 characters, separated by commas (use FileWriter).
5. The file output stream (FileWriter) must be closed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

//    public static void main(String[] args) throws IOException {
//
//        String file1 = args[0];
//
//        String file2 = args[1];
//
//        BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(file1));
//
//        FileWriter fileWriter = new FileWriter(file2);
//
//        int index = 0;
//        boolean first = true;
//
//        String word = "";
//
//        while (bufferedReaderFile1.ready()){
//
//            word = bufferedReaderFile1.readLine();
//
//            String[] wordArray = word.split(" ");
//
//            if(!first){
//                fileWriter.write("\r");
//            }
//            for(String w:wordArray){
//                if(w.length()>6) {
//                    if (index > 0) {
//                        fileWriter.write("," + w);
//                        index++;
//                    }else {
//                        fileWriter.write(w);
//                        index++;
//                    }
//                }
//            }
//            index =0;
//            first = false;
//        }
//        bufferedReaderFile1.close();
//        fileWriter.close();
//    }

    public static void main(String[] args) throws IOException {

        String file1 = args[0];

        String file2 = args[1];

        BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(file1));

        FileWriter fileWriter = new FileWriter(file2);

        int index = 0;

        String line = "";

        while (bufferedReaderFile1.ready()){

            line = bufferedReaderFile1.readLine();

            String[] wordArray = line.split(" ");

            for(String w:wordArray){
                if(w.length()>6) {
                    if (index > 0) {
                        fileWriter.write("," + w);
                        index++;
                    }else {
                        fileWriter.write(w);
                        index++;
                    }
                }
            }
        }
        bufferedReaderFile1.close();
        fileWriter.close();
    }


}

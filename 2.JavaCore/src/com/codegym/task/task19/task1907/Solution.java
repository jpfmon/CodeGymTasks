package com.codegym.task.task19.task1907;

/* 
Counting words
Read a file name from the console.
The file contains words separated by punctuation marks.
Output to the console the number of times the word "world" appears in the file.
Close the streams.


Requirements:
1. The program must read the file name from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the file's contents (use the FileReader constructor that takes a String argument).
4. The file input stream (FileReader) must be closed.
5. The program must output to the console the number of times the word "world" appears in the file.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader input = new FileReader(fileName);
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\\W");
        int worldCount = 0;
        while (scanner.hasNext()){
            String data = scanner.next();
            if (data.equals("world")) {
                worldCount++;
            }
        }
        scanner.close();
        input.close();
        System.out.println(worldCount);
    }
}

//public class Solution {
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//
//        String filename="";
//
//
//            filename = buffer.readLine();
//            buffer.close();
//
//
//        FileReader fileReader = null;
//
//             fileReader = new FileReader(filename);
//
//        int count = 0;
//
//        int letter=0;
//
//
////        w = 119
////        o = 111
////        r = 114
////        l = 108
////        d = 100
//
//
//        boolean isW = false;
//        boolean isO = false;
//        boolean isR = false;
//        boolean isL = false;
//        boolean isD = false;
//        boolean spaceIn = false;
//
//
//        while (fileReader.ready()){
//            letter = fileReader.read();
//
//            if(letter==32){
//                if(!spaceIn){
//                    spaceIn = true;
//                }
//            }
//
//            if(letter==119) {
//            isW = true;
//            }
//
//                if(isW && spaceIn){
//                    switch (letter){
//                        case 119:
//                            break;
//                        case 111:
//                            isO = true;
//                            break;
//                        case 114:
//                            if(isW && isO){
//                                isR=true;
//                                break;
//                            }else{
//                                isW = false;
//                                isO = false;
//                                spaceIn =false;
//                                break;
//                            }
//                        case 108:
//                            if(isW && isO && isR){
//                                isL = true;
//                                break;
//                            }else{
//                                isW = false;
//                                isO = false;
//                                isR = false;
//                                spaceIn =false;
//                                break;
//                            }
//                        case 100:
//                            if(isW && isO && isR && isL){
//                                isD = true;
//                                if(fileReader.read()==32){
//                                    count++;
//                                    isW = false;
//                                    isO = false;
//                                    isR = false;
//                                    isL = false;
//                                    isD = false;
//                                    spaceIn =false;
//                                    break;
//                                }else {
//                                    isW = false;
//                                    isO = false;
//                                    isR = false;
//                                    isL = false;
//                                    isD = false;
//                                    spaceIn =false;
//                                    break;
//                                }
//                            }else{
//                                isW = false;
//                                isO = false;
//                                isR = false;
//                                isL = false;
//                                spaceIn =false;
//                                break;
//                            }
//                        default:
//                            isW = false;
//                            spaceIn =false;
//                    }
//                }
//        }
//
//        fileReader.close();
//
//        System.out.println(count);
//    }
//}

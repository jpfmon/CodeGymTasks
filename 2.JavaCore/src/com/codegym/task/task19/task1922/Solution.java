package com.codegym.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines
Read a file name from the console.
Display all of the file's lines that contain only 2 words in the words list.
Close the streams.

Example:
words contains the words A, B, and C

Lines:
C B A D // 3 words from words, rejected
A B A D // 3 words from words, rejected
D A D // 1 word from words, rejected
D A B D // 2 words from words, accepted, display it
D A A D // 2 words from words, accepted, display it


Requirements:
1. The Solution class must have a public static List<String> field called words that is initialized immediately.
2. The Solution class must have a static block that adds three or more words to the words list.
3. The program must read the file name from the console (use BufferedReader).
4. The BufferedReader used for reading input from the console must be closed after use.
5. The program must read the file's contents (use FileReader).
6. The file input stream (FileReader) must be closed.
7. The program should display all of the file's lines that contain only 2 words in the words list.
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";

        fileName = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedFile = new BufferedReader(new FileReader(fileName));



        while(bufferedFile.ready()){

            String line = "";

            line = bufferedFile.readLine();

            String[] lineArray = line.split(" ");

            int count = 0;

            for(String s:lineArray){
                if(words.contains(s)){
                    count++;
                }
            }

            if(count==2){
                System.out.println(line);
            }

        }

        bufferedFile.close();
    }
}

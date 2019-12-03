package com.codegym.task.task19.task1908;

/* 
Picking out numbers
Read 2 file names from the console.
Output to the second file all of the numbers from the first file.
Separate the numbers with a space.
Close the streams.

Example file content:
12 text var2 14 8v 1

Result:
12 14 1


Requirements:
1. The program should read file names from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the first file's contents (use the BufferedReader constructor that takes a FileReader argument).
4. The file input stream (BufferedReader) must be closed.
5. The program must write all of the numbers from the first file, separated by spaces, to the second file (use the BufferedWriter constructor that takes a FileWriter argument).
6. The file output stream (BufferedWriter) must be closed.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = bufferedReader.readLine();

        String filename2 = bufferedReader.readLine();

        bufferedReader.close();

        FileReader fileReader = new FileReader(filename1);
        FileWriter fileWriter = new FileWriter(filename2);

        BufferedReader bufferedReader1 = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while(bufferedReader1.ready()){
            String arg = bufferedReader1.readLine();
            String[] array = arg.split(" ");

            for(String s:array){
                try {
                    int number = Integer.parseInt(s);
                   // System.out.print(number + " ");
                    bufferedWriter.write(number + " ");
                }catch (Exception e){

                }
            }
        }
        bufferedWriter.close();
        bufferedReader1.close();


    }

}




//    public static void main(String[] args) throws IOException {
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String filename1 = bufferedReader.readLine();
//
//        String filename2 = bufferedReader.readLine();
//
//        bufferedReader.close();
//
//        FileReader fileReader = new FileReader(filename1);
//        FileWriter fileWriter = new FileWriter(filename2);
//
//        Scanner scanner = new Scanner(fileReader);
//
//        while(scanner.hasNext()) {
//            try {
//                String string = scanner.next();
//                int number = Integer.parseInt(string);
//                fileWriter.write(number + " ");
//            } catch (Exception p) {
//
//            }
//        }
//        scanner.close();
//        fileReader.close();
//        fileWriter.close();
//
//    }
//}

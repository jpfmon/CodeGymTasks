package com.codegym.task.task18.task1820;

/* 
Rounding numbers
Read 2 file names from the console.
The first file contains real (fractional) numbers, separated by spaces. For example, 3.1415.
Round the numbers to integers and write them, separated by spaces, to the second file.
Close the streams.

The rounding should work like this:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4

Requirements:
1. The program should read a file name twice from the console.
2. Create an input stream for the first file. Create an output stream for the second file.
3. Read the numbers from the first file, round them, and write them to the second file, separated by spaces.
4. The rounding must be performed as indicated in the task.
5. The file streams must be closed.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        Scanner scanner = new Scanner(new FileInputStream(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));

        while(scanner.hasNext()){

            double number = Double.parseDouble(scanner.next());

            int numberInt =(int)  Math.round(number);
            bufferedWriter.write(numberInt + " ");
        }


        scanner.close();
        bufferedWriter.close();
    }
}

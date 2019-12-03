package com.codegym.task.task19.task1906;

/* 
Even characters
Read 2 file names from the console.
Output to the second file all characters from the first file with an even ordinal number (ordinal numbers start with 1).

Example first file:
text in file
Output in the second file:
eti ie
Close the IO streams.


Requirements:
1. The program should read file names from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the first file's contents (use the FileReader constructor with a String parameter).
4. The file input stream (FileReader) must be closed.
5. The program must write to the second file all bytes from the first file with an even ordinal number (use FileWriter).
6. The file output stream (FileWriter) must be closed.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


//        String file1 = bufferedReader.readLine();
//        String file2 = bufferedReader.readLine();


        FileReader reader = new FileReader("data.txt");
        FileWriter writer = new FileWriter("result.txt");

//        FileReader reader = new FileReader(file1);
//        FileWriter writer = new FileWriter(file2);
        int i = 1;
        while (reader.ready()) //as long as there are unread bytes in the input stream
        {
            int data = reader.read(); //Read one character (the char will be widened to an int)
            System.out.println(data);
            String dataString = data+"";
            char[] dataStringToArray = dataString.toCharArray();

            int c = Integer.parseInt(String.valueOf(dataStringToArray[0]));

            if(c==1){
                if(data%2==1 && i%2==0){
                    writer.write(data);
                    System.out.println("writing: " +  data);
                }
            }
        i++;
        }

        bufferedReader.close();
        reader.close();
        writer.close();

    }
}

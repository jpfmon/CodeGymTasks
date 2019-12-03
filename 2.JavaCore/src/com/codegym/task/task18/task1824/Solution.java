package com.codegym.task.task18.task1824;

/* 
Files and exceptions
Read file names from the console.
If the file does not exist (i.e. an invalid file name is given), then catch the FileNotFoundException, display the invalid file name, and exit the program.
Close the streams.
Don't use System.exit();


Requirements:
1. The program should read file names from the console.
2. You need to create an input stream for each file.
3. If the file does not exist, the program must catch the FileNotFoundException.
4. After catching the exception, the program should display the file name and exit.
5. The file input streams must be closed.
6. Don't use "System.exit();".
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        File file = null;
        ArrayList<FileInputStream> arrayList = new ArrayList<>();

        while(true){

            fileName = bufferedReader.readLine();

            try{
                FileInputStream fileInputStream = new FileInputStream(fileName);
                arrayList.add(fileInputStream);
            }catch (FileNotFoundException f){
                System.out.println(fileName);
                for(FileInputStream streams:arrayList){
                    streams.close();
                }
                break;
            }


        }

    }
}

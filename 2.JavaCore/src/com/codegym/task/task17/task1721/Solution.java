package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality
Make the joinData method transactional, i.e. if it fails, then the data must not be changed.
1. Read 2 file names from the console.
2. Read from the files line by line. Read from the first file into allLines, from the second file — into linesForRemoval.
In the joinData method:
3. If the allLines list contains all the lines from linesForRemoval, then remove from the allLines list all the lines that are in linesForRemoval.
4. If the condition in Item 3 is not satisfied, then:
4.1. clear the data in allLines
4.2. throw a CorruptedDataException
The joinData method should be called in main. Handle all exceptions in the main method.
Don't forget to close the streams.


Requirements:
1. The Solution class must contain a public static List<String> field called allLines.
2. The Solution class must contain a public static List<String> field called linesForRemoval.
3. The Solution class must have a public void joinData() method that can throw a CorruptedDataException.
4. The program should read the names of two files from the console.
5. The program must read line by line from the first file into the allLines list.
6. The program must read line by line from the second file into the linesForRemoval list.
7. The joinData method must remove from the allLines list all lines in the linesForRemoval list if allLines contains all the lines in the linesForRemoval list.
8. The joinData method must clear the allLines list and throw a CorruptedDataException, if allLines does not contain all the lines in the linesForRemoval list.
9. The joinData method should be called in main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {

        Solution sl = new Solution();

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String file1Name ="";

        String file2Name = "";

        try {
             file1Name = buffer.readLine();
             file2Name = buffer.readLine();
        } catch (IOException e) {

        }

        InputStream inStreamFile = null;
        try {
            inStreamFile = new FileInputStream(file1Name);
        } catch (FileNotFoundException e) {

        }
        Reader inputStreamReaderFile = new InputStreamReader(inStreamFile);
        BufferedReader bufferFile = new BufferedReader(inputStreamReaderFile);
        try{
            String line = bufferFile.readLine();
            while (line != null){
            sl.allLines.add(line);
            line = bufferFile.readLine();
        }}
        catch (Exception e){

        }

        InputStream inStreamFile2 = null;
        try {
            inStreamFile2 = new FileInputStream(file2Name);
        } catch (FileNotFoundException e) {

        }
        Reader inputStreamReaderFile2 = new InputStreamReader(inStreamFile2);
        BufferedReader bufferFile2 = new BufferedReader(inputStreamReaderFile2);
        try{
            String line2 = bufferFile2.readLine();
            while (line2 != null){
                sl.linesForRemoval.add(line2);
                line2 = bufferFile2.readLine();
            }}
        catch (Exception e){

        }
        try {
            buffer.close();
            bufferFile.close();
            bufferFile2.close();
        }catch (IOException e){

        }



        try {
            sl.joinData();
        }
        catch (CorruptedDataException e){

        }

    }

    public void joinData() throws CorruptedDataException {

        boolean allContained = true;

        List<String> allLinesCopy = new ArrayList<>(allLines);

        for(String s:linesForRemoval){
            if(allLinesCopy.contains(s)){
                allContained = true;
                allLines.remove(s);
            }else{
                allContained = false;
                allLines.clear();
                throw new CorruptedDataException();
            }
        }

    }
}

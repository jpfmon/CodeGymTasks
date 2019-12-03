package com.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter
Adapt Scanner to the PersonScanner interface.
The adapter class is PersonScannerAdapter.
Create a private final Scanner field called fileScanner in the adapter class.
Initialize the field in a constructor with one Scanner parameter.

The file stores data in the following format:
John Michael Peterson 12 31 1950
Larry Thomas Gates 12 31 1957
The file contains information about a lot of people. Each line has data for a single person. The read() method must read only one person's information.


Requirements:
1. PersonScanner must be an interface.
2. The PersonScannerAdapter class must implement the PersonScanner interface.
3. The PersonScannerAdapter class must have a private Scanner field called fileScanner.
4. The PersonScannerAdapter class must have a constructor with a Scanner parameter.
5. The PersonScannerAdapter class's close() method must delegate the call to fileScanner.
6. The PersonScannerAdapter class's read() method should read a line from the file, parse it, and return only one person's data as an Person object.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String s = fileScanner.nextLine();
            String[] parsedS = s.split(" ");
            //public Person(String lastName, String firstName, String middleName, Date birthDate) {
            // John Michael Peterson 12 31 1950

            String date = parsedS[3] + " " + parsedS[4] + " " + parsedS[5];
            Date date1=null;
            try {
                 date1=new SimpleDateFormat("MM dd yyyy").parse(date);
            } catch (ParseException e) {
                //e.printStackTrace();
            }

            return new Person(parsedS[2],parsedS[0],parsedS[1],date1);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

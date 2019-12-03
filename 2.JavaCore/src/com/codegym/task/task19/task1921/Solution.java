package com.codegym.task.task19.task1921;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
John Johnson
The first parameter of the main method is a file name.
Each line of the specified file has the following format:
name month day year
where [name] is a String that can contain several words separated by spaces.
[month] is an int, [day] is an int, and [year] is an int.
The data is separated by spaces.

Fill the PEOPLE list using the file's data.
Close the streams.

Example input file:
John Jack Johnson 12 31 1987
Vincent 5 15 2013


Requirements:
1. The Solution class must contain a public List<Person> constant called PEOPLE, which must be initialized immediately.
2. The program must NOT read data from the console.
3. The program must read the file's contents (use FileReader).
4. The file input stream (FileReader) must be closed.
5. The program must fill the PEOPLE list with data from the file.
6. The program should properly handle hyphenated names, such as Mary-Jo.
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {

        String fileName = args[0];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        //BufferedReader bufferedReader = new BufferedReader(new FileReader("prueba.txt"));






        while (bufferedReader.ready()) {

            String name = "";
            int month = 0;
            int day = 0;
            int year = 0;
            String line = "";
            int index = 0;
            StringBuilder nameBuilder = new StringBuilder();

            line = bufferedReader.readLine();

            String[] lineArray = line.split(" ");
            //System.out.println("Length: " + lineArray.length);

           for(String s:lineArray){
               try{
                   month = Integer.parseInt(s);
                   //System.out.println(month);
                   break;
               }catch (NumberFormatException e){
                nameBuilder.append(s +" ");
               // System.out.println(nameBuilder.toString());
                index++;
               }
           }
           String nameStr = nameBuilder.toString();
           name = nameStr.trim();
           day = Integer.parseInt(lineArray[index + 1]);
           year = Integer.parseInt(lineArray[index + 2]);


           String dateStr = month + " " + day + " " + year;
           //System.out.println(dateStr);
           Date date1=new SimpleDateFormat("MM dd yyyy").parse(dateStr);

            PEOPLE.add(new Person(name,date1));

        }

        bufferedReader.close();

//        for(Person p:PEOPLE){
//            System.out.println(p.getName());
//            System.out.println(p.getBirthDate().toString());
//        }

    }
}

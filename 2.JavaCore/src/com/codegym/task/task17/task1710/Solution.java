package com.codegym.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/* 
CRUD
CrUD: Create, Update, Delete.

The program runs with one of the following sets of arguments:
-c name sex bd
-u id name sex bd
-d id
-i id

Argument values:
name (String)
sex ("m" or "f")
bd (birth date in the following format: "04 15 1990")
-c (adds a person with the specified arguments to the end of allPeople; displays the id on the screen)
-u (updates the data of the person with the specified id)
-d (performs the logical deletion of the person with the specified id; replaces all of its data with null)
-i (displays information about the person with the specified id: name sex (m/f) bd (format Apr 15 1990))

The id corresponds to the index in the list.
All the people should be stored in allPeople.
Use Locale.ENGLISH as the second argument for SimpleDateFormat.

Example arguments:
-c Washington m "04 15 1990"

Example output for the -i argument:
Washington m Apr 15 1990


Requirements:
1. The Solution class must contain a public static List<Person> field called allPeople.
2. The Solution class must have a static block where two people are added to the allPeople list.
3. When you start the program with the -c argument, the program should add the person with the specified arguments to the end of the allPeople list and display the id (index).
4. When you run the program with the -u argument, the program must update the data of the person with the specified id in the allPeople list.
5. When you run the program with the -d argument, the program must perform the logical deletion the person with the specified id in the allPeople list.
6. When you run the program with the -i argument, the program should display the data about the person with the specified id in accordance with the format given in the task.
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // Start here

//        InputStream input = System.in;
//        InputStreamReader reader = new InputStreamReader(input);
//        BufferedReader buffer = new BufferedReader(reader);

        String command="";

        //while(true){

//            try {
//                command = buffer.readLine();
//            } catch (IOException e) {
//            }


//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
//        System.out.println(args[4]);
           // String[] ags = command.split(" ");

//            for(int i=0;i<ags.length;i++){    //printing the splitted command
//                System.out.print(ags[i] + " + ");
//            }

            String key = args[0];
//            System.out.println(key); //printing the key


            switch (key){
                case "-c":
                    String nameC = args[1];
                    String sexC = args[2];
                    String date = args[3];

                    Person personC = caseC(nameC,sexC,date);
                    allPeople.add(personC);
                    System.out.println((allPeople.size()-1)); //this is the id of the newly added
                    //System.out.println(person.getName());
                    break;
                //-u id name sex bd
                    case "-u":
                        String idU = args[1];
                        String nameU = args[2];
                        String sexU = args[3];
                        String dateU = args[4];

                        caseU(idU,nameU,sexU,dateU);
                        break;
                case "-d":
                    String idD = args[1];
                    caseD(idD);
                    break;
                case "-i":
                    String idI = args[1];
                    caseI(idI);
                    break;

            }

        }

    //}
//    -c name sex bd
//-u id name sex bd
//-d id
//-i id
    public static Person caseC(String name, String sex, String date){

//        String monthGood = month.substring(1);
//        String yearGood = year.substring(0,4);
//        System.out.println(monthGood);  //printing the month
//        System.out.println(yearGood);      //printing the year

//        String birthdayString = monthGood + " " + day + " " + yearGood;
//        System.out.println("birthdayString is: " + birthdayString); //printing birthdayString
        SimpleDateFormat birthday = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Date fecha=null;
        try {
            fecha =(Date) birthday.parse(date);
        } catch (ParseException e) {

        }
        Person person=null;

        if(sex.equals("m")){
            person = Person.createMale(name,fecha);
        }else if(sex.equals("f")){
            person = Person.createFemale(name,fecha);
        }
        return person;
    }
    //-u id name sex bd   (updates the data of the person with the specified id)
    public static void caseU(String id,String name,String sex,String date){

//        String monthGood = month.substring(1);
//        String yearGood = year.substring(0,4);
//        String birthdayString = monthGood + " " + day + " " + yearGood;
//        System.out.println("birthdayString is: " + birthdayString); //printing birthdayString
        SimpleDateFormat birthday = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        Date fecha=null;
        try {
            fecha =(Date) birthday.parse(date);
        } catch (ParseException e) {

        }
        allPeople.get((Integer.parseInt(id))).setName(name);
        allPeople.get((Integer.parseInt(id))).setBirthDate(fecha);

        if(sex.equals("m")) {
            allPeople.get((Integer.parseInt(id))).setSex(Sex.MALE);
        }else{
            allPeople.get((Integer.parseInt(id))).setSex(Sex.FEMALE);
        }
    }

    public static void caseD(String id){
        allPeople.get((Integer.parseInt(id))).setBirthDate(null);
        allPeople.get((Integer.parseInt(id))).setName(null);
        allPeople.get((Integer.parseInt(id))).setSex(null);
    }

    //-i (displays information about the person with the specified id: name sex (m/f) bd (format Apr 15 1990))
    // -i id

    public static void caseI(String id){
        String name = allPeople.get((Integer.parseInt(id))).getName();
        Sex sex =  allPeople.get((Integer.parseInt(id))).getSex();
        Date fecha = allPeople.get((Integer.parseInt(id))).getBirthDate();

        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
        String birth = formatter.format(fecha);

//        System.out.println(birth);

        String sexStr=null;

        switch (sex){
            case MALE:
                sexStr = "m";
                break;
            case FEMALE:
                sexStr = "f";
                break;
        }
        System.out.println(name + " " + sexStr + " " + birth);
    }
}

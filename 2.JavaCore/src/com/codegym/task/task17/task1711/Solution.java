package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
The program runs with one of the following sets of arguments:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Argument values:
name (String)
sex ("m" or "f")
bd (birth date in the following format: 04 15 1990)
-c (adds all people with the specified arguments to the end of allPeople; displays their ids in the appropriate order)
-u (updates the corresponding data of people with the specified ids)
-d (performs the logical deletion of the person with the specified id; replaces all of its data with null)
-i (displays information about all people with the specified ids: name sex bd)

The id corresponds to the index in the list.
The birth date format is Apr 15 1990.
All the people should be stored in allPeople.
The order in which data is displayed corresponds to the order in which is input.
Be sure the program is thread safe (works correctly with multiple threads without corrupting the data).
Use Locale.ENGLISH as the second argument for SimpleDateFormat.

Example output for the -i argument with two ids:
Washington m Apr 15 1990
Ross f Apr 25 1997


Requirements:
1. The Solution class must contain a public volatile List<Person> field called allPeople.
2. The Solution class must have a static block where two people are added to the allPeople list.
3. With the -c argument, the program must add all people with the specified arguments to the end of the allPeople list, and display the id of each of them.
4. With the -u argument, the program must update the data of the people with the specified ids in the allPeople list.
5. With the -d argument, the program must perform the logical deletion of the people with the specified ids in the allPeople list.
6. With the -i argument, the program should display data about all the people with the specified ids
according to the format specified in the task.
7. The Solution class's main method must contain a switch statement based on args[0].
8. Each case label in the switch statement must have a synchronization block for allPeople.
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

//            -c name1 sex1 bd1 name2 sex2 bd2 ...
//            -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
//            -d id1 id2 id3 id4 ...
//            -i id1 id2 id3 id4 ...

    public static void main(String[] args) {
        // Start here
//        System.out.println("longitud inicial: " + args.length);

        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                for(int i=0;i<=args.length-4;i=i+3){
                    String nameC = args[i+1];
                    String sexC = args[i+2];
                    String dateC = args[i+3];

                    SimpleDateFormat birthday = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
                    Date fecha=null;
                    try {
                        fecha = birthday.parse(dateC);
                    } catch (ParseException e) {

                    }
                    Person person = null;
                    if(sexC.equals("m")){
                        person = Person.createMale(nameC,fecha);
                    }else{
                        person = Person.createFemale(nameC,fecha);
                    }
                        allPeople.add(person);
                    System.out.println(allPeople.size()-1);
                }}

//                for(int j=2;j<allPeople.size();j++){
//                    System.out.println(j);
//                }
                break;

            //            -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0; i <= args.length - 5; i = i + 4) {
                        String idU = args[i + 1];
                        String nameU = args[i + 2];
                        String sexU = args[i + 3];
                        String dateU = args[i + 4];

                        SimpleDateFormat birthday = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
                        Date fecha = null;
                        try {
                            fecha = birthday.parse(dateU);
                        } catch (ParseException e) {

                        }
                        int index = Integer.parseInt(idU);
                        allPeople.get(index).setName(nameU);

                        if (sexU.equals("f")) {
                            allPeople.get(index).setSex(Sex.FEMALE);
                        } else if (sexU.equals("m")) {
                            allPeople.get(index).setSex(Sex.MALE);
                        }

                        allPeople.get(index).setBirthDate(fecha);
                    }
                }

                break;
//            -d id1 id2 id3 id4 ...

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        int index = Integer.parseInt(args[i]);

                        allPeople.get(index).setName(null);
                        allPeople.get(index).setSex(null);
                        allPeople.get(index).setBirthDate(null);
                    }
                }

                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        int index = Integer.parseInt(args[i]);
                        String name = allPeople.get(index).getName();
                        Sex sex = allPeople.get(index).getSex();
                        Date fecha = allPeople.get(index).getBirthDate();
                        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");

                        String birth = formatter.format(fecha);

                        String sexStr = null;

                        switch (sex) {
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
                break;
        }
    }
}

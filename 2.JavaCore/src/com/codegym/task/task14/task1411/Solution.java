package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, loser, coder and programmer
1. Enter a few strings (keys) from the keyboard [in a loop].
The following strings (keys) are allowed: "user", "loser", "coder", "programmer".
Stop reading in strings after reading in any string that does not match one of the above.

2. For each entered string:
2.1. Create the appropriate object [see Person.java], e.g. create a User object for the string "user".
2.2. Pass this object to the doWork method.
3. Write an implementation of the doWork method, which:
3.1. Calls the live() method on the passed object if person is a User.
3.2. Calls the doNothing() method if person is a Loser.
3.3. Calls the writeCode() method if person is a Coder.
3.4. Calls the enjoy() method if person is a Programmer.


Requirements:
1. The main method must read strings from the keyboard.
2. The main method should stop reading strings from the keyboard as soon as the entered string does not match one of the allowed strings ("user", "loser", "coder", "programmer").
3. For each correctly entered string ("user", "loser", "coder", "programmer"), call the doWork method with the appropriate Person object as the argument.
4. The Solution class must implement a doWork method with one Person parameter.
5. The doWork method should call the live() method on the passed object if it is a User.
6. The doWork method should call the doNothing() method on the passed object if it is a Loser.
7. The doWork method should call the writeCode() method on the passed object if it is a Coder.
8. The doWork method should call the enjoy() method on the passed object if it is a Programmer.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> lista = new ArrayList<>();

        // Here's the loop for reading the keys. Item 1
        boolean quit=false;

        while(!quit){
            key = reader.readLine();
            if(key.equals("user")||key.equals("loser")||key.equals("coder")||key.equals("programmer")) {
                lista.add(key);
            }else{
                quit=true;
            }
        }

        for(int i=0;i<lista.size();i++){
            String element = lista.get(i);
            switch (element){
                case "user":
                    person = new Person.User();
                    doWork(person);
                    break;
                case "loser":
                    person = new Person.Loser();
                    doWork(person);
                    break;
                case "coder":
                    person = new Person.Coder();
                    doWork(person);
                    break;
                case "programmer":
                    person = new Person.Programmer();
                    doWork(person);
                    break;
                default:
                    break;
            }
        }
    }

    public static void doWork(Person person) {
        // Item 3

//        String clase = person.getClass().getSimpleName();
//        //System.out.println(clase);
//        switch (clase){
//            case "User":
//                ((Person.User)person).live();
//                break;
//            case "Loser":
//                ((Person.Loser)person).doNothing();
//                break;
//            case "Coder":
//                ((Person.Coder)person).writeCode();
//                break;
//            case "Programmer":
//                ((Person.Programmer)person).enjoy();
//                break;
//            default:
//        }
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }else if( person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if(person instanceof Person.Programmer){
            ((Person.Programmer) person).enjoy();
        }else if(person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }

    }
}

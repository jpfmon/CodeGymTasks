package com.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Fix four mistakes
1. Think about what the main method does.
2. Create static methods initList(List<Number> list), printListValues​​(List<Number> list), and processCastObjects(List<Number> list) in the Solution class.
3. Find the block of code that fills the list with values ​​and move it to the initList method.
4. Find the block of code that uses a for loop to display the contents of the list, and move it to the printListValues ​​method.
5. Find the block of code that checks the type of each object of the list and displays messages on the screen, and move it to the processCastObjects method.
6. Correct 2 bugs in the printListValues ​​method so that the method correctly displays the contents of the list passed as an argument.
7. Correct 2 bugs related to type casting in the processCastObjects method
- for a Float object, you need to display "Is float defined? " + !(.isNaN()).
- for a Double object, you need to print "Is double infinite? " + <Double object>.isInfinite().


Requirements:
1. The Solution class must implement static methods initList(List<Number> list), printListValues​​(List<Number> list), and processCastObjects(List<Number> list).
2. The initList method must fill the resulting list with random values.
3. The printListValues ​​method should display the contents of the resulting list.
4. The processCastObjects method should analyze the list items and display text for Float and Double objects in accordance with the task conditions.
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<>();
        // 3
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));

        // 4 - Correct 2 bugs
        for (int i = 0; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 5
        for (Number object : list) {
            // Correct 2 bugs
            if (object instanceof Float) {
                Double a = (Double) object;
                System.out.println("Is float defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Float a = (Float) object;
                System.out.println("Is double infinite? " + a.isInfinite());
            }
        }
    }

    public static List<Number> initList(List<Number> list){

        for(int i=0;i<list.size();i++){

        }
 return list;
    }
    static void printListValues​​(List<Number> list){

    }

    static void processCastObjects(List<Number> list){

    }


}

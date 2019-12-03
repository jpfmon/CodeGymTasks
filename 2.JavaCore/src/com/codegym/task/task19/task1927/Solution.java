package com.codegym.task.task19.task1927;

/* 
Contextual advertising
Replace the System.out object in the main method with your own reader wrapper.
Your reader wrapper should display a contextual ad after every other call to println.
Call testString's existing printSomething() method.
Restore the System.out variable back to the original stream.

Ad text: "CodeGym - online Java courses"

Example output:
first
second
CodeGym - online Java courses
third
fourth
CodeGym - online Java courses
fifth


Requirements:
1. The Solution class must contain a TestString class.
2. The Solution class must have a public static TestString field called testString that is initialized immediately.
3. The TestString class must have a public void printSomething() method.
4. The TestString class's printSomething() method must display the following lines: "first","second","third","fourth","fifth".
5. The Solution class's main(String[] args) method must create a PrintStream object (use the PrintStream constructor with a ByteArrayOutputStream parameter).
6. The Solution class's main(String[] args) method should replace and then restore the console output stream (System.out).
7. The Solution class's main(String[] args) method must call testString's printSomething() method.
8. The Solution class's main(String[] args) method must modify and display the lines output by the printSomething() method (by adding contextual ads),
as per the task conditions.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream original = System.out;

        ByteArrayOutputStream recipient = new ByteArrayOutputStream();

        PrintStream nuevo = new PrintStream(recipient);

        System.setOut(nuevo);

        testString.printSomething();

        String printed = recipient.toString();

        System.setOut(original);

        String[] printedArray = printed.split("\\n");

        for (int i = 0; i < printedArray.length; i++) {
            System.out.println(printedArray[i]);
            if (i % 2 == 1) System.out.println("CodeGym - online Java courses");
        }


//        StringBuilder stringBuilder = new StringBuilder();
//
//        boolean first = true;
//        int index = 0;
//        for(String s:printedArray){
//            if(index==0 && !first){
//                stringBuilder = stringBuilder.append("\nCodeGym - online Java courses");
//                stringBuilder = stringBuilder.append(s);
//            }else{
//                stringBuilder = stringBuilder.append(s);
//
//            }
//            index++;
//            first = false;
//            if(index==2){
//                index=0;
//            }
//        }

//        String result = stringBuilder.toString();

//        System.out.println(result);

    }


    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}

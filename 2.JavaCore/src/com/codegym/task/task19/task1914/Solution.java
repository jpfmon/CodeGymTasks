package com.codegym.task.task19.task1914;

/* 
Problem solving
Replace the main method's System.out x object with your own reader wrapper similar to the one shown in the lesson.
Your reader wrapper should output the solution to the console.
Call testString's existing printSomething() method.
Restore the System.out variable back to the original stream.

Possible operations: + - *
Format of input and output: a [operator] b = c
Negative numbers, fractions, and unary operators (such as factorials and square roots) are not allowed.

Example output:
3 + 6 = 9


Requirements:
1. The Solution class must contain a TestString class.
2. The Solution class must have a public static TestString field called testString that is initialized immediately.
3. The TestString class must have a public void printSomething() method.
4. The TestString class's printSomething() method must display the string "3 + 6 = ".
5. The Solution class's main(String[] args) method must create a PrintStream object (use the PrintStream constructor with a ByteArrayOutputStream parameter).
6. The Solution class's main(String[] args) method should replace and then restore the console output stream (System.out).
7. The Solution class's main(String[] args) method must call testString's printSomething() method.
8. The Solution class's main(String[] args) method must modify the line printed by the printSomething() method,
as per the task conditions, and output it to the console.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream original = System.out;

        ByteArrayOutputStream recipient = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(recipient);

        System.setOut(printStream);

        testString.printSomething();

        String result = recipient.toString();

        String finalResult = "";

        String[] elements = result.split(" ");

        int a =0;

        switch (elements[1]){
            case "+":
                a = Integer.parseInt(elements[0]) + Integer.parseInt(elements[2]);
                finalResult = elements[0] + " " + elements[1] + " " + elements[2] + " = " + a;
                break;
            case "-":
                a = Integer.parseInt(elements[0]) - Integer.parseInt(elements[2]);
                finalResult = elements[0] + " " + elements[1] + " " + elements[2] + " = " + a;
                break;
            case "*":
                a = Integer.parseInt(elements[0]) * Integer.parseInt(elements[2]);
                finalResult = elements[0] + " " + elements[1] + " " + elements[2] + " = " + a;
                break;
        }


        System.setOut(original);
        //System.out.println("hola");
        //System.out.println(elements[1]);
        System.out.println(finalResult);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


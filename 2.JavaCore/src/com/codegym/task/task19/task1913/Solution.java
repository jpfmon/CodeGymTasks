package com.codegym.task.task19.task1913;

/* 
Output only digits
Replace the main method's System.out object with your own reader wrapper similar to the one shown in the lesson.
Your reader wrapper should output only digits.
Call testString's existing printSomething() method.
Restore the System.out variable back to the original stream.
Display the modified string.

Example output:
12345678


Requirements:
1. The Solution class must contain a TestString class.
2. The Solution class must have a public static TestString field called testString that is initialized immediately.
3. The TestString class must have a public void printSomething() method.
4. The TestString class's printSomething() method must display "This 1 text 23 is 4 f5-6or7 tes8ting".
5. The Solution class's main(String[] args) method must create a PrintStream object (use the PrintStream constructor with a ByteArrayOutputStream parameter).
6. The Solution class's main(String[] args) method should replace and then restore the console output stream (System.out).
7. The Solution class's main(String[] args) method must call testString's printSomething() method.
8. The Solution class's main(String[] args) method must modify the line printed by the printSomething() method, as per the task conditions, and output it to the console.
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

        String resultFinal = result.replaceAll("[^0-9]","");

        System.setOut(original);

        //System.out.println(result);
        System.out.println(resultFinal);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
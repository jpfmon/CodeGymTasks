package com.codegym.task.task19.task1915;

/* 
Duplicate text
Read a file name from the console.
Replace the main method's System.out object with your own reader wrapper similar to the one shown in the lesson.
Your reader wrapper must output all text to both the console and a file whose name you have read.
Call testString's existing printSomething() method.
Restore the System.out variable back to the original stream.
Close the file stream.

Example of screen output:
This is text for testing

Example file content:
This is text for testing


Requirements:
1. The Solution class must contain a TestString class.
2. The Solution class must have a public static TestString field called testString that is initialized immediately.
3. The TestString class must have a public void printSomething() method.
4. The TestString class's printSomething() method must display "This is text for testing".
5. In the main(String[] args) method, the program must read file names from the console (use BufferedReader).
6. In the main(String[] args) method, the BufferedReader used for reading input from the console must be closed after use.
7. The Solution class's main(String[] args) method must create a PrintStream object (use the PrintStream constructor with a ByteArrayOutputStream parameter).
8. The Solution class's main(String[] args) method should replace and then restore the console output stream (System.out).
9. The Solution class's main(String[] args) method must call testString's printSomething() method once.
10. The Solution class's main(String[] args) method must write the output of the printSomething() method to both the console and the file (use FileOutputStream).
11. The file output stream (FileOutputStream) must be closed.
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        PrintStream original = System.out;

        ByteArrayOutputStream recipient = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(recipient);

        System.setOut(printStream);

        testString.printSomething();

        String result = recipient.toString();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        byte[] resultBytes = result.getBytes();

                fileOutputStream.write(resultBytes);
                fileOutputStream.close();

        System.setOut(original);

        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}


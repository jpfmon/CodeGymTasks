package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
Serialize the Solution class.
Think about which fields you don't need to serialize. Mark the unnecessary fields with the transient modifier.
The object must always contain up-to-date summary data.
The main method is not tested.

Write the verification code yourself in the main method:
1) create a file, open an input stream and an output stream;
2) create an instance of the Solution class (savedObject);
3) write savedObject to the output stream (make sure that they're really there);
4) create another instance of the Solution class with a different argument;
5) load an object from the input stream (loadedObject);
6) verify that savedObject.string is equal to loadedObject.string;
7) handle exceptions.


Requirements:
1. The pattern field must be marked with the transient modifier.
2. The currentDate field must be marked with the transient modifier.
3. The temperature field must be marked with the transient modifier.
4. The string field must NOT be marked with the transient modifier.
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream inputStream = new FileInputStream("serializ.data");
        FileOutputStream fileOutputStream = new FileOutputStream("serializ.data");

        Solution savedObject = new Solution(24);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        objectOutputStream.writeObject(savedObject);

        Solution solution = new Solution(6);

        Solution loaded = (Solution) objectInputStream.readObject();

        objectInputStream.close();
        objectInputStream.close();

        System.out.println("saved: " + savedObject.string);
        System.out.println("loaded: " + loaded.string);

        System.out.println("mi nueva solution: " + solution.string);

        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}

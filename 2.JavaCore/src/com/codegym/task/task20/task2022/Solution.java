package com.codegym.task.task20.task2022;

import java.io.*;

/* 
Overriding serialization in a thread
Serializing/deserializing the Solution class doesn't work.
Fix the bugs without changing method or class signatures.
The main method is not tested.

Write the verification code yourself in the main method:
1) create an instance of the Solution class
2) write data to it (writeObject)
3) serialize the Solution class (writeObject(ObjectOutputStream out))
4) deserialize, get a new object
5) write data to the new object (writeObject)
6) verify that the file contains the data from Items 2 and 5


Requirements:
1. The stream field must be declared with the transient modifier.
2. The writeObject(ObjectOutputStream out) method should not call the close method on the stream passed as an argument.
3. The readObject(ObjectInputStream in) method should not call the close method on the stream passed as an argument.
4. In the readObject(ObjectInputStream in) method, the stream field must be initialized with a new FileOutputStream object using the arguments (fileName, true).
5. In the Solution class constructor, the stream field must be initialized with a new FileOutputStream object with the argument (fileName).
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

    }
}

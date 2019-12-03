package com.codegym.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
1 Change the AmigoOutputStream class so that it wraps the FileOutputStream class. Use inheritance.
2 When the close() method is called, perform the following sequence of actions:
2.1 Call the flush() method.
2.2 Append the following text "CodeGym © All rights reserved." Use the getBytes() method.
2.3 Close the stream using the close() method.


Requirements:
1. Don't change the main method.
2. The AmigoOutputStream class must inherit the FileOutputStream class.
3. The AmigoOutputStream class's constructor should accept a FileOutputStream object.
4. All write(), flush(), and close() methods in the AmigoOutputStream class must be delegated to the FileOutputStream object.
5. The close() method must first call the flush() method, append the additional text, and then close the stream.
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.flush();
        String data = "CodeGym © All rights reserved.";
        fileOutputStream.write(data.getBytes());

        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

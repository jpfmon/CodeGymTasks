package com.codegym.task.task19.task1902;

/* 
Adapter
Use the AdapterFileOutputStream class to adapt FileOutputStream to the new AmigoStringWriter interface.


Requirements:
1. AmigoStringWriter must be an interface.
2. The AdapterFileOutputStream class must implement the AmigoStringWriter interface.
3. The AdapterFileOutputStream class must have a private FileOutputStream field called fileOutputStream.
4. The AdapterFileOutputStream class must have a constructor with a FileOutputStream parameter.
5. The AdapterFileOutputStream class's flush() method must delegate the call to fileOutputStream.
6. The AdapterFileOutputStream class's writeString(String s) method must delegate the call to fileOutputStream.
7. The AdapterFileOutputStream class's close() method must delegate the call to fileOutputStream.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }

    public static void main(String[] args) {

    }


}


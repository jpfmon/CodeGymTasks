package com.codegym.task.task18.task1812;

import java.io.*;

/* 
Extending AmigoOutputStream
Using the wrapper (decorator) design pattern, extend the functionality of AmigoOutputStream.
In the QuestionFileOutputStream class, the following functionality should be implemented for the close() method:
1. Display "Do you really want to close the stream? Y/N".
2. Read a line.
3. If the read line is "Y", then close the stream.
4. If the read line is not "Y", then don't close the stream.


Requirements:
1. Don't change AmigoOutputStream.
2. The QuestionFileOutputStream class must implement the AmigoOutputStream interface.
3. The QuestionFileOutputStream class must initialize the AmigoOutputStream field in the constructor.
4. All of QuestionFileOutputStream's methods must be delegated to the AmigoOutputStream object.
5. The close() method should ask the user, "Do you really want to close the stream? Y/N".
6. The close() method should close the stream only if it reads the answer "Y" from the console.
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you really want to close the stream? Y/N");
        String answer = "";
        answer = bufferedReader.readLine();
        if(answer.equals("Y")){
            amigoOutputStream.close();
        }

//        if(reader.readLine().equals("Y"))
//            or.close();
//        reader.close();
    }
}


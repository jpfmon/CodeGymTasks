package com.codegym.task.task19.task1917;

/* 
Your own FileWriter
Implement FileConsoleWriter's logic.
The FileConsoleWriter class must have a private clFileWriter field called fileWriter.
The FileConsoleWriter class must have every constructor used to initialize fileWriter for writing.
The FileConsoleWriter class must have five write methods and one close method:

public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len)
public void write(char[] cbuf) throws IOException
public void close() throws IOException
When writing data to a file, FileConsoleWriter must also write the data to the console.


Requirements:
1. The FileConsoleWriter class must contain a private FileWriter field called fileWriter that should not be initialized immediately.
2. The FileConsoleWriter class must have five constructors that initialize the fileWriter for writing.
3. The FileConsoleWriter class must have a write(char[] cbuf, int off, int len)
throws IOException method, which should write data to fileWriter as well as the console.
4. The FileConsoleWriter class must have a write(int c) throws IOException method, which should write data to fileWriter as well as the console.
5. The FileConsoleWriter class must have a write(String str) throws IOException method, which should write data to fileWriter as well as the console.
6. The FileConsoleWriter class must have a write(String str, int off, int len) throws IOException method, which should write data to fileWriter as well as the console.
7. The FileConsoleWriter class must have a write(char[] cbuf) throws IOException method, which should write data to fileWriter as well as the console.
8. The FileConsoleWriter class must have a close() throws IOException method, which should call the corresponding method on fileWriter.
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {

    private  FileWriter fileWriter;


    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean boo) throws IOException {
        this.fileWriter = new FileWriter(file,boo);
    }

    public FileConsoleWriter(String fileName,boolean boo) throws IOException {
        this.fileWriter = new FileWriter(fileName,boo);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        this.fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        for (int i = 0; i <len; i++) {
            System.out.print(cbuf[off + i]) ;
        }

    }
    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }
    public void write(String str) throws IOException{
        this.fileWriter.write(str);
        System.out.print(str);
    }
    public void write(String str, int off, int len)throws IOException{
        this.fileWriter.write(str, off, len);
        System.out.print(str.substring(off,off+len) );
    }
    public void write(char[] cbuf) throws IOException{
        this.fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++) {
            System.out.print( cbuf[i] );
        }

    }
    public void close() throws IOException{
        this.fileWriter.close();
    }

    public static void main(String[] args) {

    }

}

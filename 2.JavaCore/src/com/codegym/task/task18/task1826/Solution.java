package com.codegym.task.task18.task1826;

/* 
Encryption
Come up with an encryption/decryption mechanism.

The program runs with one of the following sets of arguments:
-e fileName fileOutputName
-d fileName fileOutputName

where:
fileName is the name of a file to be encrypted/decrypted.
fileOutputName is the name of the file where you need to write the result of the encryption/decryption process.
-e indicates that you need to encrypt the data.
-d indicates that you need to decrypt the data.


Requirements:
1. You don't need to read anything from the console.
2. Create an input stream for the file passed as the second argument (fileName).
3. Create an output stream for the file passed as the third argument (fileOutputName).
4. In "-e" mode, the program should encrypt fileName and write the result to fileOutputName.
5. In "-d" mode, the program should decrypt fileName and write the result to fileOutputName.
6. The file streams must be closed.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        String command = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);

        if(command.equals("-e")){
            while (fileInputStream.available()>0){
                int data = fileInputStream.read();
                int dataToWrite = data + 1;
                fileOutputStream.write(dataToWrite);
            }
        }else {
            while (fileInputStream.available()>0){
                int data = fileInputStream.read();
                int dataToWrite = data - 1;
                fileOutputStream.write(dataToWrite);
            }
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}

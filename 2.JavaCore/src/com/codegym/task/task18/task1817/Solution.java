package com.codegym.task.task18.task1817;

/* 
Spaces
The first parameter of the main method is a file name.
Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count all the characters (n1).
2. Count the spaces (n2).
3. Display n2/n1*100, rounding to 2 decimal places.
4. Close the streams.


Requirements:
1. You don't need to read anything from the console.
2. Create a stream to read from the file passed as the first argument of the main method.
3. Calculate and display the ratio of the spaces to all characters in the file.
4. The displayed value must be rounded to 2 decimal places.
5. The stream used to read the file must be closed.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        double n2 = 0.0;
        double n1 = 0.0;

        while (inputStreamReader.ready()){
            int letra = inputStreamReader.read();

            if(letra == 32){
                n2++;
                n1++;
            }else {

                n1++;
            }
        }

        inputStreamReader.close();

        double result = (n2/n1)*100;

        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println(numberFormat.format(result));

    }
}

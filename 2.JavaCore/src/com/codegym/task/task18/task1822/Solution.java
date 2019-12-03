package com.codegym.task.task18.task1822;

/* 
Finding data inside a file
Read a file name from the console.
Search the file for information related to the specified id. Display it in the format used in the file.
The program is started with one argument: id (an int).
Close the streams.

The file data is separated by spaces and stored in the following order:
id productName price quantity
where id is an int
productName is a String — it can contain spaces
price is a double
quantity is an int

The information for each product is stored on a separate line.


Requirements:
1. The program should read a file name from the console.
2. Create an input stream for the file.
3. The program should search the file and display information related to the specified id passed as the first argument.
4. The stream used to read the file must be closed.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        int id = Integer.parseInt(args[0]);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();

        reader.close();

        Scanner scanner = new Scanner( new FileInputStream(file));

//        The file data is separated by spaces and stored in the following order:
//        id productName price quantity
//        where id is an int
//        productName is a String — it can contain spaces
//        price is a double
//        quantity is an int

        int iD=0;
        String productName = "";
        double price = 0;
        int quantity = 0;
        String[] name = null;
        int size =0;

        while (scanner.hasNext()){

            String line = scanner.nextLine();

            String[] array  = line.split(" ");

            size = array.length;

            if(size<=4) {
                iD = Integer.parseInt(array[0]);
                productName = array[1];
                price = Double.parseDouble(array[2]);
                quantity = Integer.parseInt(array[3]);
            }else{
                int parts = size - 4;
                iD = Integer.parseInt(array[0]);
                int i=0;
                name = new String[parts];
                while (i<parts){
                    name[i] = array[1+i];
                    i++;
                }
                price = Double.parseDouble(array[size-2]);
                quantity = Integer.parseInt(array[size-1]);
            }

            if(iD==id){
                if(size>4){
                    String productNameAr = "";
                    for(String s:name){
                        productNameAr = productNameAr + s + " ";
                        productName = productNameAr.trim();
                    }
                    System.out.println(iD + " " + productName + " " + price + " " + quantity);
                }else{
                    System.out.println(iD + " " + productName + " " + price + " " + quantity);
                }
            }
        }

        scanner.close();
    }
}

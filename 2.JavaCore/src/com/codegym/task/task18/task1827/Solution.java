package com.codegym.task.task18.task1827;

/* 
Prices
CrUD for a table inside a file.
Read a file name for CrUD operations from the console.

The program is started with the following arguments:
-c productName price quantity

Argument values:
where id is 8 characters.
productName is 30 characters.
price is 8 characters.
quantity is 4 characters.
-c adds the product with the specified parameters to the end of the file, and generates an id by incrementing the maximum id found in the file.

The file data is stored in the following order (without separating spaces):
id productName price quantity

Each data field is padded with spaces up to its length.

Before adding a new line, re-write all of its contents to the file.

Example:
19847   Swim trunks, blue             159.00  12
198479  Swim trunks, black with printe173.00  17
19847983Snowboard jacket with reflecti10173.991234


Requirements:
1. The program should read a file name for CrUD operations from the console.
2. The Solution class should not use static variables.
3. When you run the program without arguments, the product list must remain unchanged.
4. When the program is run with the arguments "-c productName price quantity", a new line with the corresponding product should be added to the end of the file.
5. The product must have the next id after the maximum id found in the file.
6. The format of the new product line must precisely match that format specified in the task.
7. The file streams must be closed.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        String fileName = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        fileName = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<String> lines = new ArrayList<>();
        ArrayList<Integer> idsList = new ArrayList<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(fileInputStream));

//        where id is 8 characters.
//                productName is 30 characters.
//                price is 8 characters.
//                quantity is 4 characters.

        char[] bufferId = new char[8];
        char[] bufferProductName = new char[30];
        char[] bufferPrice = new char[8];
        char[] bufferQty = new char[4];

        if(args.length<1){

        }else{

            while (bufferedReader1.ready()){

                bufferedReader1.read(bufferId,0,8);
                bufferedReader1.read(bufferProductName,8,30);
                bufferedReader1.read(bufferPrice,37,8);
                bufferedReader1.read(bufferQty,45,4);

                String idp = "";
                String productNamep = "";
                String pricep = "";
                String qtyp = "";

                int idf = Integer.parseInt(bufferId.toString());
                productNamep = bufferProductName.toString();
                pricep = bufferPrice.toString();
                qtyp = bufferQty.toString();

                idsList.add(idf);
            }

            bufferedReader1.close();

            int lastId = idsList.get(idsList.size()-1);
            String newId = (lastId + 1) + "";

            char[] idToAdd = new char[8];
            char[] prodNameToAdd = new char[30];
            char[] priceToAdd = new char[8];
            char[] QtyToAdd = new char[4];

            char[] idActual = newId.toCharArray();
            char[] prodNameActual = args[1].toCharArray();
            char[] priceActual = args[2].toCharArray();
            char[] qtityActual = args[3].toCharArray();

            //creating char array for ID
            {
                int size = idActual.length;
                if (size < 8) {
                    int diff = 8 - size;

                    for (int i = 0; i < 8; i++) {
                        if (i < size) {
                            idToAdd[i] = idActual[i];
                        } else {
                            idToAdd[i] = ' ';
                        }
                    }
                }
            }
            //creating char array for productName
            {
                int size = prodNameActual.length;
                if (size < 30) {
                    int diff = 30 - size;

                    for (int i = 0; i < 30; i++) {
                        if (i < size) {
                            prodNameToAdd[i] = prodNameActual[i];
                        } else {
                            prodNameToAdd[i] = ' ';
                        }
                    }
                }
            }
            //creating char array for price
            {
                int size = priceActual.length;
                if (size < 8) {
                    int diff = 8 - size;

                    for (int i = 0; i < 8; i++) {
                        if (i < size) {
                            priceToAdd[i] = priceActual[i];
                        } else {
                            priceToAdd[i] = ' ';
                        }
                    }
                }
            }

            //creating char array for quantity
            {
                int size = priceActual.length;
                if (size < 4) {
                    int diff = 4 - size;

                    for (int i = 0; i < 4; i++) {
                        if (i < size) {
                            QtyToAdd[i] = qtityActual[i];
                        } else {
                            QtyToAdd[i] = ' ';
                        }
                    }
                }
            }

        String toWrite = "";

            for(char c:idToAdd){
                toWrite = toWrite + c;
            }

            for(char c:prodNameToAdd){
                toWrite = toWrite + c;
            }

            for(char c:priceToAdd){
                toWrite = toWrite + c;
            }

            for(char c:QtyToAdd){
                toWrite = toWrite + c;
            }




            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("temp.txt"));

            while(bufferedReader2.ready()){
                int data = bufferedReader2.read();
                bufferedOutputStream.write(data);
            }

            bufferedReader2.close();






        }

    }
}

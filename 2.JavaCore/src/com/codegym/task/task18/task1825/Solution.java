package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file
Let's build a file from various pieces.
Read file names from the console.
Each file has a name: <someName>.partN.

For example, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

The file names are supplied in random order. The word "end" is used to stop reading in file names.
In the folder where all the files are located, create a file without the "part" suffix, i.e. without ".<partN>".

For example, Lion.avi.

Use a buffer to copy all the bytes from the partial files to the created file.
Copy the first in the proper order, first the first part, then the second, ..., finally - the last part.
Close the streams.


Requirements:
1. The program must read file names from the console until the word "end" is entered.
2. Create a stream to write to the file without the "part" suffix (".<partN>") in the folder with all the "part" files.
3. Copy all the bytes from the *.partN files to the new file.
4. You should use a buffer for the reading and writing.
5. The file streams must be closed.
6. Don't use static variables.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String fileName = "";
        FileOutputStream fileOutputStream = null;

//        File nuevo = null;

        while (true){
            fileName = bufferedReader.readLine();
            if(fileName.equals("end")){
                break;
            }else{
                arrayList.add(fileName);
                //System.out.println("I entered: " + fileName);
            }
        }
        bufferedReader.close();

        String getFileName = arrayList.get(0);

        //System.out.println("Estructura de nombre: " + getFileName);

        String[] fileNameStructure = getFileName.split("\\.");

//        for(int i=0;i<fileNameStructure.length;i++){
//            System.out.println("this part is: " + fileNameStructure[i]);
//        }

        String nuevoName = fileNameStructure[0] + "." + fileNameStructure[1];

//        nuevo = new File(nuevoName);

        TreeMap<Integer,String> filesList = new TreeMap<>();

        for(String s:arrayList){
            String[] name = s.split("\\.");
            String eachFileName = name[0] + "." + name[1] + "." + name[2];
            //System.out.println("adding this file to TreeMap: " + eachFileName);
            String[] partStr = name[2].split("t");
            Integer part = Integer.parseInt(partStr[1]);
            //System.out.println("This is part number: " + part);

            filesList.put(part,eachFileName);
        }

//        for(Map.Entry d:filesList.entrySet()){
//            System.out.println("this is the order in TreeMap: " + d.getKey());
//        }

        fileOutputStream = new FileOutputStream(nuevoName);
        for(Map.Entry s:filesList.entrySet()){
            //System.out.println("Reading from: " + s.getValue());

            FileInputStream fileInputStream = new FileInputStream((String)s.getValue());

            byte[] buffer = new byte[fileInputStream.available()];
            //System.out.println("size of the buffer: " + buffer.length);

            while(fileInputStream.available()>0){
                fileInputStream.read(buffer);
                fileOutputStream.write(buffer);
                fileOutputStream.flush();

            }
            fileInputStream.close();

        }

        fileOutputStream.close();

    }
}

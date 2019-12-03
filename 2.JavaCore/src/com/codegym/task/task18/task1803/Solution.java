package com.codegym.task.task18.task1803;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Most frequent bytes
Enter a file name from the console.
Find the byte or bytes with the maximum number of repetitions.
Display them on the screen, separated by spaces.
Close the IO stream.


Requirements:
1. The program should read a file name from the console.
2. Use a FileInputStream to read from the file.
3. All of the most frequently repeated bytes from the file should be displayed, separated by spaces.
4. The screen output should be displayed in one line.
5. The stream used to read the file must be closed.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<Byte,Integer> map = new HashMap();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String fileName="";

        fileName = buffer.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        byte actual = 0;

        while(inputStream.available() > 0){

            actual = (byte) inputStream.read();

            Byte actualB = actual;

            if(map.containsKey(actualB)){
                int value = map.get(actualB);
                int newValue = value + 1;
                map.replace(actualB,newValue);
            }else{
                map.put(actualB,1);
            }
        }

        Integer max = Integer.MIN_VALUE;
        byte maxRepeated = 0;

        for(Map.Entry entry:map.entrySet()){

            if(((int)entry.getValue())>max){
                max = (Integer) entry.getValue();
            }
        }

        ArrayList<Byte> maxima = new ArrayList();

        for(Map.Entry entry:map.entrySet()){
            if(entry.getValue() == max){
                Byte meter = (Byte) entry.getKey();
                maxima.add(meter);
            }
        }

        inputStream.close();

        for(Byte bytes:maxima){

            System.out.print(bytes + " ");

        }

    }
}

package com.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        String fileName = bufferedReader.readLine();

        while (true) {

            String line = bufferedReader.readLine();
            if(line.equals("exit")){
                arrayList.add("exit");
                break;
            }else{
                arrayList.add(line);
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for(String s:arrayList){
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}

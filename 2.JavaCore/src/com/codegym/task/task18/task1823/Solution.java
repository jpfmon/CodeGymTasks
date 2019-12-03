package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes
Read file names from the console until the word "exit" is entered.
Pass the file name to the ReadThread thread.
The ReadThread thread should find the byte that occurs most frequently in the file, and add it to resultMap,
where the String parameter is the file name and the Integer parameter is the relevant byte.
Close the streams.


Requirements:
1. The program must read file names from the console until the word "exit" is entered.
2. For each file, create and start a ReadThread thread.
3. After each thread is start, ReadThread should create its own file input stream.
4. Then each thread must find the most frequently occurring byte in its file and add it to resultMap.
5. The file input stream in each thread must be closed.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        String file = "";

        while(true){
            file = reader.readLine();
            if(file.equals("exit")){
                reader.close();
                break;
            }else{
                arrayList.add(file);
            }
        }

        for(String s:arrayList){
            (new ReadThread(s)).start();
        }

    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
        Map<Integer,Integer> map;
        String fileName;

        public ReadThread(String fileName) throws FileNotFoundException {
            // Implement constructor body

            this.map = new HashMap<>();
            this.fileName = fileName;

        }
        // Implement file reading here


        @Override
        public void run() {

            try {
                this.fileInputStream = new FileInputStream(this.fileName);
                while (fileInputStream.available() > 0) {
                    int intro = fileInputStream.read();
                    if (!map.containsKey(intro)) {
                        map.put(intro, 1);
                    } else {
                        int count = map.get(intro) + 1;
                        map.replace(intro, count);
                    }
                }
                fileInputStream.close();
            }
            catch (IOException e){
            }

            int max = Integer.MIN_VALUE;
            int key = 0;

            for(Map.Entry s:map.entrySet()){
                if((int)s.getValue()>max){
                    max = (int) s.getValue();
                    key = (int) s.getKey();
                }
            }

            resultMap.put(fileName,key);

        }
    }
}

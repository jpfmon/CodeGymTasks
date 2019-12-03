package com.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Tracking changes

*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> linesFile1 = new ArrayList<>();
        ArrayList<String> linesFile2 = new ArrayList<>();


        String file1 = input.readLine();
        String file2 = input.readLine();

        input.close();

        BufferedReader bufferedReaderFile1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedReader bufferedReaderFile2 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));

        while(bufferedReaderFile1.ready()){
            String line = bufferedReaderFile1.readLine();
            linesFile1.add(line);
        }

        while(bufferedReaderFile2.ready()){
            String line = bufferedReaderFile1.readLine();
            linesFile2.add(line);
        }

        for(String s:linesFile1){
            int index =0;
            if(!(index>linesFile2.size())){
                if(!linesFile1.contains(linesFile2.get(index))){
                    lines.add(new LineItem(Type.ADDED,linesFile2.get(index)));
                    continue;
                }else if(s.equals(linesFile2.get(index))){
                    lines.add(new LineItem(Type.SAME,s));
                }
                index++;
            }

            if(!linesFile2.contains(s)){
                lines.add(new LineItem(Type.REMOVED,s));
            }
        }



    }

    public static enum Type {
        ADDED,        // New line added
        REMOVED,      // Line deleted
        SAME          // No change
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

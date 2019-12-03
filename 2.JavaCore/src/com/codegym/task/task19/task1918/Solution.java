package com.codegym.task.task19.task1918;

/* 
Introducing tags
Read from the console the name of a file containing HTML.

Example:
Info about Leela <span xml:lang="en" lang="en"><b><span>Leela Turanga
</span></b></span><span>Super</span><span>girl</span>

The main method's first parameter is a tag name. For example, "span".
Display all tags that match the specified tag.
The order should match their order in the file, each tag on a new line.
The number of spaces, newline characters (\n), or carriage returns (\r) does not affect the result.
The file does not have a CDATA tag. Each opening tag has a separate closing tag, and there are no self-closing tags.
Tags may have nested tags.

Example output:
<span xml:lang="en" lang="en"><b><span>Leela Turanga</span></b></span>
<span>Leela Turanga</span>
<span>Super</span>
<span>girl</span>

Tag templates:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1 and text2 can be empty


Requirements:
1. The program must read the file name from the console (use BufferedReader).
2. The BufferedReader used for reading input from the console must be closed after use.
3. The program must read the file's contents (use FileReader).
4. The file input stream (FileReader) must be closed.
5. The program must write to the console all the tags that match the tag specified by the argument passed to the main method.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        String argu = args[0];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        String initialTag = "<" + argu;
        String finalTag = "</" + argu + ">";

        StringBuilder sb = new StringBuilder();

        ArrayList<String> result = new ArrayList<>();

        while (fileReader.ready()){
            sb.append(fileReader.readLine());
        }

        String lines = sb.toString();

        lines = lines.replaceAll("\\n","");
        lines = lines.replaceAll("\\r","");

        String init = lines.substring(0,(argu.length()+1));

        boolean initiates = false;

        if(init.equals(initialTag)){
            initiates = true;
        }

        String[] dividing = lines.split(initialTag);

//        for(String f:dividing){
//            System.out.println("-->"+ f);
//        }

        StringBuilder toPrint = new StringBuilder();

        for(int i=0;i<dividing.length;i++){
            if(i==0 && !initiates){
                continue;
            }
            String d = dividing[i];
            if(d.isEmpty()){
                continue;
            }
            toPrint.append(initialTag);
            if(!d.contains(finalTag)){
                toPrint.append(d);
                result.add(toPrint.toString());
                toPrint = new StringBuilder();
                continue;
            }
            if(d.contains(finalTag)){
                toPrint.append(d.substring(0,d.indexOf(finalTag)+argu.length()+3));
                result.add(toPrint.toString());
                if(d.indexOf(finalTag)+argu.length()+4<d.length()){
                String c = d.substring(d.indexOf(finalTag)+argu.length()+4,d.length());
                toPrint = new StringBuilder();
                if(c.contains(finalTag)){
                    result.add(c);
                }
                }

            }
        }

        for(String d:result){
            System.out.println(d);
        }
        fileReader.close();
    }
}

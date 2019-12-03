package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String name = buffer.readLine();

        String timeS = buffer.readLine();

        int time = Integer.parseInt(timeS);

        System.out.println(name + " will take over the world in " + time + " years. Mwa-ha-ha!");
    }
}

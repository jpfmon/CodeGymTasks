package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here


        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String numberString1 = buffer.readLine();

        ArrayList<Character> up = new ArrayList();
        ArrayList<Character> down = new ArrayList();

        for (char c : numberString1.toCharArray()) {
            if (isVowel(c)) {
                up.add(c);
            } else if (Character.isWhitespace(c)) {

            } else {
                down.add(c);
            }
        }



        for(char d:up){
            System.out.print(d + " ");
        }
        System.out.println();

        for(char f:down){
            System.out.print(f + " ");
        }



    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
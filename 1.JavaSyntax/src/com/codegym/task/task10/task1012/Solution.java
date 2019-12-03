package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here
        HashMap<Character,Integer> mapa = new HashMap<>();

        for(Character d:alphabet){
            mapa.put(d,0);
        }

        for(String s: list){
            char[] array = s.toCharArray();
            for(char c:array){
                if(alphabet.contains(c)){
                    int count = mapa.get(c)+1;
                    mapa.replace(c,count);
                }
            }
        }

        for(Map.Entry<Character,Integer> entrada:mapa.entrySet()){
            System.out.println(entrada.getKey() + " " + entrada.getValue());
        }



    }

}

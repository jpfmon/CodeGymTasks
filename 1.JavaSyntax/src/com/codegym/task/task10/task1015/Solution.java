package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here

        ArrayList<String>[] lista = new ArrayList[2];

        ArrayList<String> primera = new ArrayList<>();
        primera.add("hola");
        primera.add("hola perola");

        ArrayList<String> segunda = new ArrayList<>();
        segunda.add("holita");
        segunda.add("holita perolita");

        lista[0]=primera;
        lista[1]=segunda;


        return lista;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
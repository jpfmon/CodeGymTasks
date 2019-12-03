package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here

        ArrayList<int[]> list = new ArrayList<>();

        int[] lista5 = new int[]{1,1,1,1,1};
        int[] lista2 = new int[]{1,1};
        int[] lista4 = new int[]{1,1,1,1};
        int[] lista7 = new int[]{1,1,1,1,1,1,1};
        int[] lista0 = new int[0];

        list.add(lista5);
        list.add(lista2);
        list.add(lista4);
        list.add(lista7);
        list.add(lista0);


        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

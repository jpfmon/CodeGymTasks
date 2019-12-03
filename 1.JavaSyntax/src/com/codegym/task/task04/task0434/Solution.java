package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        int i = 1;
        int j=1;
        while(i<11){

            while(j<11){
                System.out.print(i*j+ " ");
                j++;
            }
            j=1;
            System.out.println();
            i++;
        }

    }
}

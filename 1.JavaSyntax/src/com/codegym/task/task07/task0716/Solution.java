package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("measure"); // 1
        list.add("love"); // 2
        list.add("lyre"); // 2
        list.add("wade"); // 2
        list.add("bark"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here

        ArrayList<String> nueva = new ArrayList<>();

        for(String s:list){

           //System.out.println(s.contains("l")+"||" +s.contains("r"));

            if(s.contains("l") && s.contains("r")){
                nueva.add(s);
            }else if(s.contains("l") && !s.contains("r")){
                nueva.add(s);
                nueva.add(s);
            }else if(!s.contains("l") && !s.contains("r")){
                nueva.add(s);
            }
        }

        return nueva;
    }
}
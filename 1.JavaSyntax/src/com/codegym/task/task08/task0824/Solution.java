package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Human son1 = new Human("Son1", true,20,new ArrayList<Human>());
        Human son2 = new Human("Son2", true,20,new ArrayList<Human>());
        Human son3 = new Human("Son3", true,20,new ArrayList<Human>());

        ArrayList<Human> children = new ArrayList<>();
        children.add(son1);
        children.add(son2);
        children.add(son3);

        Human father = new Human("Padre", true,50,children);
        Human mother = new Human("Madre", false,50,children);

        ArrayList<Human> motherFam = new ArrayList<>();
        motherFam.add(mother);

        ArrayList<Human> fatherFam = new ArrayList<>();
        fatherFam.add(father);

        Human grandFatherOne = new Human("Juan1", true,80,fatherFam);
        Human grandFatherTwo = new Human("Juan2", true,80,motherFam);

        Human grandMotherOne = new Human("Salo1", false,80,fatherFam);
        Human grandMotherTwo = new Human("Salo2", false,80,motherFam);

        System.out.println(grandFatherOne.toString());
        System.out.println(grandFatherTwo.toString());

        System.out.println(grandMotherOne.toString());
        System.out.println(grandMotherTwo.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());

    }

    public static class Human {
        //write your code here

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }



        @Override
        public String toString() {

            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

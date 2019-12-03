package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here

        Human abuelo1 = new Human("abuelo1",true,80);
        Human abuela1 = new Human("abuela1",false,80);

        Human abuelo2 = new Human("abuelo2",true,80);
        Human abuela2 = new Human("abuela2",false,80);

        Human padre = new Human("padre",true,40,abuelo1,abuela1);
        Human madre = new Human("madre",false,35,abuelo2,abuela2);

        Human hijo1 = new Human("hijo1",true,20,padre,madre);
        Human hijo2 = new Human("hijo2",true,18,padre,madre);
        Human hijo3 = new Human("hijo3",true,15,padre,madre);


        System.out.println(abuelo1);
        System.out.println(abuelo2);

        System.out.println(abuela1);
        System.out.println(abuela2);

        System.out.println(padre);
        System.out.println(madre);

        System.out.println(hijo1);
        System.out.println(hijo2);
        System.out.println(hijo3);

    }

    public static class Human {
        // write your code here

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}
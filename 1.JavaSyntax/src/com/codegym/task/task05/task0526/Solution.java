package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name,int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        @Override
        public String toString() {
            String s = this.name + " " + this.age + " " + this.address;
            return s;
        }

    }

    public static class Woman{

        String name;
        int age;
        String address;

        public Woman(String name,int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            String s = this.name + " " + this.age + " " + this.address;
            return s;
        }
    }



    public static void main(String[] args) {
        //write your code here

        Man man1 = new Man("Juan",30,"Hola");
        Man man2 = new Man("Juan2",30,"Hola");

        Woman mujer1 = new Woman("Salo",21,"hola");
        Woman mujer2 = new Woman("Salo2",21,"hola");


        System.out.println(man1.toString());
        System.out.println(man2.toString());

        System.out.println(mujer1.toString());
        System.out.println(mujer2.toString());
    }

    //write your code here
}

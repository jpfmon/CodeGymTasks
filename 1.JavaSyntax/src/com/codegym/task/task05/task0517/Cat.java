package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here

        String name;
        int age;
        int weight;
        String address;
        String color;

        public Cat(String name){
            this.name = name;
            this.age = 1;
            this.weight = 2;
            this.color = "";
        }

    public Cat(String name,int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "";
    }

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "";
    }

    public Cat(int weight,String color){
        this.age = 2;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight,String color,String address){
        this.age = 2;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}

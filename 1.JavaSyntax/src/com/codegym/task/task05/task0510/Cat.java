package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here

    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "";
        this.address = null;
    }

    public void initialize(String name,int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "";
        this.address = null;
    }

    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "";
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.name = null;
        this.age = 2;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color,String address){
        this.name = null;
        this.age = 2;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}

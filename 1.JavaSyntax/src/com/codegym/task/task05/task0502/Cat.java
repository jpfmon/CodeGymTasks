package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age=age;
        this.weight=weight;
        this.strength=strength;
    }

    public boolean fight(Cat anotherCat) {
        //write your code here

        boolean thisWins;

//        if(this.strength < anotherCat.strength){
//            thisWins = false;
//        }else if(this.strength > anotherCat.strength){
//            thisWins = true;
//        }else if(this.strength==anotherCat.strength){
//            if(this.weight>anotherCat.weight){
//                thisWins = true;
//            }else if(this.weight<anotherCat.weight){
//                thisWins=false;
//            }else if(this.weight==anotherCat.weight){
//                if(this.age<anotherCat.age){
//                    thisWins=true;
//                }else if(this.age>anotherCat.age){
//                    thisWins=false;
//                }
//            }
//        }

        int sum1 = this.age + this.weight + this.strength;
        int sum2 = anotherCat.age + anotherCat.weight + anotherCat.strength;

        if(sum1<sum2){
            thisWins=false;
        }else if(sum1>sum2){
            thisWins=true;
        }else{
            thisWins=true;
        }

        return thisWins;

    }

    public static void main(String[] args) {

        Cat cat1 = new Cat(2,2,2);
        Cat cat2 = new Cat(2,2,2);

        System.out.println("Cat 1 fights cat2. Cat1 wins?: " + cat1.fight(cat2));

        System.out.println("Cat 2 fights cat1. Cat2 wins?(should win Cat1): " + cat2.fight(cat1));

    }
}

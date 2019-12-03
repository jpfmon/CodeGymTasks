package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
We're almost done with the Hippodrome class.
Add a call to run() at the end of the main method.

Hint:
The run() method is not static, so you can only call it on an object.
But where do you get the object?

Hint 2:
game.run();


Requirements:
1. The main method must call the run method on a Hippodrome object.
*/

public class Hippodrome {

    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {


        game = new Hippodrome(new ArrayList<>(Arrays.asList(new Horse("Juan",3.0,0.0),
                new Horse("Salo",3.0,0.0),new Horse("Fatima",3.0,0.0))));

        game.run();
        game.printWinner();


    }

    public List<Horse> getHorses() {
        return horses;
    }



    public void run() throws InterruptedException {
        for(int i=1;i<=100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){

        for(Horse h:horses){
            h.move();
        }
    }
    public void print(){

        for(Horse h:horses){
            h.print();
        }

        for(int i=1;i<=10;i++){
            System.out.println();
        }
    }

    public Horse getWinner(){

        double maxDistance = Double.MIN_VALUE;
        int index = 0;
        int i = 0;
        for(Horse h:horses){
            if(h.getDistance()>maxDistance){
                maxDistance = h.getDistance();
                index = i;
            }
            i++;
        }
        return horses.get(index);
    }
    public void printWinner(){

        System.out.println("The winner is " + getWinner().getName() + "!");
    }


}

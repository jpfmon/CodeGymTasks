package com.codegym.task.task21.task2113;


/*
There's just a little left to do: finish writing the Horse class.
        The move method is called each time a horse takes a step.
        When the move method is called on a horse, the horse must run a certain distance.
        The distance depends on the horse's speed. In its simplest form, this method would look something like this:
        distance += speed;

        But to make it more interesting, let's make the speed change a little bit all the time.
        To achieve this, multiply the speed by a random number.
        A random number can be obtained using the Math.random() method.


        Requirements:
        1. In the Horse class's move method, the value of the distance field must increase by the distance traveled in one "step"
        (value of the speed field) multiplied by a random number between zero and one obtained using the Math.random() method.

        */

public class Horse {

    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {

        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move(){
        distance += speed*Math.random()*1;
    }
    public void print(){

        int times = (int) distance;

        for(int i=1;i<=times;i++){
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println();

    }
}

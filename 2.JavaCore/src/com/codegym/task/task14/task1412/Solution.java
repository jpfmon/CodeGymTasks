package com.codegym.task.task14.task1412;

/* 
Implement the printMainInfo method
1. Write an implementation of the printMainInfo method:
1.1. If a Drawable object is passed to the method, call the draw method on the object.
1.2. If a Movable object is passed to the method, call the move method on the object.


Requirements:
1. The Solution class must implement a printMainInfo method with one Object parameter.
2. The printMainInfo method must be static.
3. The printMainInfo method must have the widest level of access (public).
4. The printMainInfo method must call the draw method on the passed object if the object implements the Drawable interface.
5. The printMainInfo method must call the move method on the passed object if the object implements the Movable interface.
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //write your code here

        if(object instanceof Drawable){
            ((Drawable) object).draw();
        }else if(object instanceof Movable){
            ((Movable) object).move();
        }
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}

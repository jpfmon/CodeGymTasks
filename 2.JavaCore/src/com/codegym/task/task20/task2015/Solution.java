package com.codegym.task.task20.task2015;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 
Overriding serialization
Make it so that the runner thread continues to run after deserialization.
Don't change the runner object's keywords.

Hint:
The constructor is not called during deserialization. Only all the fields are initialized.


Requirements:
1. The Solution class should support the Serializable interface.
2. The Solution class should support the Runnable interface.
3. The Solution class's runner field must be declared with the transient modifier.
4. The readObject method must create a new Thread object with the current object as an argument.
5. The readObject method must call the start method on the new Thread object.
*/
public class Solution implements Serializable,Runnable{
    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread();
        runner.start();
    }

    public void run() {
        // Do something here, doesn't matter what.
    }

    /**
     Override serialization.
     To do this, you need to declare the following methods:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Now serialization/deserialization will work for our scenario :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Thread th = new Thread((Runnable) this);
        th.start();
    }

    public static void main(String[] args) {

    }
}

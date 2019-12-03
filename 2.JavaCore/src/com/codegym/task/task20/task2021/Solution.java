package com.codegym.task.task20.task2021;

import java.io.*;

/* 
Serialization is prohibited
Block serialization of the SubSolution class using the NotSerializableException.
Don't change the method signatures.


Requirements:
1. The Solution class should support the Serializable interface.
2. The SubSolution class must be inside the Solution class.
3. The SubSolution class must be a descendant of the Solution class.
4. A NotSerializableException should occur when trying to serialize a SubSolution object.
5. A NotSerializableException should occur when trying to deserialize a SubSolution object.
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {

        private void readObject(ObjectInputStream ois) throws NotSerializableException {

            throw new NotSerializableException();

        }

        private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}

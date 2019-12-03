package com.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;

/* 
Deserialization
Serialized A or B objects are written to the stream that is passed in.
Deserialize the object in the getOriginalObject method. If an exception occurs, display a message and return null.
Implement the Serializable interface where necessary.


Requirements:
1. The B class must be a descendant of the A class.
2. The A class should support the Serializable interface.
3. The B class should not explicitly support the Serializable interface.
4. The getOriginalObject method must return the A object received from the ObjectInputStream.
5. The getOriginalObject method must return null if an A object is not received during deserialization attempts.
6. The getOriginalObject method must return null if an exception is thrown when trying to deserialize.
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException{

        try{
         Object object = objectStream.readObject();
             if(object instanceof A){
                 return (A) object;
             }else {
                 return null;
             }
        }catch (Exception e){
            A object = null;
            return object;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}

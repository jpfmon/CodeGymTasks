package com.codegym.task.task20.task2008;

import java.io.*;

/* 
How do you serialize Singleton?
Two deserialized objects (singleton1 and singleton2) have different memory references, but they should be the same.
In the Singleton class, add a method so that after deserialization the object references are the same (Google it).
The main method is not tested.


Requirements:
1. The Solution.Singleton class should support the Serializable interface.
2. The Solution.Singleton class must implement a readResolve method without parameters.
3. The readResolve method should return a singleton (ourInstance).
4. The readResolve method must be private.
5. The Solution class must have a public static serializeSingletonInstance method.
6. After deserialization, the object references must be equal.
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton = deserializeSingletonInstance(byteArrayOutputStream);
        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);

        System.out.println("Check ourInstance: " + singleton.getInstance());
        System.out.println("Check ourInstance: " + singleton1.getInstance());
        System.out.println("=========================================================");
        System.out.println("Check singleton: " + singleton);
        System.out.println("Check singleton1: " + singleton1);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(instance);
        oos.close();

        return byteArrayOutputStream;
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();

        return singleton;
    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }
//        private Object readResolve() {
//            return getInstance();
//        }

        private Singleton() {
        }
    }
}

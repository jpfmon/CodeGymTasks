package com.codegym.task.task20.task2018;

import java.io.*;

/* 
Find the bugs
For some reason, errors are occurring when serializing/deserializing B objects.

Find the problem and fix it.

The A class should not implement the Serializable and Externalizable interfaces.

There is no error in the B class's signature :).

There are no errors in the main method.


Requirements:
1. The B class must be a descendant of the A class.
2. The B class should support the Serializable interface.
3. The A class should not support the Serializable interface.
4. The A class should not support the Externalizable interface.
5. The program must execute without errors.
6. When deserializing, the value of the nameA and nameB fields should be correctly restored.
*/
public class Solution implements Serializable {
    public static class A {

        protected String nameA = "A";

        public A() {
        }

        public A(String nameA) {

            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        private void readObject(ObjectInputStream ois) throws Exception{
            ois.defaultReadObject();
            // return ois.readObject();
            this.nameA = (String)ois.readObject();
            this.nameB = (String)ois.readObject();
        }


        private void writeObject(ObjectOutputStream oos) throws IOException {
            oos.defaultWriteObject();
            oos.writeObject(this.nameB);
            oos.writeObject(this.nameA);
        }


    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B)ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}

package com.codegym.task.task20.task2011;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
Externalizable for apartments
Implement the Externalizable interface in the Apartment class.


Requirements:
1. The Solution.Apartment class should support the Externalizable interface.
2. The Solution.Apartment class must implement a writeExternal method with one ObjectOutput parameter.
3. The Solution.Apartment class must implement a readExternal method with one ObjectInput parameter.
4. The writeExternal method must call the writeObject method with the address parameter on the ObjectOutput object passed as an argument.
5. The writeExternal method must call the writeInt method with the year parameter on the ObjectOutput object passed as an argument.
6. The readExternal method should correctly restore the value of the address field from the ObjectInput object.
7. The readExternal method should correctly restore the value of the year field from the ObjectInput object.
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) {

    }
}

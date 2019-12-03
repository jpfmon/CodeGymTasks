package com.codegym.task.task20.task2020;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Logger;

/* 
Serializing people
Serialize the Person class in the standard way. Add the transient modifier to some fields, if necessary.


Requirements:
1. The Person class should support the Serializable interface.
2. The fullName field must be marked with the transient modifier.
3. The greetingString field must be marked with the transient modifier.
4. The outputStream field must be marked with the transient modifier.
5. The logger field must be marked with the transient modifier.
6. The firstName field must NOT be marked with the transient modifier.
7. The lastName field must NOT be marked with the transient modifier.
8. The country field must NOT be marked with the transient modifier.
9. The sex field must NOT be marked with the transient modifier.
*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task14.task1403;

/* 
Building and School
1. Create the correct inheritance relationship between Building and School.
2. Think about which type of object the getSchool and getBuilding methods should return.
3. Change null to a Building or School object.

P.S. Don't change the signatures of the getSchool and getBuilding methods.


Requirements:
1. The School class should inherit the Building class.
2. The getSchool method must return a new School.
3. The getBuilding method must return a new Building.
4. The School class must be static.
5. The Building class must be static.
*/

import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //write your code here+

        return new School();
    }

    public static Building getBuilding() {
        //write your code here
        return new Building();
    }

    static class School extends Building/*write your code here*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*write your code here*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}

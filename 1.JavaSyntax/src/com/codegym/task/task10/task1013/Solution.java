package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private int age;
        private int height;
        private String name;
        private boolean isMan;
        private String nationality;
        private boolean isWorking;

        public Human() {
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age, int height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }

        public Human(int age, int height, String name, boolean isMan) {
            this.age = age;
            this.height = height;
            this.name = name;
            this.isMan = isMan;
        }

        public Human(int age, int height, String name, boolean isMan, String nationality) {
            this.age = age;
            this.height = height;
            this.name = name;
            this.isMan = isMan;
            this.nationality = nationality;
        }

        public Human(int age, int height, String name, boolean isMan, String nationality, boolean isWorking) {
            this.age = age;
            this.height = height;
            this.name = name;
            this.isMan = isMan;
            this.nationality = nationality;
            this.isWorking = isWorking;
        }

        public Human(int height, String name, boolean isMan, String nationality, boolean isWorking) {
            this.height = height;
            this.name = name;
            this.isMan = isMan;
            this.nationality = nationality;
            this.isWorking = isWorking;
        }

        public Human(boolean isMan, String nationality, boolean isWorking) {

            this.isMan = isMan;
            this.nationality = nationality;
            this.isWorking = isWorking;
        }

        public Human(int age, boolean isMan, String nationality) {
            this.age = age;
            this.isMan = isMan;
            this.nationality = nationality;
        }
    }
}

package com.codegym.task.task20.task2023;

/* 
Making the right conclusion
Arrange calls to the superclass's methods and access modifiers to achieve the following screen output:

C class, method2
A class, method2
A class, method1
B class, method1

1. Only one of the superclass's methods can be called from each method.
2. Only one of the class's methods can be called from each method.
3. The methods' access modifiers can be changed.


Requirements:
1. The screen output must match the task conditions.
2. The method1 method must be declared with the private access modifier in the A class.
3. The method1 method in the B class must call super.method2().
4. The method2 method in the C class must call super.method1().
5. The method2 method in the A class must call method1().
*/
public class Solution {
    public static void main(String[] s) {
        A a = new C();
        a.method2();
    }

    public static class A {
        private void method1() {
            System.out.println("A class, method1");
        }

        public void method2() {
            System.out.println("A class, method2");
            method1();

        }
    }

    public static class B extends A {
        public void method1() {

            super.method2();
            System.out.println("B class, method1");

        }

        public void method2() {
            System.out.println("B class, method2");
        }
    }

    public static class C extends B {
        public void method1() {

            System.out.println("C class, method1");
        }

        public void method2() {

            System.out.println("C class, method2");
            //super.method1();
        }
    }
}

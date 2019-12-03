package com.codegym.task.task18.task1811;

/* 
Wrapper (Decorator)
Figure out what the program does.
By analogy with the DecoratorRunnableImpl class, create a DecoratorMyRunnableImpl class.


Requirements:
1. Create a class called DecoratorMyRunnableImpl, similar to DecoratorRunnableImpl.
2. After the program is started, each class should display "<class name> body".
3. Don't change the RunnableImpl and DecoratorRunnableImpl classes.
4. Don't change the main method.
*/

public class Solution {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.print("DecoratorRunnableImpl body ");
            component.run();
        }
    }

    public static class DecoratorMyRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorMyRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.print("DecoratorMyRunnableImpl body ");
            component.run();
        }
    }


}

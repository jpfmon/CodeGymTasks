package com.codegym.task.task12.task1233;

/* 
The isomorphs are coming
Write a method that returns the minimum of an array and its position (index).


Requirements:
1. The Solution class must have a Pair class.
2. The Solution class must have two methods.
3. The Solution class must have a getMinimumAndIndex() method.
4. The getMinimumAndIndex() method must return the minimum of the array and its position (index).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //write your code here





        return new Pair<Integer, Integer>(0, 0);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

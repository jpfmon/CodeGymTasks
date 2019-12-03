package com.codegym.task.task20.task2026;

/* 
Rectangle algorithms
1. Here we have a two-dimensional N*N array that contains several rectangles.
2. The various rectangles do not touch or overlap.
3. The interior of each rectangle is filled with 1s.
4. The array values have the following meaning:
4.1) a[i, j] = 1 if element (i, j) belongs to a rectangle
4.2) a[i, j] = 0, otherwise
5. getRectangleCount must return the number of rectangles.
6. The main method is not tested


Requirements:
1. The Solution class must have a getRectangleCount method with one byte[][] parameter.
2. The getRectangleCount method must be public.
3. The getRectangleCount method must be static.
4. The getRectangleCount method must return the number of rectangles found in the passed array (in accordance with the task).
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Must be 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Must be 4");
    }

    public static int getRectangleCount(byte[][] a) {
        return 0;
    }
}

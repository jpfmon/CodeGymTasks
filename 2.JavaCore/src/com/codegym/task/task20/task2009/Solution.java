package com.codegym.task.task20.task2009;

import java.io.Serializable;

/*
How do you serialize static fields?
Make it so that the ClassWithStatic class can be serialized.


Requirements:
1. The ClassWithStatic class must be inside the Solution class.
2. The ClassWithStatic class must be static.
3. The ClassWithStatic class must be public.
4. The ClassWithStatic class should support the Serializable interface.
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}

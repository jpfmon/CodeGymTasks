package com.codegym.task.task20.task2006;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
How do you serialize?
Make it so that the Human class can be serialized.


Requirements:
1. The Human class must be inside the Solution class.
2. The Human class must be static.
3. The Human class must be public.
4. The Human class should support the Serializable interface.
*/
public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) {

    }
}

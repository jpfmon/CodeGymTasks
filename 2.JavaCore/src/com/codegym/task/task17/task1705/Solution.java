package com.codegym.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Time in the garden
1. Create a public void addFruit(int index, String fruit) method that
adds the fruit parameter to the fruits list at position index.
2. Create a public void removeFruit(int index) method that removes
the element at position index from fruits.
3. Create a public void addVegetable(int index, String vegetable)
method that adds the vegetable parameter to the vegetables list at position index.
4. Create a public void removeVegetable(int index) method that removes
the element at position index from vegetables.
5. The Garden class will be used by threads. So be sure that all the methods lock this.
6. Implement this with as little code as possible.


Requirements:
1. The Garden class must contain a public void addFruit(int index, String fruit) method.
2. The Garden class must contain a public void removeFruit(int index) method.
3. The Garden class must contain a public void addVegetable(int index, String vegetable) method.
4. The Garden class must contain a public void removeVegetable(int index) method.
5. The addFruit(int index, String fruit) method must add the fruit parameter to the fruits list at position index.
6. The removeFruit(int index) method must remove the element at position index from fruits.
7. The addVegetable(int index, String vegetable) method should add the vegetable parameter to the vegetables list at position index.
8. The removeVegetable(int index) method must remove the element at position index from vegetables.
9. All of the Garden class's methods must lock this (i.e. they must be synchronized).
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();



        public synchronized void addFruit(int index, String fruit){

            fruits.add(index,fruit);
        }

        public synchronized void removeFruit(int index){
            fruits.remove(index);
        }

        public synchronized void addVegetable(int index, String vegetable){
            vegetables.add(index,vegetable);
        }
        public synchronized void removeVegetable(int index){
            vegetables.remove(index);
        }
    }
}

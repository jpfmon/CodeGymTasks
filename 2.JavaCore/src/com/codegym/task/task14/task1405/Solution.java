package com.codegym.task.task14.task1405;

/* 
Food
1. Implement the Selectable interface in the Food class.
2. The onSelect() method should display "The food was selected".
3. Think which methods can be called with the variable food and which with the variable selectable.
4. In the foodMethods method, call the onSelect and onEat methods, if possible.
5. In the selectableMethods method, call the onSelect and onEat methods, if possible.
6. Don't use an explicit type conversion.


Requirements:
1. The Selectable interface must be implemented in the Food class.
2. The onSelect() method in the Food class should display "The food was selected".
3. In the foodMethods method, you need to call methods on a Food object.
4. In the selectableMethods method, you need to call methods accessible from any object that implements the Selectable interface.
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //write your code here
        food.onSelect();
        food.onEat();
    }

    public static void selectableMethods(Selectable selectable) {
        //write your code here
        selectable.onSelect();

    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }

        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}

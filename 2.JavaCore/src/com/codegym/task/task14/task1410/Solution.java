package com.codegym.task.task14.task1410;

/* 
Wine tasting
1. Create an abstract Drink class with an implemented public void taste() method that displays "Delicious".
2. Create a Wine class that inherits Drink and implements a public String getCelebrationName() method that returns "Birthday".
3. Create a BubblyWine class that inherits Wine and implements a public String getCelebrationName() method that returns "New Year's".
4. Write implementations for the getDeliciousDrink, getWine, and getBubblyWine methods.
5. All the classes must be in separate files.


Requirements:
1. The abstract Drink class must be in a separate file.
2. The Drink class must implement a public void taste() method that displays "Delicious".
3. The Wine class must be in a separate file and be a descendant of the Drink class.
4. The Wine class must implement a public String getCelebrationName() method that returns "Birthday".
5. The BubblyWine class must be in a separate file and be a descendant of the Wine class.
6. The BubblyWine class must implement a public String getCelebrationName() method that returns "New Year's".
7. The Solution class must implement the getDeliciousDrink() method, which returns a Wine object.
8. The Solution class must implement the getWine() method, which returns a Wine object.
9. The Solution class must implement the getBubblyWine() method, which returns a BubblyWine object.
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getBubblyWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}

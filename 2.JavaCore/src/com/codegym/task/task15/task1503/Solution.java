package com.codegym.task.task15.task1503;

/* 
OOP: Cars
1. Only use variables from the Constants class in your output.
2. In the Ferrari class, implement the printlnDesire method so that it displays "I want to drive a Ferrari".
3. In the GeoMetro class, implement the printlnDesire method so that it displays "I want to drive a Geo Metro".
4. Create a public static LuxuryCar class.
5. Create a public static CheapCar class.
6. Make the Ferrari and GeoMetro classes inherit CheapCar or LuxuryCar. Think about which class would be appropriate for each of them.
7. In the LuxuryCar class, implement the printlnDesire method so that it displays "I want to drive a luxury car".
8. In the CheapCar class, implement the printlnDesire method so that it displays "I want to drive a cheap car".
9. In the LuxuryCar and CheapCar classes, set different access modifier for the printlnDesire method so that the visibility is expanded in the Ferrari and GeoMetro classes.


Requirements:
1. The Solution class must contain the public static LuxuryCar class.
2. The Solution class must contain the public static CheapCar class.
3. The Ferrari class must be a descendant of the LuxuryCar class.
4. The GeoMetro class must be a descendant of the CheapCar class.
5. The printlnDesire method in the LuxuryCar class should display "I want to drive a luxury car".
6. The printlnDesire method in the CheapCar class should display "I want to drive a cheap car".
7. The printlnDesire method in the Ferrari class should display "I want to drive a Ferrari".
8. The printlnDesire method in the GeoMetro class should display "I want to drive a Geo Metro".
9. The visibility of the printlnDesire methods in the Ferrari and GeoMetro classes should be wider than in their parent classes.
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    public static class Ferrari extends LuxuryCar{
        @Override
        public void printlnDesire() {
            //write your code here
            System.out.println(Constants.WANT_STRING+Constants.FERRARI_NAME);

        }
    }

    public static class GeoMetro extends CheapCar{
        @Override
        public void printlnDesire() {
            //write your code here

            System.out.println(Constants.WANT_STRING+Constants.GEO_METRO_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "I want to drive ";
        public static String LUXURY_CAR = "a luxury car";
        public static String CHEAP_CAR = "a cheap car";
        public static String FERRARI_NAME = "a Ferrari";
        public static String GEO_METRO_NAME = "a Geo Metro";
    }

    public static class LuxuryCar{

        protected  void printlnDesire(){
            System.out.println(Constants.WANT_STRING+Constants.LUXURY_CAR);
        }
    }

    public static class CheapCar{

        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING+Constants.CHEAP_CAR);
        }
    }
}

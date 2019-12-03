package com.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Janitorial services
1. Implement the cleanAllApartments method.
For each object in apartments:
2. For one-bedroom apartments (OneRoomApt), call the clean1Room method.
i.e. if an OneRoomApt object is passed, then call its clean1Room method.
3. For two-bedroom apartments (TwoRoomApt), call the clean2Rooms method
i.e. if an TwoRoomApt object is passed, then call its clean2Rooms method.
4. For three-bedroom apartments (ThreeRoomApt), call the clean3Rooms method
i.e. if an ThreeRoomApt object is passed, then call its clean3Rooms method.


Requirements:
1. The cleanAllApartments method must take a list of apartments as an argument.
2. For all one-bedroom apartments (OneRoomApt) in the list, the cleanAllApartments method must call the clean1Room method.
3. For all two-bedroom apartments (TwoRoomApt) in the list, the cleanAllApartments method must call the clean2Rooms method.
4. For all three-bedroom apartments (ThreeRoomApt) in the list, the cleanAllApartments method must call the clean3Rooms method.
5. The OneRoomApt, TwoRoomApt, and ThreeRoomApt classes should support (implement) the Apartment interface.
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Write your implementation of Items 1-4 here

        for(Apartment ap:apartments){
            if(ap instanceof OneRoomApt){
                ((OneRoomApt) ap).clean1Room();
            }else if( ap instanceof TwoRoomApt){
                ((TwoRoomApt) ap).clean2Rooms();
            }else if (ap instanceof ThreeRoomApt){
                ((ThreeRoomApt) ap).clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room has been cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms have been cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms have been cleaned");
        }
    }
}

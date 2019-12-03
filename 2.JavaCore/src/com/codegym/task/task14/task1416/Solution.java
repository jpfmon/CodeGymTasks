package com.codegym.task.task14.task1416;

/* 
Fixing bugs
1. Think about how CanSwim and CanWalk interfaces relate to the SeaCreature class.
2. Create the correct inheritance relationship between the interfaces and the SeaCreature class.
3. Think about how the Orca, Whale, and RiverOtter classes might relate to the SeaCreature class.
4. Create the correct inheritance relationship between the Orca, Whale, and RiverOtter classes and the SeaCreature class.
5. Think about which class should implement the CanWalk interface and add the interface to this class.
6. Think about which animal isn't yet able to swim and add the CanSwim interface to it.


Requirements:
1. An orca is a sea creature (descendant of SeaCreature) and can swim (supports the CanSwim interface).
2. A whale is a sea creature (descendant of SeaCreature) and can swim (supports the CanSwim interface).
3. The RiverOtter can walk (supports the CanWalk interface) and swim (supports the CanSwim interface).
4. A river otter is NOT a sea creature (descendant of SeaCreature).
5. Whales and orcas do NOT know how to walk (do not support the CanWalk interface).
*/

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim{
        @Override
        CanSwim getCurrentCreature() {
            return null;
        }
    }

    static class Whale extends SeaCreature implements CanSwim {
        @Override
        CanSwim getCurrentCreature() {
            return null;
        }
    }

    static class RiverOtter implements CanSwim,CanWalk{
        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}

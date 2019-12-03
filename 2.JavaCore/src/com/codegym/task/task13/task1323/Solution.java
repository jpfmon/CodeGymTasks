package com.codegym.task.task13.task1323;

/* 
Updatable interface in the Screen class
Make the Screen class implement the Updatable interface.


Requirements:
1. The Updatable interface must inherit the Selectable interface (use extends).
2. The Screen class must implement the Updatable interface.
3. The Selectable interface's onSelect method must be implemented in the Screen class.
4. The Updatable interface's refresh method must be implemented in the Screen class.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}

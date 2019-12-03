package com.codegym.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Synchronized notes: part 2
The Note class will be used by threads. So be sure to synchronize all methods.

Requirements:
1. The addNote() method should add notes to the notes list.
2. The removeNote() method must delete a note from the notes list.
3. The addNote() method must be synchronized.
4. The removeNote() method must be synchronized.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public synchronized void addNote(int index, String note) {
            System.out.println("A note [" + note + "] will now be added at position " + index);
            notes.add(index, note);
            System.out.println("The note [" + note + "] has already been added");
        }

        public synchronized void removeNote(int index) {
            System.out.println("A note will now be deleted from position " + index);
            String note = notes.remove(index);
            System.out.println("The note [" + note + "] has already been deleted from position " + index);
        }
    }
}
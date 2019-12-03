package com.codegym.task.task17.task1708;

import java.util.ArrayList;
import java.util.List;

/* 
Notes for all
The Note class will be used by threads.
Consequently, you need to be sure that the notes list is in shared memory, i.e. that it will not be cached by threads in their local memory.


Requirements:
1. The Note class must have an addNote(int index, String note) method.
2. The Note class must have a removeNote(int index) method.
3. The Note class must have a public List<String> notes.
4. The List<String> notes field should not be stored in the local cache.

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public volatile List<String> notes = new ArrayList<>();

        public void addNote(int index, String note) {
            System.out.println("A note [" + note + "] will now be added at position " + index);
            notes.add(index, note);
            System.out.println("The note [" + note + "] has already been added");
        }

        public void removeNote(int index) {
            System.out.println("A note will now be deleted from position " + index);
            String note = notes.remove(index);
            System.out.println("The note [" + note + "] has already been deleted from position " + index);
        }
    }
}

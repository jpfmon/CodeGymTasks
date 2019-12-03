package com.codegym.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Synchronized notes
1. The Note class will be used by threads. So be sure that attempts
to access the notes list lock notes, not this
2. Calls to System.out.println must not be synchronized, i.e.
must not be in the synchronized block


Requirements:
1. The addNote() method should add notes to the notes list.
2. The removeNote() method must delete a note from the notes list.
3. The addNote() method must have a synchronized block.
4. The removeNote() method must have a synchronized block.
5. The synchronized block in the addNote() method must lock notes.
6. The synchronized block in the removeNote() method must lock notes.
7. The addNote() method's synchronized block must call the add method on notes.
8. The removeNote() method's synchronized block must call the remove method on notes.
9. No screen output commands should be in the synchronized block.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public  void addNote(int index, String note) {
            System.out.println("A note [" + note + "] will now be added at position " + index);
            synchronized(notes) {
                notes.add(index, note);
            }
            System.out.println("The note [" + note + "] has already been added");
        }

        public  void removeNote(int index) {
            System.out.println("A note will now be deleted from position " + index);
            String note;
            synchronized(notes) {
                 note = notes.remove(index);
            }
            System.out.println("The note [" + note + "] has already been deleted from position " + index);
        }
    }

}

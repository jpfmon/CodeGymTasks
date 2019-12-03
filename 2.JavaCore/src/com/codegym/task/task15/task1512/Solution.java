package com.codegym.task.task15.task1512;

/* 
The simplest code: part 2
Take a look at what constructor-related stuff may be added during compilation,
but is already present in this program.
Simplify the code. Remove all constructors and calls of superclasses' constructors
that are created and added automatically.

PS: The NakedCat, NormalCat, and SiamCat classes have an is-a (inheritance)
relationship: http://en.wikipedia.org/wiki/Is-a


Requirements:
1. The NormalCat class must be a descendant of the NakedCat class.
2. The SiamCat class must be a descendant of the NormalCat class.
3. Simplify the code in the NakedCat class.
4. Simplify the code in the NormalCat class.
*/

public class Solution {
    public static void main(String[] args) {
        SiamCat coco = new SiamCat("Coco");
        NakedCat nakedCoco = coco.shave();
    }

    public static class NakedCat {

    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}

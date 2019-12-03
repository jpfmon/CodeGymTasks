package com.codegym.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
In the Solution class, fix the equals/hashCode methods according to the implementation rules for these methods
(use your favorite search engine to check the details).
Both the first and last strings should be involved in the equals method's comparison and the calculation of the hashcode.
The main method is not tested.


Requirements:
1. The hashcodes of identical objects must be equal.
2. The equals method should check whether the passed object is equal to the current object (comparison using ==).
3. The equals method should check whether the passed object is a Solution object.
4. The equals method must return true if the first and last fields are equal to the passed object and the current one (don't forget that they might be null).
5. You must ensure that the HashSet of Solution elements behaves correctly.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Solution n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

package com.codegym.task.task15.task1511;

import java.io.Serializable;

/* 
The simplest code: part 1
Simplify the code: remove all inheritance and implementations that will be added automatically by the compiler
PS: The me and zapp objects have a has-a relationship: https://en.wikipedia.org/wiki/Has-a


Requirements:
1. The SpecificSerializable interface should extend the Serializable interface.
2. The JavaDev class must implement the SpecificSerializable interface.
3. The code should not have explicit inheritance involving the Object class (extends Object).
4. The JuniorJavaDev class should not explicitly inherit the SpecificSerializable interface.

*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about com.codegym.task.task15.task1511?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev  implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of %s", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}

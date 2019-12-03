package com.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Turnip
The Gigantic Turnip:
1. Make the Person class implement the TurnipItem interface.
2. Implement the pull(Person person) method in the Person class so that it displays a phrase like '<name> behind <person>'.

Example:
Grandma behind Grandpa
Grandpa behind Turnip

3. Fix the bug in the logic of the loop in the TurnipStory class's tell method.
4. Run the main method and enjoy the story!


Requirements:
1. The Person class must implement the TurnipItem interface.
2. The Person class must have a pull method with one Person parameter.
3. The Person class's pull method must display a phrase like '<name> behind <person>'.
For example: Grandma behind Grandpa.
4. The main method should display a condensed version of The Gigantic Turnip on the screen.
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Turnip"));
        plot.add(new Person("Grandpa"));
        plot.add(new Person("Grandma"));
        plot.add(new Person("Granddaughter"));
        TurnipStory.tell(plot);
    }
}

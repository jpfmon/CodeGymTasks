package com.codegym.task.task14.task1413;

/* 
Computer
1. Create the CompItem interface.
2. Add a String getName() method to it.
3. Create Keyboard, Mouse, and Monitor classes that implement the CompItem interface.
4. The getName() method must return the class name. For example, it will return "Keyboard" for the Keyboard class.
5. Create the Computer class.
6. Add a private Keyboard field keyboard to the Computer class.
7. Add a private Mouse field mouse to the Computer class.
8. Add a private Monitor field monitor to the Computer class.
9. Use the Alt+Insert key combination (Constructor command) to create a Computer class constructor with three parameters.
10. Inside the constructor, use the parameters to initialize all three of the class's fields (variables).
11. Create getters for the fields in the Computer (in the class, use the Alt+Insert key combination and select the Getter command).
12. Each class and interface should be in a separate file.


Requirements:
1. The CompItem interface must be in a separate file.
2. The CompItem interface must define a getName() method that returns a String and has no parameters.
3. The Keyboard, Monitor, and Mouse classes must implement the CompItem interface, and be located in separate files.
4. The getName method in classes implementing the CompItem interface should return a simple class name, e.g. "Keyboard" for the Keyboard class.
5. The Computer class must be in a separate file and have one private field of each of the following types: Keyboard, Mouse, and Monitor.
6. The Computer class constructor should have 3 parameters (keyboard, mouse, monitor) and correctly initialize the corresponding fields of the class.
7. For the Computer class's fields keyboard, mouse, and monitor, you need to create getters (getKeyboard, getMouse, getMonitor)
that return the corresponding fields of the Computer class.
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}

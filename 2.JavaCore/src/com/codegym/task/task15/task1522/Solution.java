package com.codegym.task.task15.task1522;

import java.io.*;

/* 
Reinforce the singleton pattern
1. Find an example of the singleton pattern used for lazy initialization. Use your favorite search engine (such as Google).
2. In separate files, create three singleton classes in its likeness and image: Sun, Moon, and Earth.
3. Implement the Planet interface in the Sun, Moon, and Earth classes.
4. In Solution class's static block, call the readKeyFromConsoleAndInitPlanet method.
5. Implement the readKeyFromConsoleAndInitPlanet method:
5.1. Read one String value from the console.
5.2. If the value is equal to one of the Planet interface's constants, create a corresponding object and assign it to Planet thePlanet,
otherwise set the Planet thePlanet to null.


Requirements:
1. The Sun class should prevent Sun objects from being created outside the class.
2. The Sun class must have a private static Sun field instance.
3. The Sun class must implement the public static getInstance method, which returns the value of the field instance.
4. The Sun class's getInstance method must ALWAYS return the same object.
5. The field instance must be initialized after the first call to the getInstance method, but not before.
6. The Moon class should prevent Moon objects from being created outside the class.
7. The Moon class must have a private static Moon field instance.
8. The Moon class must implement the public static getInstance method, which returns the value of the field instance.
9. The Moon class's getInstance method must ALWAYS return the same object.
10. The field instance must be initialized after the first call to the getInstance method, but not before.
11. The Earth class should prevent Earth objects from being created outside the class.
12. The Earth class must have a private static Earth field instance.
13. The Earth class must implement the public static getInstance method, which returns the value of the field instance.
14. The Earth class's getInstance method must ALWAYS return the same object.
15. The field instance must be initialized after the first call to the getInstance method, but not before.
16. The readKeyFromConsoleAndInitPlanet method must be called in the Solution class's static block.
17. The readKeyFromConsoleAndInitPlanet method should read one line from the keyboard.
18. The readKeyFromConsoleAndInitPlanet method must correctly update the value of the variable thePlanet according to the task conditions.
19. The Sun, Moon and Earth classes must be in separate files.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader buffer = new BufferedReader(inputStreamReader);

        String key="";

        try {
            key = buffer.readLine();
        }catch (IOException e){

        }

        if(key.equals(Planet.EARTH)){
            thePlanet = Earth.getInstance();
        } else if(key.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        } else if(key.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }else{
            thePlanet = null;
        }

    }
}

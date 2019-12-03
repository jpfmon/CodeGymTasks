package com.codegym.task.task17.task1706;

/* 
Synchronized president
We meet the singleton pattern again in synchronization in a static block.
Create a synchronized block inside a static block inside the OurPresident class.
Inside the synchronized block, initialize president.


Requirements:
1. The OurPresident class must have a private static OurPresident president.
2. The OurPresident class must contain the public static OurPresident getOurPresident() method.
3. The OurPresident class must have a private constructor.
4. The OurPresident class must have a static block.
5. The OurPresident class's static block must have a synchronized block.
6. The synchronized block must initialize president.
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }
}

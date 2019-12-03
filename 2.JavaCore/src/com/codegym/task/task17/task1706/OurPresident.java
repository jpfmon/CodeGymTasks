package com.codegym.task.task17.task1706;

/*1. The OurPresident class must have a private static OurPresident president.
        2. The OurPresident class must contain the public static OurPresident getOurPresident() method.
        3. The OurPresident class must have a private constructor.
        4. The OurPresident class must have a static block.
        5. The OurPresident class's static block must have a synchronized block.
        6. The synchronized block must initialize president.*/


public class OurPresident {

    private static OurPresident president;

    static {
        synchronized(OurPresident.class){
            if(president == null)
                president = new OurPresident();
        }
    }

    private OurPresident() {

    }

    public static OurPresident getOurPresident() {
        return president;
    }
}

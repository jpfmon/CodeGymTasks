package com.codegym.task.task17.task1707;


/*
IMF
Singleton pattern: synchronization in a method.
The IMF class is the International Monetary Fund.
Create a synchronized block inside the getFund method.
Inside the synchronized block, initialize imf so that the getFund method always returns the same object.


Requirements:
1. The IMF class must have a private static IMF field imf.
2. The IMF class must have a private constructor.
3. The IMF class must have a public static IMF getFund() method.
4. The getFund() method must have a synchronized block.
5. The synchronized block must initialize imf.
6. The getFund() method must always return the same object.
*/


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //write your code here

        synchronized (IMF.class) {

            if(imf==null){
                imf = new IMF();
            }else{}

            return imf;
        }
    }

    private IMF() {
    }
}

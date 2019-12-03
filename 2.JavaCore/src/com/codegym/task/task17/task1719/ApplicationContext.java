package com.codegym.task.task17.task1719;

import java.util.HashMap;
import java.util.Map;

/* 
ApplicationContext
The ApplicationContext class will be accessible by many threads.
Be sure that no data is lost: think about which keyword to put and where.


Requirements:
1. The ApplicationContext class must be abstract.
2. The ApplicationContext class must have a private Map<String, GenericsBean> field called container.
3. Use synchronized in the getByName(String name) method, if necessary.
4. Use synchronized in the removeByName(String name) method, if necessary.
*/

public abstract class ApplicationContext<GenericsBean extends Bean> {
    private Map<String, GenericsBean> container = new HashMap<String, GenericsBean>();
    // Map<Name, some class that implements the Bean interface>


    protected ApplicationContext() {

        parseAllClassesAndInterfaces();
    }

    public synchronized GenericsBean getByName(String name) {

        return container.get(name);

    }

    public synchronized GenericsBean removeByName(String name) {

            return container.remove(name);

    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}

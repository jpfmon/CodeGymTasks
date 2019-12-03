package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Introducing properties
In the fillInPropertiesMap method, read a file name from the console and populate the properties map with data from the file.
You can read about .properties here: http://en.wikipedia.org/wiki/.properties
Implement the logic for file IO for the properties map.


Requirements:
1. The fillInPropertiesMap method must read data from the console.
2. The fillInPropertiesMap method must create a FileInputStream, passing the read string as an argument.
3. The fillInPropertiesMap method should call the load method, passing the newly created FileInputStream as an argument.
4. The save method must store the properties map in the OutputStream object passed as an argument.
5. The load method must restore the state of the properties map from the InputStream object passed as an argument.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implement this method

        BufferedReader fromConsole = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(fromConsole.readLine());

        fromConsole.close();

        load(fileInputStream);

        fileInputStream.close();


    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method

        Properties properties = new Properties();

        for (Map.Entry<String, String> entry : Solution.properties.entrySet()) {
            properties.put(entry.getKey(), entry.getValue());
        }

        properties.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
        Properties properties = new Properties();
        properties.load(inputStream);

        Set keys = properties.keySet();
        Iterator iterator = keys.iterator();

        String key;
        String value;

        while (iterator.hasNext()) {
            key = (String) iterator.next();
            value = properties.getProperty(key);
            Solution.properties.put(key, value);
        }

    }

    public static void main(String[] args) {

    }
}

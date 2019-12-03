package com.codegym.task.task20.task2004;

import java.io.*;

/* 
Reading and writing static fields to a file
Implement the logic for file IO for the ClassWithStatic class.
The load method must initialize the object, including the static fields with data from the file.
The main method is not tested.


Requirements:
1. It should be possible to save/load Solution.ClassWithStatic objects using the save/load methods.
2. The Solution class should not support the Serializable interface.
3. The Solution.ClassWithStatic class should not support the Serializable interface.
4. The Solution.ClassWithStatic class must be public.
5. The Solution.ClassWithStatic class should not support the Externalizable interface.
*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {

            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            // Here check that the classWithStatic object is equal to the loadedObject object
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter out = new PrintWriter(outputStream);
            out.println(staticString);
            out.flush();
            out.println(this.i);
            out.flush();
            out.println(this.j);
            out.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String s = reader.readLine();
            String s1 = reader.readLine();
            String s3 = reader.readLine();
            ClassWithStatic.staticString = s;
            this.i = Integer.parseInt(s1);
            this.j = Integer.parseInt(s3);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}

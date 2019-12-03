package com.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Reading and writing to a file: Human
Implement the logic for file IO for the Human class.
The Human class's name field can't be empty.
The main method exists just for you and is not involved in testing the solution.


Requirements:
1. The read/write logic in the save/load methods must work correctly when the assets list is empty.
2. The read/write logic in the save/load methods must work correctly when the name field and assets list are not empty.
3. The Solution.Human class should not support the Serializable interface.
4. The Solution.Human class must be public.
5. The Solution.Human class should not support the Externalizable interface.
*/
public class Solution {
    public static void main(String[] args) {
        // Update the string passed to the createTempFile method based on the path to a file on your hard drive

        try {
            File yourFile = File.createTempFile("pruebaSaving", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human("Smith", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            // Check that smith is equal to somePerson

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter writer = new PrintWriter(outputStream);
            String isNamePresent = name != null ? "Yes" : "No";
            writer.println(isNamePresent);
            writer.println(name);
            String isAssetPresent = assets != null ? "Yes" : "No";
            writer.println(isAssetPresent);
            if (assets!=null) {
                for (Asset e : assets) {
                    writer.println(e.getName());
                    writer.println(e.getPrice());
                }
            }
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            Scanner scanner = new Scanner(inputStream);
            String isNamePresent = scanner.nextLine();
            if (isNamePresent.equals("Yes")) {
                name = scanner.nextLine();
            }
            String isAssetPresent = scanner.nextLine();

                if (isAssetPresent.equals("Yes")) {
                    while (scanner.hasNext()) {
                        Asset asset = new Asset(scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
                        assets.add(asset);
                    }
                }

            scanner.close();
        }
    }
}

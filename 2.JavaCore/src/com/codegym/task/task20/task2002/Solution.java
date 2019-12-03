package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* 
Reading and writing to a file: CodeGym
Implement the logic for file IO for the CodeGym class.
The file your_file_name.tmp can contain several CodeGym objects.
The main method exists just for you and is not involved in testing the solution.


Requirements:
1. The read/write logic in the save/load methods must work correctly when the users list is empty.
2. The read/write logic in the save/load methods must work correctly when the users list is not empty.
3. The Solution.CodeGym class should not support the Serializable interface.
4. The Solution.CodeGym class must be public.
5. The Solution.CodeGym class should not support the Externalizable interface.
*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object

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

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method

            PrintWriter writer = new PrintWriter(outputStream);
            String isUserEmpty = users.size() == 0 ? "Yes" : "No";

            writer.println(isUserEmpty);
//            private String firstName;
//            private String lastName;
//            private Date birthDate;
//            private boolean isMale;
//            private Country country;
            if(users.size()>0){
                for(User u:users){
                    writer.println(u.getFirstName());
                    writer.println(u.getLastName());
                    writer.println(u.getBirthDate().toString());

                    if(u.isMale()==true){
                        writer.println("true");
                    }else{
                        writer.println("false");
                    }
                    switch (u.getCountry()){
                        case OTHER:
                            writer.println("other");
                            break;
                        case UNITED_STATES:
                            writer.println("USA");
                            break;
                        case UNITED_KINGDOM:
                            writer.println("UK");
                            break;
                    }
                }
            }
            writer.flush();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method

            Scanner scanner = new Scanner(inputStream);
            String isUserEmpty = scanner.nextLine();

            if(isUserEmpty.equals("No")) {
                while (scanner.hasNextLine()) {
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    Date birthDate = new Date(scanner.nextLine());
                    boolean isMale = false;
                    if (scanner.nextLine().equals("true")) {
                        isMale = true;
                    } else {
                        isMale = false;
                    }
                    User.Country country = null;
                    switch (scanner.nextLine()) {
                        case "other":
                            country = User.Country.OTHER;
                            break;
                        case "USA":
                            country = User.Country.UNITED_STATES;
                            break;
                        case "UK":
                            country = User.Country.UNITED_KINGDOM;
                            break;
                    }
                    User user = new User();
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setBirthDate(birthDate);
                    user.setMale(isMale);
                    user.setCountry(country);
                    users.add(user);
                }
            }

            scanner.close();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}

package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter
Adapt Customer and Contact to RowItem.
The adapter class is DataAdapter.

Initialize countries before running the program. Mapping between country codes and country names:
UA Ukraine
US United States
FR France


Requirements:
1. The Solution class must have a public static Map<String, String> field called countries.
2. Initialize the countries field in a static block in the Solution class using the test data provided in the task.
3. The Solution class must have a RowItem interface.
4. The Solution class must have a Contact interface.
5. The Solution class must have a Customer interface.
6. The DataAdapter class must implement the RowItem interface.
7. The DataAdapter class must contain two private fields: Customer customer and Contact contact.
8. The DataAdapter class must have a constructor with (Customer customer, Contact contact) parameters. It must initialize the contact and customer fields.
9. Implement the RowItem interface methods in the DataAdapter class using the hints in the comments in the interfaces.
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA","Ukraine");
        countries.put("US","United States");
        countries.put("FR","France");
    }


    public static void main(String[] args) {


    }

    public static class DataAdapter implements RowItem{

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {

            String country = this.customer.getCountryName();
            String countryCode="";
            for(Map.Entry s: countries.entrySet()){
                if(s.getValue().equals(country)){
                    countryCode = (String) s.getKey();
                }
            }

            return countryCode;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {

            String fullName = this.contact.getName();
            String[] fullNameArrray = fullName.split(", ");

            return fullNameArrray[1];
        }

        @Override
        public String getContactLastName() {
            String fullName = this.contact.getName();
            String[] fullNameArrray = fullName.split(", ");

            return fullNameArrray[0];
        }

        @Override
        public String getDialString() {

            String phone = this.contact.getPhoneNumber();
            String phoneExtracted = phone.replace("(","").replace(")","").replace("-","");
            String result = "callto://"+phoneExtracted;
            return result;

        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}
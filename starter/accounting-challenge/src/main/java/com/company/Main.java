package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},

            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {
        //Update this
        // list<custumer> = Customers objects
        // create lists of customer objects to add them and access them later
        List<Customer> customer = new ArrayList<>();
        AccountRecord accountRecord = new AccountRecord();
        Customer customerob = new Customer();

        for (String[] customerRecord : customerData) {
            //Integer.parseInt() converts a String
            int id = Integer.parseInt(customerRecord[0]);
            String name = customerRecord[1];
            int charges = Integer.parseInt(customerRecord[2]);

            //customerob.getCharges().add(charges);


            // Check if customer already exists in the list

            boolean customerExists = false;

            // iterate if customer id found in list then break
            for (Customer customers : customer) {
                if (customers.getId() == id) {
                    customerExists = true;
                    break;
                }
            }

            // If customer doesn't exist, create a new customer and add it to the list
            if (!customerExists) {
                Customer customers = new Customer();
                customers.setId(id);
                customers.setName(name);
                customer.add(customers);
            }

        }
        System.out.println(customer.toString());

// Print the list of customers
        for (Customer customers : customer) {
            System.out.println("Customer ID: " + customers.getId() + ", Name: " + customers.getName());
        }

        System.out.println("Positive accounts:");
        for (Customer customers : customer) {
            if (customers.getBalance() > 0) {
                System.out.println(customers.toString());
            }
        }

        System.out.println("Negative accounts:");
        for (Customer customers : customer) {
            if (customers.getBalance() < 0) {
                System.out.println(customers.toString());
            }
        }



    }
}

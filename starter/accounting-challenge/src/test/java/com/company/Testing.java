package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Testing {

    @Test
    public void testGetBalance() {
        Customer customer = new Customer();
        List<AccountRecord> charges = new ArrayList<>();

        // Create AccountRecord objects
        AccountRecord charge1 = new AccountRecord();
        charge1.setCharge(100);


        AccountRecord charge2 = new AccountRecord();
        charge2.setCharge(-50);

        AccountRecord charge3 = new AccountRecord();
        charge3.setCharge(200);

        // Add chrges to the list
        charges.add(charge1);
        charges.add(charge2);
        charges.add(charge3);


        // Calculate the expected balance
        int expectedBalance = 250;

        // Get the actual balance
        int actualBalance = customer.getBalance();
        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testToString() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("John Doe");
        List<AccountRecord> charges = new ArrayList<>();

        // Create AccountRecord objcets
        AccountRecord charge1 = new AccountRecord();
        charge1.setCharge(100);


        AccountRecord charge2 = new AccountRecord();
        charge2.setCharge(-50);


        AccountRecord charge3 = new AccountRecord();
        charge3.setCharge(200);


        // Add charges to list
        charges.add(charge1);
        charges.add(charge2);
        charges.add(charge3);


        // Define the expected string representation
        String expectedToString = "Customer{id=1, name='John Doe', charges=[AccountRecord{charge=100, chargeDate='2023-01-01'}, AccountRecord{charge=-50, chargeDate='2023-02-01'}, AccountRecord{charge=200, chargeDate='2023-03-01'}]}";
        String actualToString = customer.toString();
        Assertions.assertEquals(expectedToString, actualToString);
    }
}
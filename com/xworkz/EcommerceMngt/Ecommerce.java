package com.xworkz.EcommerceMngt;

public class Ecommerce {

    private Customer customers[] = new Customer[10];
    private int index = 0;

    public boolean registerCustomer(Customer customer) {
        boolean isAdded = false;

        if (customer != null) {
            this.customers[index++] = customer;
            isAdded = true;
        } else {
            System.out.println("No customer data provided. Cannot register.");
        }

        return isAdded;
    }

    public void getCustomers() {
        System.out.println("Customer Information:");
        for (int customerIndex = 0; customerIndex < index; customerIndex++) {
            Customer customer = customers[customerIndex];
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Customer Name: " + customer.getCustomerName());
            System.out.println("Age: " + customer.getAge());
            System.out.println("Location: " + customer.getLocation());
            System.out.println("Gender: " + customer.getGender());
            System.out.println("Marital Status: " + customer.getMaritalStatus());
            System.out.println();  // Adding a line break between customers
        }
    }
}

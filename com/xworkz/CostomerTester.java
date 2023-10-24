package com.xworkz;

import com.xworkz.EcommerceMngt.Customer;
import com.xworkz.EcommerceMngt.Ecommerce;

import java.util.Scanner;

public class CostomerTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ecommerce ecommerce = new Ecommerce();

        Customer customer1 = new Customer();
        System.out.println("Enter customer Name");
        customer1.setCustomerName(sc.next());
        System.out.println("Enter customer id");
        customer1.setCustomerId(sc.nextInt());
        System.out.println("Age ");
        customer1.setAge(sc.nextInt());
        System.out.println("location");
        customer1.setLocation(sc.next());
        System.out.println("Gender");
        customer1.setGender(sc.next());
        System.out.println("Marital status");
        customer1.setMaritalStatus(sc.next());

        ecommerce.registerCustomer(customer1);
        ecommerce.getCustomers();
    }

}

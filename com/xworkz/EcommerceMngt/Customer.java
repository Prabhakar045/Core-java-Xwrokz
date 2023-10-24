package com.xworkz.EcommerceMngt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int customerId;
    private String customerName;
    private int age;
    private String location;
    private String gender;
    private String maritalStatus;


}

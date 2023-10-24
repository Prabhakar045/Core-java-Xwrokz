package com.Xworkz.ourOwnObjectsCustomerDetails;

import com.Xworkz.ConstantEnum.Gender;
import com.Xworkz.ConstantEnum.MaritalStatus;
import lombok.*;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class CustomerDto {
    private int customerId;
    private String customerName;
    private int age;
    private String location;
    private Gender gender;
    private MaritalStatus maritalStatus;
}

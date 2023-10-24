package com.Xworkz.ourOwnObjectsCustomerDetails;

import com.Xworkz.ConstantEnum.Gender;
import com.Xworkz.ConstantEnum.MaritalStatus;

import java.util.ArrayList;
import java.util.List;

public class CustomerExecutor {

    public static void main(String[] args) {

        List<CustomerDto> dto = new ArrayList<CustomerDto>();

        dto.add(new CustomerDto(1,"Prabhakar",22,"Earth", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(2,"manthesh",23,"Rajajaia nagara", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(3,"shekhar",23,"cirle", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(4,"rocky",35,"Bangalore", Gender.male, MaritalStatus.married));
        dto.add(new CustomerDto(5,"Rakshith", 23, "Bashayam circle",Gender.male,MaritalStatus.mingle));
        dto.add(new CustomerDto(6, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(7, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(8, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(9, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(10, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(11, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(12, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(13, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(14, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(15, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(16, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(17, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(18, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(19, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(20, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(21, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(22, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(23, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(24, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(25, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(6, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(7, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(8, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(9, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(10, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(11, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(12, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(13, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(14, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(15, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(16, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(17, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(18, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(19, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(20, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(21, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(22, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(23, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(24, "Indian", 25, "India", Gender.male, MaritalStatus.single));
        dto.add(new CustomerDto(25, "Indian", 25, "India", Gender.male, MaritalStatus.single));


        for (CustomerDto dto1 : dto){
            System.out.println(dto1);
        }


    }
}

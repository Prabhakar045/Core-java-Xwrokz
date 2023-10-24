package com.xworkz.dto;


import com.xworkz.Constant.BloodGroup;
import com.xworkz.Constant.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Patient {

    private int patientId;
    private String name;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String address;
    private int age;
    private String diseaseName;
    //private String location;
    private String wardNo;
    private String attenderName;
}

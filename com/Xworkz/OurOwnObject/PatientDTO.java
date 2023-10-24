package com.Xworkz.OurOwnObject;

import com.Xworkz.ConstantEnum.BloodGroup;
import com.Xworkz.ConstantEnum.Gender;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PatientDTO implements Comparable<PatientDTO> {
    private int patientId;
    private String name;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String address;
    private int age;
    private String diseaseName;
    private String wardNo;
    private String attenderName;



    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", diseaseName='" + diseaseName + '\'' +
                ", wardNo='" + wardNo + '\'' +
                ", attenderName='" + attenderName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PatientDTO){
            PatientDTO pat = (PatientDTO) obj;
            if(this.patientId=PatientDTO.()){
                return true;}
        return false;
    }

    @Override
    public int compareTo(PatientDTO o) {
//        return this.patientId - o.patientId;
//          return 0;
//        return  this.getName().compareTo(o.getName());
        // return  this.getAddress().compareTO(o.getAddress());
    }




}

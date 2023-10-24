package com.xworkz.HospitalManagement;

import com.xworkz.Constant.Gender;
import com.xworkz.dto.Patient;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Hospital {

    //Datatype variableName[]={value1,value2};
    //variableName[0]=value1;
    //variableName[1]=value2;
    //String str[]=new String[4];
    //PatientDTO patientDTO[]=new PatientDTO[6];

    public Patient patient[];
    public Hospital(int size){
        //Initialize patient array with size through constructor
        patient=new Patient[size];
    }
    int index;
    int id;

    public boolean createPatient(Patient patient){
        boolean isAdded=false;
        if(patient!=null){
            patient.setPatientId(++id);
            System.out.println(patient.getPatientId());
            this.patient[index++]=patient;
            isAdded=true;
        }
        else {
            System.out.println("Patient is null... cannot added the patient");
        }
        return isAdded;
    }

//    public void getPatient(){
//        for (int patientIndex=0; patientIndex<index; patientIndex++)
//            //Patient patient1=patient[patientIndex];
//            System.out.println(patient[patientIndex]);
//    }

    public void getPatient() {
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null) { // Check if the patient at the current index is not null
                System.out.println(patient[patientIndex]);
            }
        }
    }

    public String getPatientsAttenderNameByPatientId(int patientId) {
        String attenderName = null;                                            //     Gender gender= null  Gender is enum and it is also Non-primitive data type
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == patientId) {
                attenderName = patient[index].getAttenderName();     // tp access private data we are sing getter  -> getAttenderName
            }
        }
        return attenderName;
    }

    public Gender getPatientGenderByPatientName(String patientName) {
        Gender gender = null; // Initialize with null
        for (int index = 0; index < patient.length; index++) {
            if (patient[index] != null && patient[index].getName().equals(patientName)) {
                gender = patient[index].getGender();
                break; // No need to continue the loop once the patient is found
            }
        }
        return gender;
    }

    public boolean UpdatePatientAgeBYPatentName(int updateAge, String existingPatientNAme){
        boolean isAgeUpdated = false;

        for(int index =0; index< patient.length;index++){
                if(patient[index].getName().equals(existingPatientNAme)){
                    patient[index].setAge(updateAge);
                    isAgeUpdated=true;

                }

        }
        return isAgeUpdated;

    }

    public boolean UpdatePatientWardNoByPatientId(int patientId, String updateWardNo) {
        boolean isWardNoUpdated = false;

        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == patientId) {
                patient[index].setWardNo(updateWardNo);
                isWardNoUpdated = true; // Update the flag when ward number is updated
                break; // No need to continue the loop once the patient is found
            }
        }

        return isWardNoUpdated;
    }


    public boolean deletePatientByPatientId(int patientid) {
        boolean isPatientDeleted = false;
        int newIndex = 0; // Initialize the new index for the newPatient array
        Patient newPatient[] = new Patient[patient.length - 1]; // Create a new array to store the remaining patients

        for (int index = 0; index < patient.length; index++) {
            if (!(patient[index].getPatientId() == patientid)) {
                newPatient[newIndex] = this.patient[index]; // Copy non-matching patients to the new array
                newIndex++; // Increment newIndex
                isPatientDeleted=true;
            }
        }

        // Update the patient array with the newPatient array
        patient = Arrays.copyOf(newPatient, newIndex);

        return isPatientDeleted;
    }

}

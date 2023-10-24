package com.xworkz;

import com.xworkz.Constant.BloodGroup;
import com.xworkz.Constant.Gender;
import com.xworkz.HospitalManagement.Hospital;
import com.xworkz.dto.Patient;

import java.util.Arrays;
import java.util.Scanner;

public class PatientTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THe patient size is:");
        int size = sc.nextInt();
        Hospital hos = new Hospital(size);
//        Patient pat = new Patient();

        for (int index = 0; index < size; index++) {

            Patient pat = new Patient();

            System.out.println("Enter the patient name:");
            pat.setName(sc.next());
            System.out.println("Enter the patient gender:");
            pat.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the patient blood group:");
            pat.setBloodGroup(BloodGroup.valueOf(sc.next()));
            System.out.println("Enter the patient address:");
            pat.setAddress(sc.next());
            System.out.println("Enter the patient age:");
            pat.setAge(sc.nextInt());
            System.out.println("Enter the disease name:");
            pat.setDiseaseName(sc.next());
            System.out.println("Enter the ward no:");
            pat.setWardNo(sc.next());
            System.out.println("Enter the attender name:");
            pat.setAttenderName(sc.next());

            hos.createPatient(pat);
            //hos.getPatient();
        }
        hos.getPatient();


        int options;
        do {
            System.out.println("press 1, to get all the patients info");
            System.out.println("press 2, get the attender name");
            System.out.println("press 3, Enter the patient's name to get the gender:");
            System.out.println("press 4, Enter the patient's name to update the age");
            System.out.println(" press 5,to get patient Id to update the ward no");
            System.out.println("press 6, to delete");

            options = sc.nextInt();
            switch (options) {
                case 1:
                    hos.getPatient();
                    break;

                case 2:

                    System.out.println("Enter the patient's Id to get the Attender's Name");
                    String attenderName = hos.getPatientsAttenderNameByPatientId(sc.nextInt());
                    System.out.println("The patient's attender name is:" + attenderName);
                    break;

                case 3:
                    System.out.println("Enter the patient's name to get the gender:");
                    String patientNameToSearch = sc.next();
                    Gender patientGender = hos.getPatientGenderByPatientName(patientNameToSearch);
                    break;

                case 4:
                    System.out.println("Enter the patient's name to update the age:");
                    String patientNameToUpdate = sc.next();
                    System.out.println("Enter the new age:");
                    int newAge = sc.nextInt();
                    boolean ageUpdateResult = hos.UpdatePatientAgeBYPatentName(newAge, patientNameToUpdate);
                    break;

                case 5:
                    System.out.println("Enter patient Id to update the ward no");
                    int patientIdToUpdateWard = sc.nextInt();
                    System.out.println("Enter the new ward number:");
                    String newWardNo = sc.next();
                    boolean wardUpdateResult = hos.UpdatePatientWardNoByPatientId(patientIdToUpdateWard, newWardNo);
                    break;

                case 6:
                    // Delete patient by patient ID
                    System.out.println("Enter the patient's ID to delete:");
                    int patientIdToDelete = sc.nextInt();
                    boolean deletionResult = hos.deletePatientByPatientId(patientIdToDelete);
            }
        } while (options >= 1 && options <= 6);{

        System.out.println("Do you want to continue, yes/no");
        String answer = sc.next("yes");


    }

//        // Delete patient by patient ID
//        System.out.println("Enter the patient's ID to delete:");
//        int patientIdToDelete = sc.nextInt();
//        boolean deletionResult = hos.deletePatientByPatientId(patientIdToDelete);

//        System.out.println("Enter the patient's Id to get the Attender's Name");
//        String attenderName = hos.getPatientsAttenderNameByPatientId(sc.nextInt());
//        System.out.println("The patient's attender name is:" + attenderName);
//
//
//        System.out.println("Enter the patient's name to get the gender:");
//        String patientNameToSearch = sc.next();
//        Gender patientGender = hos.getPatientGenderByPatientName(patientNameToSearch);
//
//
//        System.out.println("Enter the patient's name to update the age:");
//        String patientNameToUpdate = sc.next();
//        System.out.println("Enter the new age:");
//        int newAge = sc.nextInt();
//        boolean ageUpdateResult = hos.UpdatePatientAgeBYPatentName(newAge, patientNameToUpdate);
//
//
//        System.out.println("Enter patient Id to update the ward no");
//        int patientIdToUpdateWard = sc.nextInt();
//        System.out.println("Enter the new ward number:");
//        String newWardNo = sc.next();
//        boolean wardUpdateResult = hos.UpdatePatientWardNoByPatientId(patientIdToUpdateWard, newWardNo);

        hos.getPatient();
    }
}


//sorting using
//
//    public static void main(String[] args) {
//        int a[] = new int[] {78,12,1};
//
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//    }



//    public static void main(String[] args) {
//        int a[] = new Obj[] {78,12,55.00, 1,patient, "pbk"};
//
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//    }
























































































//package com.xworkz;
//
//import com.xworkz.Constant.BloodGroup;
//import com.xworkz.Constant.Gender;
//import com.xworkz.HospitalManagement.Hospital;
//import com.xworkz.dto.Patient;
//
//import java.util.Scanner;
//
//public class PatientTester {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of patients:"); //  number of patients
//        int size = sc.nextInt();
//
//        Hospital hospital = new Hospital();
//
//        for (int patientIndex = 0; patientIndex < size; patientIndex++) {
//            Patient patient1 = new Patient(); // Create a new Patient object for each iteration
//
//            System.out.println("Enter name of patient");
//            patient1.setPatientName(sc.next());
//            System.out.println("Patient Id");
//            patient1.setPatientId(sc.nextInt());
//            System.out.println("Age:");
//            patient1.setAge(sc.nextInt());
//            System.out.println("Location");
//            patient1.setLocation(sc.next());
//            System.out.println("Gender (MALE/FEMALE/TRANSGENDER):");
//            String genderInput = sc.next();
//
//            System.out.println("Blood Group (APositive/ANegative/BPositive/BNegative...):");
//            String bloodGroupInput = sc.next();
//
//            hospital.savePatient(patient1);
//        }
//
//        System.out.println("Patient Information:");
//        hospital.getPatients();
//    }
//}

//        System.out.println("Enter patient details (Name, ID, Age, Location):");
//        Patient patient1 = new Patient(sc.next(), sc.nextInt(), sc.nextInt(), sc.next());


//        patient1.setPatientName("Rakshit");
//        patient1.setPatientId(1);
//        patient1.setAge(23);
//        patient1.setLocation("Haveri");
//        patient1.setGender(Gender.male);
// patient1.setBloodGroup(BloodGroup.Apositive0;

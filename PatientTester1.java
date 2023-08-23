package AbstractionHospitalmngt;
import com.xworkz.Constant.BloodGroup;
import com.xworkz.Constant.Gender;
import com.xworkz.dto.Patient;

import java.util.Scanner;

public class PatientTester1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the hospital:");
        int hospitalSize = sc.nextInt();
        Hospital1 hos = new ApolloHospitalIMPL(hospitalSize) {
            @Override
            public boolean createPatient(Patient1 patient) {
                return false;
            }
        };

        for (int index = 0; index < hospitalSize; index++) {

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
        } while (options >= 1 && options <= 6);
        {

            System.out.println("Do you want to continue, yes/no");
            String answer = sc.next("yes");

        }
    }
}
package AbstractionHospitalmngt;

import com.xworkz.Constant.Gender;
import com.xworkz.dto.Patient;

import java.util.Arrays;

public  abstract class ApolloHospitalIMPL implements  Hospital1 {

    private Patient[] patient;
    private int index;
    private int id;

    public ApolloHospitalIMPL(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean createPatient(Patient newPatient) {
        if (newPatient != null) {
            newPatient.setPatientId(++id);
            patient[index++] = newPatient;
            return true;
        } else {
            System.out.println("Patient is null... cannot add the patient");
            return false;
        }
    }

    @Override
    public void getPatient() {
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null) {
                System.out.println(patient[patientIndex]);
            }
        }
    }

    @Override
    public String getPatientsAttenderNameByPatientId(int patientId) {
        String attenderName = null;
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null && patient[patientIndex].getPatientId() == patientId) {
                attenderName = patient[patientIndex].getAttenderName();
                break;
            }
        }
        return attenderName;
    }

    @Override
    public Gender getPatientGenderByPatientName(String patientName) {
        Gender gender = null;
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null && patient[patientIndex].getName().equals(patientName)) {
                gender = patient[patientIndex].getGender();
                break;
            }
        }
        return gender;
    }

    @Override
    public boolean UpdatePatientAgeBYPatentName(int updateAge, String existingPatientName) {
        boolean isAgeUpdated = false;
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null && patient[patientIndex].getName().equals(existingPatientName)) {
                patient[patientIndex].setAge(updateAge);
                isAgeUpdated = true;
            }
        }
        return isAgeUpdated;
    }

    @Override
    public boolean UpdatePatientWardNoByPatientId(int patientId, String updateWardNo) {
        boolean isWardNoUpdated = false;
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null && patient[patientIndex].getPatientId() == patientId) {
                patient[patientIndex].setWardNo(updateWardNo);
                isWardNoUpdated = true;
                break;
            }
        }
        return isWardNoUpdated;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
        int newIndex = 0;
        Patient newPatient[] = new Patient[patient.length - 1];
        for (int patientIndex = 0; patientIndex < index; patientIndex++) {
            if (patient[patientIndex] != null && patient[patientIndex].getPatientId() != patientId) {
                newPatient[newIndex++] = patient[patientIndex];
            }
        }
        patient = Arrays.copyOf(newPatient, newIndex);
        return true;
    }
}

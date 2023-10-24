package com.xworkz.AbstractionHospitalmngt;

import com.xworkz.Constant.Gender;
import com.xworkz.Exception.AttenderNotFoundException;
import com.xworkz.Exception.PatientNameNotFoundException;
import com.xworkz.Exception.PatientIdNotFoundException;
import com.xworkz.dto.Patient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ApolloHospitalIMPL implements Hospital1 {

    private List<Patient> patients = new ArrayList<>();
    private int id = 0;

    public ApolloHospitalIMPL(int hospitalSize) {
    }

    @Override
    public boolean createPatient(Patient newPatient) {
        if (newPatient != null) {
            newPatient.setPatientId(++id);
            patients.add(newPatient);
            return true;
        } else {
            System.out.println("Patient is null... cannot add the patient");
            return false;
        }
    }

    @Override
    public void getPatient() {
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println(patient);
            }
        }
    }

    @Override
    public String getPatientsAttenderNameByPatientId(int patientId) throws AttenderNotFoundException {
        String attenderName = null;
        for (Patient patient : patients) {
            if (patient != null && patient.getPatientId() == patientId) {
                attenderName = patient.getAttenderName();
                break;
            }
        }
        if (attenderName == null) {
            throw new AttenderNotFoundException("Attender name not found for given Patient Id " + patientId);
        }

        return attenderName;
    }

    @Override
    public Gender getPatientGenderByPatientName(String patientName) {
        Gender gender = null;
        for (Patient patient : patients) {
            if (patient != null && patient.getName().equals(patientName)) {
                gender = patient.getGender();
                break;
            }
        }
        if (gender == null) {
            throw new PatientNameNotFoundException("Patient name not found...");
        }

        return gender;
    }

    @Override
    public boolean UpdatePatientAgeBYPatentName(int updateAge, String existingPatientName) {
        boolean isAgeUpdated = false;
        for (Patient patient : patients) {
            if (patient != null && patient.getName().equals(existingPatientName)) {
                patient.setAge(updateAge);
                isAgeUpdated = true;
            }
        }

        if (existingPatientName == null) {
            throw new PatientNameNotFoundException("Patient name is null.");
        }

        return isAgeUpdated;
    }

    @Override
    public boolean UpdatePatientWardNoByPatientId(int patientId, String updateWardNo) {
        boolean isWardNoUpdated = false;
        for (Patient patient : patients) {
            if (patient != null && patient.getPatientId() == patientId) {
                patient.setWardNo(updateWardNo);
                isWardNoUpdated = true;
                break;
            }
        }

        if (!isWardNoUpdated) {
            throw new PatientIdNotFoundException("Patient with ID " + patientId + " not found.");
        }
        return isWardNoUpdated;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) {
        Iterator<Patient> itr = patients.iterator();
        while (itr.hasNext()) {
            Patient patient = itr.next();
            if (patient != null && patient.getPatientId() == patientId) {
                itr.remove();
                return true;

            }
            break;
        }


        throw new PatientIdNotFoundException("Patient with ID " + patientId + " not found.");
    }
}

package AbstractionHospitalmngt;

import com.xworkz.Constant.Gender;
import com.xworkz.dto.Patient;

public interface Hospital1 {


    boolean createPatient(Patient1 patient);

    boolean createPatient(Patient newPatient);

    void getPatient();

    String getPatientsAttenderNameByPatientId(int patientId);

    Gender getPatientGenderByPatientName(String patientName);

    boolean UpdatePatientAgeBYPatentName(int updateAge, String existingPatientName);

    boolean UpdatePatientWardNoByPatientId(int patientId, String updateWardNo);

    boolean deletePatientByPatientId(int patientId);
}

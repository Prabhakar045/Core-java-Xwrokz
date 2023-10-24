package com.xworkz.Exammanagement;

public class ExamTester {

    public static void main(String[] args) {

        // Create an instance of HallTicket
        HallTicket hallTicket = new HallTicket("Data Structure","Prabhakar B K","1SG19CS075","18DS01");
//        hallTicket.setSubjectName("Data Structure");
//        hallTicket.setCandidateName("Prabhakar B K");
//        hallTicket.setUsnNo("1SG19CS075");
//        hallTicket.setSubjectCode("18DS01");

        // Create an instance of Exam
        Exam exam = new Exam();
        exam.setFees(1900);
        exam.allow();


        // Call the allow method and pass the HallTicket instance
//        exam.allow(hallTicket);

        // method overriding & polymorphism
        // to override method reference must be parent type(Exam) and object creation type must be child type (SupplementaryExam)
        Exam exam1 = new SupplementaryExam(hallTicket);
        exam1.setFees(1900);
        exam1.allow();

    }
}

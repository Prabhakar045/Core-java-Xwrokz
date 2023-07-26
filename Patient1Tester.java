class Patient1Tester{
	public static void main(String pat[]){
		Patient1 patient=new Patient1();
			patient.setPatientId(1);
			patient.setPatientName("Devdas");
			patient.setAge(25);
			System.out.println(patient.getPatientId()+"\n"+patient.getPatientName()+"\n"+patient.getAge());

		Patient1 patient1=new Patient1();
			patient.setBloodGroup("O-");
			patient.setGender("Male");
			patient.setAddress("Rajajinagar");
			patient.setContactNo(8596741236l);
			patient.setWardNo(108);
			System.out.println(patient.getBloodGroup()+"\n"+patient.getGender()+"\n"+patient.getAddress()+"\n"+patient.getContactNo()+"\n"+
		    patient.getWardNo());
            
		Patient1 patient2=new Patient1();
			patient.setAttenderName("Kousalya");
			patient.setDiseaseName("Endocarditis");
			patient.setConsultant("Dr.Harish");
			patient.setHospitalName("Sapthagiri");
			patient.setFees(500000.00);
			System.out.println(patient.getAttenderName()+"\n"+patient.getDiseaseName()+"\n"+patient.getConsultant()
			+"\n"+patient.getHospitalName()+"\n"+patient.getFees());
	}
}
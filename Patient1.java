class Patient1{
// 5 Rules for encapsulation:
// 1.Encapsulated class should be public
// 2.There should be default constructor
// 3.Private variables/data members/states/fields
// 4.public getter and setter
// 5.oops 
	private int patientId;
	private String patientName;
	private int age;
	private String bloodGroup;
	private String gender;
	private String address;
	private long contactNo;
	private int wardNo;
	private String attenderName;
	private String diseaseName;
	private String consultant;
	private String hospitalName;
	private double fees;
	//getter and setter
	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	public int getPatientId(){
		return patientId;
	}
	public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    public String getPatientName(){
        return patientName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setContactNo(long contactNo){
        this.contactNo = contactNo;
    }
    public long getContactNo(){
        return contactNo;
    }
    public void setWardNo(int wardNo){
        this.wardNo = wardNo;
    }
    public int getWardNo(){
        return wardNo;
    }
    public void setAttenderName(String attenderName){
        this.attenderName = attenderName;
    }
    public String getAttenderName(){
        return attenderName;
    }
    public void setDiseaseName(String diseaseName){
        this.diseaseName = diseaseName;
    }
    public String getDiseaseName(){
        return diseaseName;
    }
    public void setConsultant(String consultant){
        this.consultant = consultant;
    }
    public String getConsultant() {
        return consultant;
    }
    public void setHospitalName(String hospitalName){
        this.hospitalName = hospitalName;
    }
    public String getHospitalName(){
        return hospitalName;
    }
    public void setFees(double fees){
        this.fees = fees;
    }
    public double getFees(){
        return fees;
    }
}
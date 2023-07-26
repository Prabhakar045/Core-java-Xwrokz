public class PassportApplicationTester {
    public static void main(String[] args) {
        PassportApplication application = new PassportApplication();
        application.setApplicationId(12345);
        application.setApplicantName("John Doe");
        application.setDateOfBirth("1990-01-15");
        application.setNationality("USA");
        application.setAddress("123 Main Street, Anytown");
        application.setContactNumber(1234567890L);
        application.setEmail("john.doe@example.com");
        application.setOccupation("Engineer");
        application.setMaritalStatus("Single");
        application.setReference("ABC123XYZ");

        // Display Passport Application details
        System.out.println("Application ID: " + application.getApplicationId());
        System.out.println("Applicant Name: " + application.getApplicantName());
        System.out.println("Date of Birth: " + application.getDateOfBirth());
        System.out.println("Nationality: " + application.getNationality());
        System.out.println("Address: " + application.getAddress());
        System.out.println("Contact Number: " + application.getContactNumber());
        System.out.println("Email: " + application.getEmail());
        System.out.println("Occupation: " + application.getOccupation());
        System.out.println("Marital Status: " + application.getMaritalStatus());
        System.out.println("Reference: " + application.getReference());
    }
}

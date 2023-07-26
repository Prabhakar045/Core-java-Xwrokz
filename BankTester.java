public class BankTester {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBankId(1);
        bank.setBankName("ABC Bank");
        bank.setBranch("Main Branch");
        bank.setBranchCode("B123");
        bank.setAddress("123, Main Street, City");
        bank.setHelplineNo(911234567890L);
        bank.setBranchManager("John Doe");
        bank.setIfscCode("ABC123");
        bank.setMiscCode("MISC456");
        bank.setNoOfLockers(100);
        bank.setNoOfEmployees(50);
        bank.setTimings("9 AM - 5 PM");
        bank.setWebsiteDetails("www.abcbank.com");

        // Display bank details
        System.out.println("Bank ID: " + bank.getBankId());
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Branch: " + bank.getBranch());
        System.out.println("Branch Code: " + bank.getBranchCode());
        System.out.println("Address: " + bank.getAddress());
        System.out.println("Helpline Number: " + bank.getHelplineNo());
        System.out.println("Branch Manager: " + bank.getBranchManager());
        System.out.println("IFSC Code: " + bank.getIfscCode());
        System.out.println("MISC Code: " + bank.getMiscCode());
        System.out.println("Number of Lockers: " + bank.getNoOfLockers());
        System.out.println("Number of Employees: " + bank.getNoOfEmployees());
        System.out.println("Timings: " + bank.getTimings());
        System.out.println("Website Details: " + bank.getWebsiteDetails());
    }
}

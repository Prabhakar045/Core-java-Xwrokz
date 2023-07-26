class Customer1Tester{
	public static void main(String cus[]){
		Customer1 customer=new Customer1();
			customer.setCustomerId(1);
			customer.setFirstName("Rakshith");
			customer.setMiddleName("K");
			customer.setLastName("P");
			customer.setEmail("rakshithkp2709@gmail.com");
			customer.setPhoneNumber(9110886582l);
			customer.setDob("27/09/2001");
			customer.setAddress("Bangalore");
			// customer.getCustomerId();
			System.out.println(customer.getCustomerId()+"\n"+customer.getFirstName()+"\n"+customer.getMiddleName()+"\n"+
			customer.getLastName()+"\n"+customer.getEmail()+"\n"+customer.getPhoneNumber()+"\n"+customer.getDob()+"\n"+
			customer.getAddress());
	}
}
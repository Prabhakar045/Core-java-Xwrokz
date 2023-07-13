class BankAccount{
	static double balance=15000.00;
	static boolean isCredited;
    

	public static boolean credit(int amount){
		
        boolean isCredited=false;

	    if(amount>=0){
		isCredited=true;
		balance=balance+amount;
		System.out.println("The amount is credited");
	// }else{
		// isCredited=true;
		// System.out.println("Enter amount");
	    }
	     return isCredited;
	    }

	static boolean isDebited;
   public static boolean debit(int amount){
	   boolean isDebited=false;
   if(amount<=balance){
	   isDebited=true;
	   balance=balance-amount;
	   System.out.println("The amount is debited");
   // }else{
	   // isDebited=true;
	   // System.out.println("Enter amount");
    }
	   return isDebited;
    }
  
  public static double getBalance(){
	  return balance;
  }




	   
}
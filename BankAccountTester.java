class BankAccountTester{
	public static void main(String bank[]){
		// double balance=15000.00;
		// System.out.println("Current Balance : "+ balance);
		// boolean creditBalance=BankAccount.credit(balance);
		// boolean debitBalance=BankAccount.debit(balance);
		// System.out.println("Amount Credited : "+creditBalance);
		// System.out.println("Amount Debited : "+debitBalance);
		BankAccount.credit(20000);
		double balance=BankAccount.getBalance();
		System.out.println("Current balance "+ balance);
		BankAccount.debit(300);
		double balance1=BankAccount.getBalance();
		System.out.println("Current balance "+ balance1);
	}
}
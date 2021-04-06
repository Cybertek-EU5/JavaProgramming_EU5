package day17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {
		
		int x = 5;
		System.out.println(x);
		
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		
		System.out.println(acc1);
		System.out.println(acc2);
		
		
		
		
		
		
		
		
		
		
		acc1.accountHolder = "Mike Smith";
		
		acc1.accountNumber=12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.withdraw(100);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();
	}

}

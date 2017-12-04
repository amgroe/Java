package oop;

public class BankAccount {

	// Define Variables
	String accountNumber;
	
	// static belongs to class not object instance
	static final String routingNumber = "032154";
	String name;
	String ssn;
	String accountType;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are implicitly called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no return type
	
	BankAccount(){
		System.out.println("New account created");
	}
	// Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("New account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New account: " + accountType);
		System.out.println("--Initial deposit of: $" + initDeposit + "--");
		
		if (initDeposit < 1000){
			
			String errorMsg = "ERROR: Minimum deposit must be at least $1,000";
			System.out.println(errorMsg);
		}
	}
	
	// Define Methods
	void deposit(){
		
	}
	void withdraw(){
		
	}
	void checkBalance(){
		
	}
	void getStatus(){
		
	}
	
	
	
}

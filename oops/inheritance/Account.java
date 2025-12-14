class Account {
	String accountNumber; //creates account number with balance
	double balance;

	Account(String accountNumber, double balance){ // initiated using constructor
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	void deposit(double amount) { // deposit method to add and set the balance
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

}


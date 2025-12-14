class Account {
	int acnt_num;
	void display(){
		System.out.println("General Account");
	}
}
class SavingsAccount extends Account{
	void savingsRules(){
		System.out.println("Balance should be 2000");
	}
	super();// parent class constructor
	super.acnt_num;	// for parent class variable
	super.display();// for parent class method  
}
class CurrentAccount extends Account{
	void overDraft(){
		System.out.println("Overdraft is allowed for this account");}
}
public class Main{
	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();

		sa.display();
		sa.savingsRules();
		ca.display();
	}
}




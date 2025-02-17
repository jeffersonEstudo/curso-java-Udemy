package entities;

public class BusinessAccount extends  Account{
 private double loanLimit;
	
 public BusinessAccount() {
	 super();
 }

public BusinessAccount(int number, String holder, double balance, double loanLimit) {
	super(number, holder, balance);
	this.loanLimit = loanLimit;
}

public double getloanLimit() {
	return loanLimit;
}

public void setloanLimit(double loanLimit) {
	this.loanLimit = loanLimit;
}
 
 public void loan(double amount) {
	if(amount<=loanLimit) {
	 deposit(amount) ;
 }}
 
 @Override
 public void withdraw(double amount ) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}

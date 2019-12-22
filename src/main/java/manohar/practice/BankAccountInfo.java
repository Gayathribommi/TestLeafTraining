package manohar.practice;

public abstract class BankAccountInfo {

	public static double balance = 50000;
	public double interestRate;
	public double interestAmount;

	public double getInterestAmount() {
		return interestAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	public void withDrawAmount(double withdrawAmount) {
		balance = balance - withdrawAmount;
				
		
	}
	
	public void depositAmount(double creditAmount) {
		balance = balance + creditAmount;
		
	}

}
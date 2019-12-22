package manohar.practice;

public class IdfcBank extends BankAccountInfo implements BankAccount{	
	
	public IdfcBank(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String nameOfTheBank() {
		return "IDFC bank";
		
	}	
	

}

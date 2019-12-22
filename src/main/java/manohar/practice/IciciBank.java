package manohar.practice;

public class IciciBank extends BankAccountInfo implements BankAccount{	
	
	
	public IciciBank(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String nameOfTheBank() {
		return "ICICI bank";
		
	}	
	

}

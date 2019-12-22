package manohar.practice;

public class StandardCharteredBank extends BankAccountInfo implements BankAccount{	
	
	
	public StandardCharteredBank(int interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String nameOfTheBank() {
		return "StandardChartered bank";
		
	}	
	

}

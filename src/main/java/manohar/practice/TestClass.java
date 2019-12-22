package manohar.practice;

public class TestClass {

	public static void main(String[] args) {
		
		CalculateInterestAmount calculateInterestAmount = new CalculateInterestAmount();
		
		BankAccount bankAccountOne = new IdfcBank(7);
		BankAccount bankAccountTwo = new IciciBank(8);	
		StandardCharteredBank standardCharteredBank = new StandardCharteredBank(4);
		
		System.out.println(calculateInterestAmount.interestAmount(bankAccountOne));
		System.out.println(calculateInterestAmount.interestAmount(bankAccountTwo));
		System.out.println(calculateInterestAmount.interestAmount(standardCharteredBank));
		

	}

}

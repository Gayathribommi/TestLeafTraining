package manohar.practice;

public class CalculateInterestAmount {
	
	public double interestAmount(BankAccount bankAccount) {
		double interestSum = ((BankAccountInfo)bankAccount).balance * (((BankAccountInfo)bankAccount).getInterestRate()/100);
		System.out.println(bankAccount.nameOfTheBank()+ "\t"+ interestSum);
		return interestSum;
	}

	
}

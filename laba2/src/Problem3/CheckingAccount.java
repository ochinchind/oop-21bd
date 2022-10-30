package Problem3;

public class CheckingAccount extends Account {
	int num;
	int FREE_TRANSACTIONS;
	{
		num = 0;
		FREE_TRANSACTIONS = 0;
	}

	public CheckingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	void deductFee() {
		super.withdraw(0.02);
	}
	
	public void deposit(double sum) {
		deductFee();
		super.deposit(sum);
		num++;
	}
	public void withdraw(double sum) {
		deductFee();
		super.withdraw(sum);
		num++;
	}
	
	public String toString() {
		return "Checking " + super.toString()+ " Number of Transactions: " + num +" Number of free transactions:" + FREE_TRANSACTIONS;
 	}
	
	

}

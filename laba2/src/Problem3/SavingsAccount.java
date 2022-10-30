package Problem3;

public class SavingsAccount extends Account {
	double interestrate;

	public SavingsAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public void addInterest(double interestrate) {
		this.interestrate += interestrate;
	}
	
	public String toString() {
		return "Savings "+ super.toString() + " Interest rate: " + interestrate;
 	}
	
}

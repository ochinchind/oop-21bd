package Problem3;

import java.util.Vector;

public class Bank {
	
	static Vector <Account> accs = new Vector<Account>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account(1);
		SavingsAccount b = new SavingsAccount(2);
		CheckingAccount c = new CheckingAccount(3);
		
		for(Account cur : accs) {
			System.out.println(cur);
		}
		

	}
	
	public void update() {
		
	}
	
	public void openAcc() {
		
	}
	public void closeAcc(Account a) {
		for(Account cur : accs) {
			if (cur.equals(a)) {
				accs.remove(cur);
			}
		}
	}
	

}

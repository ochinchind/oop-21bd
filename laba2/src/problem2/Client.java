package problem2;

public class Client extends Person {
	String company;
	
	{
		Tester.people.add(this);
	}
	
	public Client() {
		
	} 
	public Client(String name, int age, int id, String company) {
		super(name, age, id);
		this.company = company;
	}
	
	public String toString() {
		return "Client: "+super.toString() + " Company: "+company;
	}
	
}

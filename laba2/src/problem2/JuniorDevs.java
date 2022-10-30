package problem2;

public class JuniorDevs extends Person {
	String project;
	int pay;
	
	{
		Tester.people.add(this);
	}
	
	public JuniorDevs() {
		
	}
	public JuniorDevs(String name, int age, int id, String project, int pay) {
		super(name, age, id);
		this.project = project;
		this.pay = pay;
	}
	
	
	public String toString() {
		return "JuniorDev: " + super.toString() + " project : "+project+ " Pay: " +pay;
	}
	public void Procrastinating() {
		System.out.println("The "+ name + " cant procrastinate");
	}
	
	
	
	
}

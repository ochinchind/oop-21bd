package problem2;


public class Managers extends Person {
	String otdel;
	int pay;
	
	{
		Tester.people.add(this);
	}
	
	public Managers() {
		
	}
	public Managers(String name, int age, int id, String otdel, int pay) {
		super(name, age, id);
		this.otdel = otdel;
		this.pay = pay;
	}
	
	
	public String toString() {
		return "Manager : " + super.toString()+ " otdel : "+otdel+" Pay: "+pay;
	}
	
	public void Procrastinating() {
		System.out.println("Why "+ name + " is Procrastinating?");
	}
	
	

}

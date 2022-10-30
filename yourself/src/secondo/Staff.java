package secondo;

import java.util.Vector;

public class Staff extends Person {
	String school;
	double pay;
	{
		testPeople.people.add(this);
	}
	public Staff() {
		
	}
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getschool() {
		return school;
	}
	public double getPay() {
		return pay;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public String toString() {
		return "Staff[" + super.toString()+", school = " +school +",pay = " + pay + "]";
	}
	
	
}

package secondo;

import java.util.Vector;

public class Student extends Person {
	String program;
	int year;
	double fee;


	{
		testPeople.people.add(this);
	}
	public Student() {
		
	}
	public Student(String name, String address) {
		super(name,address);
	}
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public int getYear() {
		return year;
	}
	public double getFee() {
		return fee;
	}
	public void setProgram(String program) {
		this.program=program;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String toString() {
		return "Student[" + super.toString()+", program = " + program + ",year = "+ year+ ",fee = " + fee + "]";
	}
	
	
}

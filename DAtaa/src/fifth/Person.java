package fifth;

import java.util.Vector;

public class Person {
	Gender gender;
	int age;
	static Vector<Person> persons;
	
	static{
		persons = new Vector<Person>();
	}
	{
		persons.add(this);
	}
	
	public Person(){
		
	}
	public Person(Gender gender, int age) {
		this.gender = gender;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public Gender getGender() {
		return gender;
	}

	public String toString() {
		return "Gender: "+gender+ " Age: " + age;
	}
	/*public void pushBoy() {
		kidnap.add("B");
	}
	public void pushGirl() {
		kidnap.add("G");
	}
	*/
	
	
}

import java.time.LocalDate;
public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	public String toString() {
		return this.firstName + this.lastName + this.dob;
	}
	
	public String getFirstName() {
		return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}
}

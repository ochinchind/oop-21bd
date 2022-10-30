package secondo;

import java.util.Vector;

public class Person {
	String name, address;

	public Person(){
		
	}
	public Person(String name,String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String toString() {
		return "Person[name = " + name + ", address = " + address + "]";
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof Person)) return false;
		
		Person p = (Person) o; // type casting
		return this.getName().equals(p.getName()) && this.getAddress().equals(p.getAddress());
	}
}

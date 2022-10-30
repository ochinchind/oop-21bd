package problem2;


public class Person {
	String name;
	int age;
	int id;
	public Person() {
		
	}
	public Person(int id) {
		this.id = id;
	}
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void Procrastinating() {
		System.out.println("Nothing");
	}
	
	
	public String toString() {
		return "id: " + id + " Name: "+ name + " Age: " + age;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof Person)) return false;
		Person p = (Person) o;
		return this.id == p.id;
	}
	
}

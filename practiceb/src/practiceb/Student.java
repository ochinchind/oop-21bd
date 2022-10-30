package practiceb;

public class Student {
	
	String name = "";
	int year, age;
	private int id;
	
	static int numOfStuds;
	
	public Student() {
		numOfStuds++;
	}
	public Student(int id) {
		this();
		this.id = id;
	}
	public Student(int id, String name) {
		this(id);
		this.name = name;
	}
	public Student(int id, String name, int age) {
		this(id, name);
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return this.name + " " + this.age + " " + this.id;
	}
	
	
	
	
}

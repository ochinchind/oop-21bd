package fourth;

class Student {
	private int id;
	String name;
	int age;

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
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name+ " "+this.age+ " "+this.getId();
	}
	
	
	
}

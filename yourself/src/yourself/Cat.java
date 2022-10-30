package yourself;

public class Cat extends Animals {
	String color;
	public Cat() {
		super();
	}
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public void Voice() {
		System.out.println("Meow");
	}
}

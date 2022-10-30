package particiodssg;

public class Circle extends Shape {
	
	public Circle(Color color, int pos) {
		super(color, pos);
	}
	
	void draw() {
		System.out.println(" ".repeat(pos));
		if(color==Color.BLACK)
			System.out.println("()");
		else System.err.println("()");
	}

}

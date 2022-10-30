package problem1;

public class Cube {
	
	private static double side;
	
	public Cube() {
		
	}
	public Cube(double side) {
		this.side = side;
	}
	
	public double volume() {
		return side*side*side;
	}
	public double surfaceArea() {
		return side*side;
	}
	

}

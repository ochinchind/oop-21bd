package problem1;

public class Sphere {
	private static final double pi = 3.14;
	private double r;
	
	
	
	public Sphere() {
		
	}
	public Sphere(double r) {
		this.r=r;
	}
	
	public double Volume(double r) {
		return (4/3)*pi*Math.pow(this.r, 3);
	}
	public double surfaceArea(double r) {
		return 4*pi*Math.pow(r, 2);
	}
	
	
}

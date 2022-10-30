package problem1;

public class Cylinder {
	
	private static final double pi = 3.14;
	private double r;
	private double h;
	public Cylinder() {
		
	}
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	public double Volume(double r, double h) {
		return pi*(Math.pow(r, 2))*h;
	}
	public double surfaceArea(double r, double h) {
		return 2*pi*r*(r+h);
	}
	
}

package problem45;

public abstract class Circuit {
	double v=200;
	double r;
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return v*v/r;
	}
	public double getCurrent() {
		return v/r;
	}
	
	
	
	
}

package problem45;

public class Series extends Circuit {
	Circuit a, b;
	
	public Series(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return super.getCurrent()*this.getResistance();
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.v = V;
		
	}
	

}

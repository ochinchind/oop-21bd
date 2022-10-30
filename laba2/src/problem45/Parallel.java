package problem45;

public class Parallel extends Circuit {
	
	Circuit a, b;
	
	public Parallel(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double getResistance() {
		return 1/a.getResistance()+1/b.getResistance();
		}

	@Override
	public double getPotentialDiff() {
		return v;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.v = V;
		
	}

}

package problem45;

public class Resistor extends Circuit {
	
	public Resistor() {
		
	}
	public Resistor( double r) {
		this.r = r;
	}

	@Override
	public double getResistance() {
		return r;
	}

	@Override
	public double getPotentialDiff() {
		return super.getCurrent()*this.r;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.v = V;
		
	}
	
	public void setResistance(double r) {
		this.r = r;
	}

}

package third;

import java.util.Vector;

public class Temperature {
	private int temp;
	private degrees degr;
	
	
	
	
	
	public Temperature() {
		temp = 0;
		degr = degrees.C;
	}
	public Temperature(int temp) {
		this();
		this.temp = temp;
	}
	public Temperature(degrees degr) {
		this();
		this.degr=degr;
	}
	public Temperature(int temp, degrees degr) {
		this(temp);
		this.degr = degr;
	}
	
	public String getCelsius() {
		if (this.degr == degrees.C) {
			return this.temp + " " + this.degr;
		} else {
			int degreesC = 5*(this.temp-32)/9;
			return degreesC + " " + degrees.C;
		}
	}
	public String getFaren() {
		if (this.degr == degrees.C) {
			int degreesF = 9*(this.temp/5)+32;
			return degreesF + " " + degrees.C;
		} else {
			return this.temp + " " + this.degr;
		}
	}
	
	public void setVal(int temp) {
		this.temp = temp;
	}
	public void setDegr(degrees degr) {
		this.degr = degr;
	}
	public void setValDegr(int temp, degrees degr) {
		this.temp = temp;
		this.degr = degr;
	}
	public degrees getScale() {
		return degr;
	}
	
	
}

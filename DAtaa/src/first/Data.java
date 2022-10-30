package first;

import java.util.Vector;
import java.util.Collections;

public class Data {
	
	private int cnt;
	private double avg, maxn;

	

	public Data() {
	
	}
	

	
	public void addId(int a) {
		if(maxn<a) {
			maxn=a;
		}
		cnt++;
		avg+=a;
	}
	public double getAverage() {
		return avg/cnt;
	}
	public Double getMax() {
		return maxn;
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

	
}

package practic2;

public class starTriangle {
	String shape="[*]",shapelast = "";
	private int n;
	public starTriangle() {
		
	}
	public starTriangle(int n) {
		this.n = n;
	}
	public String toString() {
		for (int i = 0; i<this.n; i++) {
			for(int j = 0; j <i+1; j++) {
				shapelast += shape;
			}
			shapelast += "\n";
		}
		return shapelast;
	}
	public static void main(String[] args) {
		starTriangle small = new starTriangle(4);
		System.out.println(small.toString());
	}
}

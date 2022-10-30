package third;

public class testTemp {

	public static void main(String[] args) {
		Temperature small = new Temperature();
		Temperature big = new Temperature(9999, degrees.F);
		System.out.println(big.getCelsius());
		System.out.println(small.getCelsius());
		big.setVal(320);
		big.setDegr(degrees.C);
		System.out.println(big.getCelsius());
		small.setValDegr(320, degrees.F);
		System.out.println(small.getScale());
		System.out.println(small.getCelsius());
	}

}

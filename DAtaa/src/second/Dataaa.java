package second;

public class Dataaa {
	Discounts dis;
	final double price ;
	private static int cnt;
	public String productName;
	public int id;
	static double a;
	
	{
		price = 14.99;
		
	}
	
	public Dataaa() {
		cnt++;
	}
	public Dataaa(int id) {
		this();
		this.id = id;
	}
	public Dataaa(int id, String productName) {
		this(id);
		this.productName = productName;
	}
	public Dataaa(int id, String productName, Discounts dis) {
		this(id, productName);
		this.dis = dis;
	}
	
	public String toString(){
		if (dis == Discounts.Yes) {
			a = Dataaa.disc(price, 10);
		} else if (dis == Discounts.DoubleYes){
			a = Dataaa.disc(price, 10, 2);
		} else {a=price;}
		return "ProductID: "+id+"  ProductNAME: "+productName+"  Discount: "+dis + " Price: "+a;
	}
	
	public static double disc(double x, int y) {
		return x-x*y/100;
	}
	public static double disc(double x, int y, int z) {
		return x-x*y/100-z;
	}
	public int getNumOfProd() {
		return cnt;
	}
	
	
	
}

import java.util.Scanner;
import java.lang.Math;
public class ccccccccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, d, root1, root2;
		Scanner sc = new Scanner(System.in);
		System.out.println("a, b, c numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = b*b-4*a*c;
		if (d < 0) {
			System.out.println("Error d < 0");
		} else {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
	        root2 = (-b - Math.sqrt(d)) / (2 * a);
	        System.out.println(root1 + " " + root2);
		}
		
	}

}

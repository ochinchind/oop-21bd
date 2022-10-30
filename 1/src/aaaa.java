import java.util.Scanner;

public class aaaa {
	

	 public static String sMethod(String name) {
		 String g = "+";
		 for (int i = 0; i < name.length(); i++) {
	            g = g + "-";
	        }
		 g += "+";
		 String k = g;
		 g = g + "\n|"+name +"|\n";
		 g = g + k;
		   return g;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in );
		System.out.println("Enter your name");
	    String name = sc.nextLine();
		String j = sMethod(name);
		System.out.println(j);
	}

}

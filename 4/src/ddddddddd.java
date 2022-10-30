import java.util.Scanner;
public class ddddddddd {
	
	public static boolean isPalindrome(String str) {
		String rev = "";
		boolean ans = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			ans = true;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = name.toLowerCase();
		boolean g = isPalindrome(name);
		System.out.println(g);
		
	}

}

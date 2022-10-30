package careerstarter;

public class main {
	
	public static int[] nums = initNums();
	
	static {
		nums = new int[5];
		nums[0] = 3;
	}
	
	public static int[] initNums() {
		int[] nums = new int[5];
		nums[0] = 3;
		return nums;
	}
	
	private String middleName = "Christopher";
	
	public void sayHello() {
		System.out.println("Hekki");
	}
	
	public void saySomething(String message) {
		System.out.println(message);
	}
	
	public char getMiddleInitial() {
		return middleName.charAt(0);
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main p1 = new main();
		p1.sayHello();
		p1.saySomething("mrmmrr");
		System.out.println(p1.getMiddleInitial());
		System.out.println(p1.add(5, 3));
		System.out.println(nums[0]);
	}

}

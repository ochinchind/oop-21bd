package fifth;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in );
		boolean issuper = false;
	
		
		while(true) {
		System.out.println("Add new person?\n"
				+ "1.Yes\n"
				+ "2.Exit\n");
		int choice = sc.nextInt();
		if(choice == 1) {
		System.out.println("Write gender:\n");
		String gen = sc.nextLine();
		String gen1 = sc.nextLine();
		System.out.println("Write age:\n");
		int age = sc.nextInt();
		System.out.println("Is this superman?\n"
				+ "1.Yes\n"
				+ "2.No\n");
		int choice2 = sc.nextInt();
		if(choice2 == 1) {
			issuper = true;
		} else if(choice2 == 2) {
			issuper = false;
		}
		if (issuper == true) {
			if (gen1.equals('B')) {
				new Superman(Gender.B, age);
			} else {
				new Superman(Gender.G, age);
			}
		} else {
			if (gen1.equals('B')) {
				new Person(Gender.B, age);
			} else {
				new Person(Gender.G, age);
			}
		}
		
		} else {
			break;
		}
		
		
		
		}
		for (Person cur: Person.persons) {
			DragonLaunch.kidnap(cur);
		}

		AngryDragon.willDragonEatOrNot();
		
		
		System.out.println();
		sc.close();
		
	}
}

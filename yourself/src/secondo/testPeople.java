package secondo;

import java.util.HashSet;
import java.util.Scanner;

public class testPeople {
	static HashSet<Person> people = new HashSet<Person>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in );
		Student a = new Student("Alex","Bakerstreet", "infosys",2022,999.99 );
		Staff b = new Staff("Aleks", "Kingstreet", "FIT", 500000);
		System.out.println(a);
		
		
		
		while(true) {
		System.out.println("Do you want to add student or employee?\n"
				+ "1. Add student\n"
				+ "2. Add employee\n"
				+ "3. Quit\n");
		int choice = sc.nextInt();
		if (choice == 3) {
			break;
		} else if (choice == 1) {
			System.out.println("Write name:");
			String name = sc.nextLine();
			String name1 = sc.nextLine();
			System.out.println("Address:");
			String address = sc.nextLine();
			System.out.println("program:");
			String program = sc.nextLine();
			System.out.println("Year:");
			int year = sc.nextInt();
			System.out.println("Fee:");
			double fee = sc.nextDouble();
			new Student(name1, address, program, year, fee);
		} else if (choice == 2) {
			System.out.println("Write name:");
			String name = sc.nextLine();
			String name1 = sc.nextLine();
			System.out.println("Address:");
			String address = sc.nextLine();
			System.out.println("school:");
			String school = sc.nextLine();
			System.out.println("Pay:");
			double pay = sc.nextDouble();
			new Staff(name1, address, school, pay);
		}
		}
		while(true) {
		System.out.println("What to do:\n"
				+ "1.Find someone\n"
				+ "2.Display students\n"
				+ "3.Display employees\n"
				+ "4.Quit");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Write name:");
			String name = sc.nextLine();
			String name1 = sc.nextLine();
			System.out.println("Address:");
			String address = sc.nextLine();
			for(Person cur: people) {
				
				if(cur.equals(new Person(name1, address))) {
				System.out.println(cur);
				}
			}
		}
		if(choice == 2) {
			for(Person cur: people) {
				if(cur.toString().charAt(2)=='u') {
					System.out.println(cur);
					}
			}
		}
		if(choice == 3) {
			for(Person cur: people) {
				if(cur.toString().charAt(2)=='a') {
					System.out.println(cur);
					}
			}
		}
		if(choice == 4) {
			break;
		}
		}
		

		
		// /e name address school pay
		// /si name
		// /ei name
		// /q
		// /h
		
		
		
	}

}

package problem2;

import java.util.HashSet;



public class Tester {
	static HashSet<Person> people = new HashSet<Person>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Managers s1 = new Managers("Alex", 25, 100001, "Economists", 500000);
		Managers s2 = new Managers("Roman", 35, 100002, "HR recruitment", 450000);
		JuniorDevs j1 = new JuniorDevs("Mohammad", 18, 10002, "kbtu WebSite", 850000);
		JuniorDevs j3 = new JuniorDevs("Mohammad", 18, 10002, "kbtu WebSite", 850000);
		Client c1 = new Client("Kim Chen", 78, 70005, "KBTU");
		for(Person cur: people) {
			if(cur.equals(new Person(70005))) {
				System.out.println(cur);
			}
		}
		s1.Procrastinating();


	}

}

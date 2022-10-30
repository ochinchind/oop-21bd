package fifth;

import java.util.Scanner;
import java.util.Vector;



public class DragonLaunch {
	 Vector <Gender> Prison = new Vector<Gender>();
	 boolean killing;
	public  void kidnap(Person p) {
		if(p instanceof Superman ) {
			killing = true;
		}
	if(Prison.isEmpty()) {
		Prison.add(p.gender);
	} else if (Prison.lastElement().equals(Gender.B) & p.gender.equals(Gender.G)) {
		Prison.remove(Prison.size()-1);
	} else {
		Prison.add(p.gender);
	}
	}
	
	public void willDragonEatOrNot() {
		if (Prison.isEmpty()) {
			System.out.print("No.");
		} else if(killing == true){
			System.out.println("No");
		} else {
			System.out.println("EATING AND CHILL");
		}
			
	}
	
	



}

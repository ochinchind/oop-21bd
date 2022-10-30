package fifth;

public class AngryDragon extends DragonLaunch {
		public void kidnap(Person p) {
			if(p instanceof Superman ) {
				Superman o = (Superman) p;
				o.runFast();
				killing = true;
			}
		if(p.gender == Gender.B) {
			if(p.getAge() <10) {
				Prison.add(p.gender);
			}
		} 
		}
		
		
		public  void willDragonEatOrNot() {
			if (Prison.isEmpty()) {
				System.out.print("No.");
			} else if(killing == true){
				System.out.println("No");
			} else {
				System.out.println("EATING AND CHILL");
			}
				
		}
	
}

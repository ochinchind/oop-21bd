package yourself;

public abstract class Animals {
	String name;
	public Animals(){
		
	}
	public Animals(String name) {
		this.name = name;
	}
	
	public void Voice() {
		System.out.println("");
	}
	public void Voice(int n) {
		for(int i =0; i<n; i++) {
			Voice();
		}
	}
	
}

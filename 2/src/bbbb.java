import java.util.Scanner;

public class bbbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in );
		
	    
		while(true) {
			String grade = sc.nextLine();
			
			  if(grade.equals("exit")){ 
			      break;
			  } else {
				  int number = Integer.parseInt(grade);
				  if (number > 80) {
					  System.out.println("A");
				  } else if(number > 60){
					  System.out.println("B");
				  } else if(number > 40) {
					  System.out.println("C");
				  } else if(number > 0) {
					  System.out.println("D");
				  }
			  }

			}
	}

}

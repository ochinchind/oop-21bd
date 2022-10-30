package first;
import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System. in );
		Data grades = new Data();
		
		while(true) {
			String grade = sc.nextLine();
			
			  if(grade.equals("Q")){ 
			      break;
			  } else {
				  int number = Integer.parseInt(grade);
				  grades.addId(number);
			  }
		}
		System.out.println("Average = " + grades.getAverage());
		System.out.println("Maximum = " + grades.getMax());
	}

}

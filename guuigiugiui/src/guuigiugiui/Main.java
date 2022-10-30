package guuigiugiui;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
		double y = random.nextDouble();
		
		System.out.println(x+y);
		String name =JOptionPane.showInputDialog("enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
		JOptionPane.showMessageDialog(null, "Your age " + age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("your height"));
		JOptionPane.showMessageDialog(null, "youh eithgt " + height);
	
	}

}

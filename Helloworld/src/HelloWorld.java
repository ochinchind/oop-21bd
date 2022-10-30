import java.time.LocalDate;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person johnny = new Person("johnny", "Smith", LocalDate.of(2000, 11, 1));
		Person any = new Person();
		System.out.println(johnny);
		System.out.format("The person's first name is: %s.", johnny.getFirstName());
	}

}

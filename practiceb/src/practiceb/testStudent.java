package practiceb;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "Pika";
		s.setId(2204);
		s.age = 78;
		Student s2 = new Student(88885);
		Student s3 = new Student(2207, "John", 20);
		System.out.println(s3.name + " "+s3.age+" "+s3.getId());
		
		System.out.println(s3.toString());
		System.out.println(s3);
	}
}

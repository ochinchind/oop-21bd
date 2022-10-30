
public class LearnString {
	public static void main(String[] args) {
		String fruit = "apple";
		String anotherFruit = "apple";
		String vegetable = new String("broccoli");
		String anotherVegetable = new String("broccoli");
		
		System.out.println(fruit == anotherFruit);
		System.out.println(vegetable == anotherVegetable);
		
//		String myText = "abcdefg";
//		System.out.println(myText.toUpperCase());
//		
//		String myText2 = "ABCDEFG";
	//	System.out.println(myText2.toLowerCase());
		
	//	String myText = " ";
	//	System.out.println(myText.isEmpty());
	//	System.out.println(myText.isBlank());
		String myText = "here's my awesome firf text";
		System.out.println(myText.replace("firf", "nice"));
		System.out.println(myText.replace('e', 'Z'));
		
		String firstName = " Jake ";
		String lastName = """
								<html>
					<div>here's a div block</div>
				</html>
				""";
		System.out.format("'%s'", firstName.trim());
		System.out.format("'%s'", firstName.stripLeading());
		System.out.format("'%s'", firstName.stripTrailing());
		System.out.format("'%s'", lastName.stripIndent());
		
		
		System.out.format("'%s'", split(firstName));
		
		
		String firstWord = "Apple";
		String secondWord = "apple";
		
		System.out.println(firstWord.compareToIgnoreCase(secondWord));
	}
	
	public static String split (String text) {
		return text.replace(" ", "");
	}
	
	public static int compareToIgnoreCase(String text1, String text2) {
		String lowerText1 = text1.toLowerCase();
		String lowerText2 = text2.toLowerCase();
		return lowerText1.compareTo(lowerText2);
	}

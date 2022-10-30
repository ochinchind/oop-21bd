package second;

public class Nalayze {

	public static void main(String[] args) {
		Dataaa apple = new Dataaa(54, "apple", Discounts.Yes); 
		Dataaa orange = new Dataaa(55, "orange", Discounts.DoubleYes); 
		Dataaa watermelon = new Dataaa(56, "awatermelon"); 
		Dataaa oil = new Dataaa(52, "oil"); 
		Dataaa card = new Dataaa(51, "card", Discounts.No); 
		System.out.println(apple);
		System.out.println(orange);
		System.out.println(card.getNumOfProd());

	}

}

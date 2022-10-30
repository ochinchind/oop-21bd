package particiodssg;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector<Shape> shapes=new Vector<Shape>();
		// TODO Auto-generated method stub
		Circle s = new Circle(Color.BLACK, 2);
		s.draw();
		Rectangle b = new Rectangle(Color.RED, 2);
		b.draw();
		shapes.add(new Circle(Color.RED, 4));
		
		for(Shape cur:shapes) {
			Thread.sleep(100);
			cur.draw();
		}
	}

}

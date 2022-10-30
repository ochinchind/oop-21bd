package practiceb;

public class Point {
	int x;
	
	public Point(int x) {
		this.x = x;
	}
	//int getDistance(Point p2) {
//		return Math.abs(x-p2.x);
	//}
	int getDistance(Point p2) {
		return getDistance(this, p2);
		
	}
	
	static int getDistance(Point p1, Point p2) {
		return Math.abs(p1.x-p2.x);
	}
	
	
}

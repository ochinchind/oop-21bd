package idkfr;

public class Pawn extends Piece {
	public Pawn() {
		
	}
	public Pawn(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			
			
			
			if(this.color.equals("W")) {
				
				
				if(b.y < 5) {
					if(this.a.y < b.y && ((b.y - this.a.y) <3) && this.a.getX() == b.getX()) {
						
						return true;
					}
				} else {
					if(this.a.y < b.y && ((b.y - this.a.y) <2) && this.a.getX() == b.getX()) {
						
						return true;
					}
				}
			}
			if(this.color.equals("B")) {
				if(b.y > 4) {
					if(this.a.y > b.y && ((b.y - this.a.y) >-3) && this.a.getX() == b.getX()) {
						
						return true;
					}
				} else {
					if(this.a.y > b.y && ((b.y - this.a.y) > -2) && this.a.getX() == b.getX()) {
						
						return true;
					}
				}
			}
		}
		return false;
	}
	void MakeMove(Position b) {
	if(this.color.equals("W")) {
		if(b.y - a.y == 1 && Math.abs(b.getX() - a.getX()) == 1) {
			for(Piece cur: Board.figures) {
				if(b.y == cur.a.y && b.x == cur.a.x) {
					if(!(cur.color.equals(this.color))) {
						a.Turn(a.getX());
						System.out.println(this.myClass() +" just ate: " + cur.myClass() + " and moved from: "+ a.x + a.getY() + " to: " + b.x + b.y);
						Board.figures.remove(cur);
						
						a = new Position(b.x, b.y);
						return;
					}
				}
			}
		}
	}
	if(this.color.equals("B")) {
		if(b.y - a.y == -1 && Math.abs(b.getX() - a.getX()) == 1) {
			for(Piece cur: Board.figures) {
				if(b.y == cur.a.y && b.x == cur.a.x) {
					if(!(cur.color.equals(this.color))) {
						a.Turn(a.getX());
						System.out.println(this.myClass() +" just ate: " + cur.myClass() + " and moved from: "+ a.x + a.getY() + " to: " + b.x + b.y);
						Board.figures.remove(cur);
						
						a = new Position(b.x, b.y);
						return;
					}
				}
			}
		}
	}
	if (this.isLegalMove(b)) {
		a.x = b.x;
		a.y = b.y;
		for(Piece cur: Board.figures) {
			if(this.equals(cur)) {
				if(!(this.color.equals(cur.color))) {
					a.Turn(a.getX());
					a = new Position(a.x, a.getY());
					System.out.println("You can't make this move!!!!");
					return;
				} else {
					a.Turn(a.getX());
					a = new Position(a.x, a.getY());
					System.out.println("There is already your figure");
					return;
				}
			}
			
			
		}
		a.Turn(a.getX());
		System.out.println(this.myClass() + " made move from: "+ a.x + a.getY() + " to: " + b.x + b.y);
		a = new Position(b.x, b.y);
		return;
	}
	System.out.println("You can't make this move");
	
		
	}
	
	
	
	String myClass() {
		return "Pawn";
	}
	
	
	
	
}

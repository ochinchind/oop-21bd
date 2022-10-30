package idkfr;


public abstract class Piece {
	String color;
	String pos;
	Position a;
	{
		Board.figures.add(this);
	}
	
	abstract boolean isLegalMove(Position b);
	boolean isLegalMove(Position a, Position b) {
		if(a.x == b.x && a.y == b.y) return false;
		if(a.y < 9 && a.getX()<9 && b.y < 9 && b.getX() < 9 && a.y > -1 && a.getX()>-1 && b.y > -1 && b.getX() >-1 ) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return false;
		if(o == null) return false;
		if(!(o instanceof Piece)) return false;
		Piece p = (Piece) o;
		return ((this.a.x ==p.a.x) && (this.a.y == p.a.y)) ;
	}
	void MakeMove(Position b) {
		if (this.isLegalMove(b)) {
			a.x = b.x;
			a.y = b.y;
			for(Piece cur: Board.figures) {
				if(this.equals(cur)) {
					if(!(this.color.equals(cur.color))) {
						a.Turn(a.getX());
						System.out.println(this.myClass() +" just ate: " + cur.myClass() + " and moved from: "+ a.x + a.getY() + " to: " + b.x + b.y);
						Board.figures.remove(cur);
						
						a = new Position(b.x, b.y);
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
	abstract String myClass();
	

	
	
}

package idkfr;

public class Bishop extends Piece {
	
	public Bishop(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			
			
			
			
			
			if(Math.abs(a.getX() - b.getX()) ==  Math.abs(this.a.y - b.y)) {
				if(b.getX() > a.getX() && b.y > a.y) {
					int n = b.getX()-a.getX() ;
					for(int i = 1; i < n;  i++ ) {
						for(Piece cur: Board.figures) {
							if(cur.a.getX() == a.getX() + i && cur.a.y == a.y+i) {
								return false;
							}
						}
					}
				}
				if(b.getX() < a.getX() && b.y > a.y) {
					int n = a.getX()-b.getX() ;
					for(int i = 1; i < n;  i++ ) {
						for(Piece cur: Board.figures) {
							if(cur.a.getX() == a.getX() - i && cur.a.y == a.y+i) {
								return false;
							}
						}
					}
				}
				if(b.getX() > a.getX() && b.y < a.y) {
					int n = a.getX()-b.getX() ;
					for(int i = 1; i < n;  i++ ) {
						for(Piece cur: Board.figures) {
							if(cur.a.getX() == a.getX() + i && cur.a.y == a.y-i) {
								return false;
							}
						}
					}
				}
				if(b.getX() < a.getX() && b.y < a.y) {
					int n = a.getX()-b.getX() ;
					for(int i = 1; i < n;  i++ ) {
						for(Piece cur: Board.figures) {
							if(cur.a.getX() == a.getX() - i && cur.a.y == a.y-i) {
								return false;
							}
						}
					}
				}

			
				return true;
			}
		}
		return false;
	}
	
	String myClass() {
		return "Bishop";
	}

	
	
}

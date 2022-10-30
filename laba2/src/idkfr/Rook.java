package idkfr;

public class Rook extends Piece{

	public Rook(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			if(b.y > a.y) {
				for(int i = a.y+1; i <=b.y; i++) {
					for(Piece cur: Board.figures) {
						if(a.x == cur.a.x && cur.a.y == i) {
							if(this.color.equals(cur.color))
								return false;
						}
					}
				}
			}
			if(b.y < a.y) {
				for(int i = b.y; i <a.y; i++) {
					for(Piece cur: Board.figures) {
						if(a.x == cur.a.x && cur.a.y == i) {
							if(this.color.equals(cur.color))
								return false;
						}
					}
				}
			}
			if(b.getX() > a.getX()) {
				for(int i = a.getX()+1; i <=b.getX(); i++) {
					for(Piece cur: Board.figures) {
							if(i == cur.a.getX() && a.y == cur.a.y) {
								if(this.color.equals(cur.color))
								return false;
							}
					}
				}
			}
			if(b.getX()< a.getX()) {
				for(int i = b.getX(); i <a.getX(); i++) {
					for(Piece cur: Board.figures) {
							if(i == cur.a.getX() && a.y == cur.a.y) {
								if(this.color.equals(cur.color))
								return false;
							}
					}
				}
			}
			
			if(this.a.y==b.y || this.a.getX() == b.getX()) {
				
				return true;
			}
		}
		return false;
	}
	String myClass() {
		return "Rook";
	}

}

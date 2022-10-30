package idkfr;

public class Queen extends Piece{
	
	public Queen(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			if((this.a.y==b.y || this.a.getX() == b.getX()) || (this.a.y - b.y == this.a.getX() - b.getX())) {
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

				}
				
				if(this.a.y==b.y || this.a.getX() == b.getX()) {
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
					
				}
					
				
				
				
				return true;
			}
		}
		return false;
	}
	String myClass() {
		return "Queen";
	}

	
	
}

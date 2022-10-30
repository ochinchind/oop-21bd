package idkfr;

public class Knight extends Piece{
	
	public Knight(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			if(((b.y-a.y == 2 || b.y -a.y == -2) && (b.getX()-a.getX()==1 || b.getX()-a.getX()==-1))||((b.getX()-a.getX()==2 || b.getX()-a.getX()==-2) && (b.y-a.y == 1 || b.y -a.y == -1)    )     ) {
				
				
				return true;
			}
			
			
		}
		return false;
	}
	String myClass() {
		return "Knight";
	}

	
	
}

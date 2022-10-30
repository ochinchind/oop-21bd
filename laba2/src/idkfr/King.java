package idkfr;

public class King extends Piece{

	
	public King(Position a, String color) {
		this.a = a;
		this.color = color;
	}
	
	@Override
	boolean isLegalMove(Position b) {
		if(super.isLegalMove(this.a, b)) {
			if(((this.a.y-b.y==0)||(this.a.y-b.y==1)||(this.a.y-b.y==-1)) && ((this.a.getX()-b.getX()==0)||(this.a.getX()-b.getX()==1)||(this.a.getX()-b.getX()==-1))  ) {
				
				return true;
			}
		}
		return false;
	}
	String myClass() {
		return "King";
	}

	
	
}

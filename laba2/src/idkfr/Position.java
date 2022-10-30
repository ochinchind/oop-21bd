package idkfr;

public class Position {
	char x;
	int y;
	private int realX, realY;
	public Position(char x, int y) {
		switch(x) {
		case 'a':
			this.realX = 1;
			break;
		case 'b':
			this.realX = 2;
			break;
		case 'c':
			this.realX = 3;
			break;
		case 'd':
			this.realX = 4;
			break;
		case 'e':
			this.realX = 5;
			break;
		case 'f':
			this.realX = 6;
			break;
		case 'g':
			this.realX = 7;
			break;
		case 'h':
			this.realX = 8;
			break;
		}
		this.x = x;
		this.y = y;
		this.realY = y;
	}
	public int getX() {
		return this.realX;
	}
	public int getY() {
		return this.realY;
	}
	
	void Turn(int a) {
		switch(a) {
		case 1:
			this.x = 'a';
			break;
		case 2:
			this.x = 'b';
			break;
		case 3:
			this.x = 'c';
			break;
		case 4:
			this.x = 'd';
			break;
		case 5:
			this.x = 'e';
			break;
		case 6:
			this.x = 'f';
			break;
		case 7:
			this.x = 'g';
			break;
		case 8:
			this.x = 'h';
			break;
		}
	}
	
	
	
	
}

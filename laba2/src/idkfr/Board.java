package idkfr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.io.*; 
public class Board {
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_RESET  = "\u001B[0m";

	static HashSet<Piece> figures = new HashSet<Piece>();
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System. in );
	Piece[][] board = new Piece[8][8];
	
	board[0][0] = new Rook(new Position('a', 1), "W");
	board[0][1] = new Knight(new Position('b', 1), "W");
	board[0][2] = new Bishop(new Position('c', 1), "W");
	board[0][3] = new Queen(new Position('d', 1), "W");
	board[0][4] = new King(new Position('e', 1), "W");
	board[0][5] = new Bishop(new Position('f', 1), "W");
	board[0][6] = new Knight(new Position('g', 1), "W");
	board[0][7] = new Rook(new Position('h', 1), "W");
	board[1][0] = new Pawn(new Position('a', 2), "W");
	board[2][0] = new Pawn(new Position('b', 2), "W");
	board[3][0] = new Pawn(new Position('c', 2), "W");
	board[4][0] = new Pawn(new Position('d', 2), "W");
	board[5][0] = new Pawn(new Position('e', 2), "W");
	board[6][0] = new Pawn(new Position('f', 2), "W");
	board[7][0] = new Pawn(new Position('g', 2), "W");
	board[1][1] = new Pawn(new Position('h', 2), "W");
	
	board[7][7] = new Rook(new Position('a', 8), "B");
	board[7][6] = new Knight(new Position('b', 8), "B");
	board[7][5] = new Bishop(new Position('c', 8), "B");
	board[7][4] = new Queen(new Position('d', 8), "B");
	board[7][3] = new King(new Position('e', 8), "B");
	board[7][2] = new Bishop(new Position('f', 8), "B");
	board[7][1] = new Knight(new Position('g', 8), "B");
	board[7][0] = new Rook(new Position('h', 8), "B");
	board[1][7] = new Pawn(new Position('a', 7), "B");
	board[2][7] = new Pawn(new Position('b', 7), "B");
	board[3][7] = new Pawn(new Position('c', 7), "B");
	board[4][7] = new Pawn(new Position('d', 7), "B");
	board[5][7] = new Pawn(new Position('e', 7), "B");
	board[6][7] = new Pawn(new Position('f', 7), "B");
	board[6][6] = new Pawn(new Position('g', 7), "B");
	board[6][5] = new Pawn(new Position('h', 7), "B");
	showBoard();
	
	while(true) {
		System.out.println("1. Make a move "
				+ "2. Quit");
		int a = sc.nextInt();
		
		if (a==1) {
			showBoard();
			System.out.println("Which figure to move(position):");
			String st = sc.nextLine();
			String str = sc.nextLine();
			int n = Character.getNumericValue(str.charAt(1));
			boolean found = false;
			for(Piece cur: figures) {
				if (str.charAt(0) == cur.a.x && n == cur.a.y) {
					Piece f = cur;
					
					System.out.println("New position: ");
					String str1 = sc.nextLine();
					int n1 = Character.getNumericValue(str1.charAt(1));
				    f.MakeMove(new Position(str1.charAt(0), n1));
				    showBoard();
				    break;
					
				}
			}
			
			
			
			
			
		} else {
			break;
		}
		
		
	}
	

	
	
	}
	
	static void showBoard() throws InterruptedException {
		
		for(int i = 8; i > 0; i--) {
			for(int j = 1; j < 9; j++) {
				boolean found = false;
				for (Piece cur: figures) {
					if(cur.a.getX() == j && cur.a.y == i) {
						if(cur.color.equals("W")) {
							if(cur instanceof Bishop) {
								System.out.print("B");
							} else if(cur instanceof Pawn) {
								System.out.print("P");
							} else if(cur instanceof Rook) {
								System.out.print("R");
							} else if(cur instanceof Knight) {
								System.out.print("H");
							} else if(cur instanceof Queen) {
								System.out.print("Q");
							} else if(cur instanceof King) {
								System.out.print("K");
							}
						} else {
							if(cur instanceof Bishop) {
								System.out.print("B");
							} else if(cur instanceof Pawn) {
								System.out.print("P");
							} else if(cur instanceof Rook) {
								System.out.print("R");
							} else if(cur instanceof Knight) {
								System.out.print("H");
							} else if(cur instanceof Queen) {
								System.out.print("Q");
							} else if(cur instanceof King) {
								System.out.print("K");
							}
						}
						found = true;
					}
				}
				if (found == true) {
					found = false;
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
			
		}
		
	}
	
	
}

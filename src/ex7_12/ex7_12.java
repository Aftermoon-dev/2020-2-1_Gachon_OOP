package ex7_12;

import java.util.Scanner;

public class ex7_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SudokuPuzzle sp = new SudokuPuzzle();
		
		sp.addInitial(0, 0 ,5);
		sp.addInitial(0, 1, 3);
		sp.addInitial(0, 4, 7);
		sp.addInitial(1, 0, 6);
		sp.addInitial(1, 3, 1);
		sp.addInitial(1, 4, 9);
		sp.addInitial(1, 5, 5);
		sp.addInitial(2, 1, 9);
		sp.addInitial(2, 2, 8);
		sp.addInitial(2, 7, 6);
		sp.addInitial(3, 0, 8);
		sp.addInitial(3, 4, 6);
		sp.addInitial(3, 8, 3);
		sp.addInitial(4, 0, 4);
		sp.addInitial(4, 3, 8);
		sp.addInitial(4, 5, 3);
		sp.addInitial(4, 8, 1);
		sp.addInitial(5, 0, 7);
		sp.addInitial(5, 4, 2);
		sp.addInitial(5, 8, 6);
		sp.addInitial(6, 1, 6);
		sp.addInitial(6, 6, 2);
		sp.addInitial(6, 7, 8);
		sp.addInitial(7, 3, 4);
		sp.addInitial(7, 4, 1);
		sp.addInitial(7, 5, 9);
		sp.addInitial(7, 8, 5);
		sp.addInitial(8, 4, 8);
		sp.addInitial(8, 7, 7);
		sp.addInitial(8, 8, 9);
		
		while(true) {
			if(sp.isFull() && sp.checkPuzzle()) {
				System.out.println("You Win! If you stop, enter -1! Etc Number, Start Re-game!");
				int option = s.nextInt();
				if(option == -1) {
					break;
				}
				else {
					reset(sp);
					continue;
				}
			}
			else if(sp.isFull() && !sp.checkPuzzle()) {
				System.out.println("Solved Failed! Restarting..");
				reset(sp);
			}
			
			System.out.println("Sudoku Puzzle");
			System.out.println(sp.toString() + "\n");
			
			System.out.print("Please enter row, column, value (ex. 0 0 3) (Exit -1 / Reset -2) : ");
			int row = s.nextInt();
			if(row == -1) { 
				break; 
			}
			else if(row == -2) {
				reset(sp);
				continue;
			}
			
			int col = s.nextInt();
			int val = s.nextInt();
			sp.addGuess(row, col, val);
		}
		s.close();
	}
	
	private static void reset(SudokuPuzzle sp) {
		sp.reset();
		sp.addInitial(0, 0 ,5);
		sp.addInitial(0, 1, 3);
		sp.addInitial(0, 4, 7);
		sp.addInitial(1, 0, 6);
		sp.addInitial(1, 3, 1);
		sp.addInitial(1, 4, 9);
		sp.addInitial(1, 5, 5);
		sp.addInitial(2, 1, 9);
		sp.addInitial(2, 2, 8);
		sp.addInitial(2, 7, 6);
		sp.addInitial(3, 0, 8);
		sp.addInitial(3, 4, 6);
		sp.addInitial(3, 8, 3);
		sp.addInitial(4, 0, 4);
		sp.addInitial(4, 3, 8);
		sp.addInitial(4, 5, 3);
		sp.addInitial(4, 8, 1);
		sp.addInitial(5, 0, 7);
		sp.addInitial(5, 4, 2);
		sp.addInitial(5, 8, 6);
		sp.addInitial(6, 1, 6);
		sp.addInitial(6, 6, 2);
		sp.addInitial(6, 7, 8);
		sp.addInitial(7, 3, 4);
		sp.addInitial(7, 4, 1);
		sp.addInitial(7, 5, 9);
		sp.addInitial(7, 8, 5);
		sp.addInitial(8, 4, 8);
		sp.addInitial(8, 7, 7);
		sp.addInitial(8, 8, 9);
	}
}

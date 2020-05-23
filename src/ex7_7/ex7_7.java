package ex7_7;

import java.util.Scanner;

public class ex7_7 {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TicTacToe Game!");
		
		while(true) {
			ttt.reinitialize();
			while(ttt.getWinner() == '\0') {
				ttt.display();
				System.out.print("Player " + ttt.getNowTurnPlayer() + ", Your Turn! Please Select Location (row[0-2] column[0-2], Reset -1) : ");
				int row = scanner.nextInt();
				if(row == -1) {
					ttt.reinitialize(); 
					continue;
				}
				int col = scanner.nextInt();
				
				if(!ttt.move(row, col)) {
					System.out.println("Not Valid! Please re-enter!");
				}
			}
			
			ttt.display();
			if(ttt.getWinner() != 'D') System.out.println("Winner is " + ttt.getWinner() + "!");
			else System.out.println("Draw!");
			System.out.println("Do you want play more game? If you want exit, Enter -1. or Re-start Game! : ");
			
			int g = scanner.nextInt();
			
			if(g == -1) break;
		}
		scanner.close();
	}
}

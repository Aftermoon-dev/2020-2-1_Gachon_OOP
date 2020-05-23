package ex7_7;

public class TicTacToe {
	private char[][] board = new char[3][3];
	private char turn;
	
	public TicTacToe() {
		this.turn = 'X';
	}
	
	public boolean move(int row, int column) {
		if(row <= 2 && column <= 2) {
			if(this.board[row][column] == '\0') {
				this.board[row][column] = turn;
				
				if(turn == 'X') turn = 'O';
				else turn = 'X';
				
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public void display() {
		System.out.println("\n");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if(j == 0 || j == 1) {
					System.out.print(" |");
				}
				else System.out.println();
			}
			if(i != 2) 	System.out.println("--------");
		}
		System.out.println("\n");
	}
	
	public char getNowTurnPlayer() {
		return this.turn;
	}
	
	public char getWinner() {
		char winner = '\0';
		
		if(this.board[0][0] == this.board[0][1] && this.board[0][1] == this.board[0][2]) winner = this.board[0][0];
		else if(this.board[1][0] == this.board[1][1] && this.board[1][1] == this.board[1][2]) winner = this.board[1][0];
		else if(this.board[2][0] == this.board[2][1] && this.board[2][1] == this.board[2][2]) winner = this.board[2][0];
		else if(this.board[0][0] == this.board[1][0] && this.board[1][0] == this.board[2][0]) winner = this.board[0][0];
		else if(this.board[0][1] == this.board[1][1] && this.board[1][1] == this.board[2][1]) winner = this.board[0][1];
		else if(this.board[0][2] == this.board[1][2] && this.board[1][2] == this.board[2][2]) winner = this.board[0][2];
		else if(this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) winner = this.board[0][0];
		else if(this.board[2][0] == this.board[1][1] && this.board[1][1] == this.board[0][2]) winner = this.board[2][0];
		else if(checkFull()) winner = 'D';
		
		return winner;
	}
	
	private boolean checkFull() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '\0') {
					return false;
				}
			}
		}
		
		return true;
	}

	public void reinitialize() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '\0';
			}
		
		}
		this.turn = 'X';
	}
}

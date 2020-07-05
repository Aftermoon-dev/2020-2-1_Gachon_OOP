package ex7_12;

public class SudokuPuzzle {
	private int[][] board;
	private boolean[][] start;
	
	public SudokuPuzzle() {
		board = new int[9][9];
		start = new boolean[9][9];
	}
	
	public String toString() {
		String bd = "";
		bd += "\n-------------------\n";
		for(int i = 0; i < 9; i++) {
			bd += "|";
			for(int j = 0; j < 9; j++) {
				bd += board[i][j];
				bd += "|";
			}
			bd += "\n-------------------\n";
		}
		
		return bd;
	}
	
	public void addInitial(int row, int col, int value) {
		if(0 < value && value <= 9) {
			board[row][col] = value;
			start[row][col] = true;
		}
	}
	
	public void addGuess(int row, int col, int value) {
		if(!start[row][col]) {
			if(0 < value && value <= 9) {
				if(getAllowedValues(row, col)[value-1]) {
					board[row][col] = value;
				}
				else {
					System.out.println("Not Allowed!");
				}
			}
			else {
				System.out.println("Value : 1 ~ 9");
			}
		}
		else {
			System.out.println("Location is Not Vaild!");
		}
	}
	
	public boolean checkPuzzle() {
		for(int i = 0; i < 9; i++) {
			boolean check = checkPuzzleRow(i) && checkPuzzleCol(i) && checkPuzzleSquare(i);
			if(!check) return false;
		}
		return true;
	}
	
	public int getValueIn(int row, int col) {
		return board[row][col];
	}
	
	public boolean[] getAllowedValues(int row, int col) {
		int value = board[row][col];
		boolean[] allow = new boolean[9];
		
		for(int i = 1; i < 10; i++) {
			board[row][col] = i;
			allow[i-1] = checkPuzzle();
		}
		
		board[row][col] = value;
		return allow;
	}
	
	public boolean isFull() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(this.getValueIn(i, j) == 0) return false;
			}
		}
		return true;
	}
	
	public void reset() {
		board = new int[9][9];
		start = new boolean[9][9];
	}
	
	public boolean checkPuzzleRow(int row) {
		int[] count = new int[10];
			
		for(int i = 0; i < 9; i++) {
			count[board[row][i]]++;
		}
			
		for(int j = 1; j < 10; j++) {
			if(count[j] >= 2) return false;
		}
		return true;
	}
	
	public boolean checkPuzzleCol(int col) {
		int[] count = new int[10];
			
		for(int i = 0; i < 9; i++) {
			count[board[i][col]]++;
		}
			
		for(int j = 1; j < 10; j++) {
			if(count[j] >= 2) return false;
		}
		return true;
	}
	
	public boolean checkPuzzleSquare(int sqr) {
		int[] count = new int[10];
		int r = (sqr / 3) * 3;
		int c = (sqr % 3) * 3;
			
		for(int j = 0; j < 3; j++) {
			for(int l = 0; l < 3; l++) {
				count[board[r+j][c+l]]++;
			}
		}
			
		for(int k = 1; k < 10; k++) {
			if(count[k] >= 2) return false;
		}
		return true;
	}
}
